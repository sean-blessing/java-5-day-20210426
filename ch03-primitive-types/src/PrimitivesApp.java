import java.text.NumberFormat;

public class PrimitivesApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		// p.103 round
		System.out.println("round = "+Math.round(5.3456789));
		System.out.println("round = "+Math.round(5.8456789));
		// round to 2 decimal places?
		double price = 54.55555555555;
		System.out.println(price);
		price *= 100;
		System.out.println(price);
		price = Math.round(price);
		System.out.println(price);
		price = price / 100;
		System.out.println(price);
		
		price = 54.547;
		price = (double) Math.round(price*100) / 100;
		System.out.println(price);
		
		// Power
		System.out.println("2 to the 5th power:"+Math.pow(2, 5));

		// square root
		System.out.println("Square root of 20.25: "+Math.sqrt(20.25));
		
		// max/min
		System.out.println("Max:  "+Math.max(5, 7));
		System.out.println("Min:  "+Math.min(5, 7));
		
		// random
		System.out.println("Die roll:  - random # between 1 and 6");
		int dieRoll = (int)(Math.random() * 6) + 1;
		System.out.println("die roll = "+dieRoll);
		
		// p. 105 NumberFormat
		price = 54342.555555;
		System.out.println("unformatted price = "+price);
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println("formatted price = "+currency.format(price));
		
		double interestRate = .0157689;
		NumberFormat pct = NumberFormat.getPercentInstance();
		System.out.println("pct = "+pct.format(interestRate));
		// round to 3 decimal places
		pct.setMinimumFractionDigits(3);
		System.out.println("pct = "+pct.format(interestRate));
		
		
		
		
		System.out.println("Bye");

	}

}
