package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class PrimeFactors {

	public static void main(String[] args) {
		  System.out.println("Enter a number ::");
		  Utility utility = new Utility();
		  int numberToFactorize = utility.getIntValue();
		  System.out.println("Prime factors of " + numberToFactorize + " are ::");
		  for(int i = 2; i< numberToFactorize; i++) {
	         while(numberToFactorize % i == 0) {
	            System.out.println(i + " ");
	            numberToFactorize = numberToFactorize / i;
	         }
	      }
	      if(numberToFactorize > 2) {
	         System.out.println(numberToFactorize);
	      }

	}

}
