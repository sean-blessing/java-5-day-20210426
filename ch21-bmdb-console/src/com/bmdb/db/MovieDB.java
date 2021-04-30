package com.bmdb.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.bmdb.business.Movie;

public class MovieDB extends BaseDB implements DAO<Movie> {

	@Override
	public Movie getById(int id) {
		// p. 689
		Movie m = null;

		String sql = "SELECT * FROM movie where id = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				m = getMovieFromRow(rs);
			} else {
				System.out.println("No movie found for id: " + id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return m;
	}

	@Override
	public List<Movie> getAll() {
		// p. 689
		List<Movie> movies = new ArrayList<>();
		String sql = "SELECT * FROM movie";
		try (PreparedStatement ps = getConnection().prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				Movie m = getMovieFromRow(rs);
				movies.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movies;
	}

	private Movie getMovieFromRow(ResultSet rs) throws SQLException {
		// process one row of the table
		int id = rs.getInt(1);
		String title = rs.getString(2);
		int year = rs.getInt(3);
		String rating = rs.getString(4);
		String director = rs.getString(5);
		Movie m = new Movie(id, title, year, rating, director);
		return m;
	}

	@Override
	public boolean add(Movie m) {
		boolean success = false;
		// p. 691
		String sql = "insert into movie (title, year, rating, director)" + " values (?, ?, ?, ?)";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, m.getTitle());
			ps.setInt(2, m.getYear());
			ps.setString(3, m.getRating());
			ps.setString(4, m.getDirector());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean update(Movie t) {
		// p. 691
		// not yet implemented - too clunky in a console app!
		return false;
	}

	@Override
	public boolean delete(int id) {
		// p. 691
		// our delete is different from book, we delete by id
		boolean success = false;

		String sql = "delete from movie where id = ?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return success;
	}

}
