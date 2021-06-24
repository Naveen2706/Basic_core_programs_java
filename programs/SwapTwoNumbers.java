package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		 Utility utility = new Utility();
		 System.out.println("Enter first number ::");
		int firstNumber = utility.getIntValue();
		 System.out.println("Enter second number ::");
		 int secondNumber = utility.getIntValue();
		 System.out.println("Number before swap are ::" + firstNumber + " and " + secondNumber);
		int tempNumber;
		 tempNumber = firstNumber;
		 firstNumber = secondNumber;
		 secondNumber = tempNumber;
		 System.out.println("Number after swap are ::" + firstNumber + " and " + secondNumber);
	}

}
