package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class EvenOrOddCheck {

	public static void main(String[] args) {
	Utility utility = new Utility();
	System.out.println("Enter the number to be checked ::");
	int numberToCheck = utility.getIntValue();
	
    if(numberToCheck % 2 == 0)
		System.out.println("The entered number is even");
	else
		System.out.println("The Entered number is odd");

	}

}
