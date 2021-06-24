package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class VowelOrConsonantCheck {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the Character to be checked ::");
        char chToCheck = utility.getCharValue();
        if(chToCheck =='a' || chToCheck =='e' || chToCheck =='i' || chToCheck =='o' || chToCheck =='u'|| chToCheck =='A' || chToCheck =='E' || chToCheck =='I' || chToCheck =='O' || chToCheck =='U')
        	System.out.println("The entered character is a vowel");
        else
        	System.out.println("The entered character is not a vowel");
	}

}
