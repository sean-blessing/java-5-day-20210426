package com.bmdb.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.bmdb.business.Movie;

public class MovieDB extends BaseDB implements DAO<Movie> {

	@Override
	public Movie getById(int id) {
		Movie m = null;
		
		try {
			String sql = "SELECT * FROM movie where id = "+id;
			Statement stmt = getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				m = getMovieFromRow(rs);
			}
			else {
				System.out.println("No movie found for id: "+id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return m;
	}

	@Override
	public List<Movie> getAll() {
		List<Movie> movies = new ArrayList<>();
		try {
			String sql = "SELECT * FROM movie";
			Statement stmt = getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
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
	public boolean add(Movie t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Movie t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
