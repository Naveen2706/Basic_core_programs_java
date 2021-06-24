package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		double sum = 0,NthHarmonicNum,i;
		Utility utility = new Utility();
		System.out.println("Please Enter the value of N:= ");
		NthHarmonicNum = utility.getIntValue(); 
		for(i = 1;i <= NthHarmonicNum;i++)
		{
			sum=sum + (1/i);
			if(i == 1)
				System.out.println("1 + ");
			else
				System.out.println("1/ " + i);
		}
		System.out.println();
		System.out.println("THE SUM OF THIS SERIES IS:=" + sum);

	}

}
