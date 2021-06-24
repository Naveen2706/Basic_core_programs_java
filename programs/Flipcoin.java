package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Flipcoin {

	public static void main(String[] args) {
	Utility utility = new Utility();
	System.out.println("Enter number of time you want to flip");
	int numberOfFlip = utility.getIntValue();
	if(numberOfFlip <= 0) {
	System.out.println("You Entered negative number" + numberOfFlip);
	}
	else {
	utility.flipCoin(numberOfFlip);
		}
	}

}
