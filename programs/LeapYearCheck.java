package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class LeapYearCheck {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the year you want to check");
		int YearToCheck = utility.getIntValue();    // year to be checked
		utility.getLeapYearStatus(YearToCheck);
		}
	}

