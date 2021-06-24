package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		   int dividend, divisor, quotient, remainder;
		   Utility utility = new Utility();
		   System.out.print("Enter Dividend:");
	        dividend = utility.getIntValue();		//divident entered
	        System.out.print("Enter Divisor:");
	        divisor = utility.getIntValue();		//divisor entered
	        quotient = dividend / divisor;			//quotient calculated
	        remainder = dividend % divisor;			//remainder calculated
	        System.out.println("Quotient: " + quotient);
	        System.out.println("Remainder: " + remainder);

	}

}
