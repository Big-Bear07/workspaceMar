//Tripp 3/3 - Ch.7 Assignment 2

import java.util.Scanner;

public class AlphabeticalStrings {

	public static void main(String[] args) {
		String firstString;
		String secondString;
		String thirdString;
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter your first string: ");
		String string1 = userInput.nextLine();
		System.out.print("Enter your second string: ");
		String string2 = userInput.nextLine();
		System.out.print("Enter your thrid string: ");
		String string3 = userInput.nextLine();
		
		if(string1.compareToIgnoreCase(string2) < 0 && string1.compareToIgnoreCase(string3) < 0){
			firstString = string1;
			if(string2.compareToIgnoreCase(string3) < 0){
				secondString = string2;
				thirdString = string3;
				System.out.println("You entered the strings in alphabetical order.");
				System.out.println("Here are your strings in alphabetical order: "+firstString+", "+secondString+", "+thirdString);
			}
			else {
				secondString = string3;
				thirdString = string2;
				System.out.println("You did not enter the words in alphabetical order.");
				System.out.println("Here are your strings in alphabetical order: "+firstString+", "+secondString+", "+thirdString);
			}
		}
		if(string2.compareToIgnoreCase(string1) < 0 && string2.compareToIgnoreCase(string3) < 0){
			firstString = string2;
			if(string1.compareToIgnoreCase(string3) < 0){
				secondString = string1;
				thirdString = string3;
				System.out.println("You did not enter the words in alphabetical order.");
				System.out.println("Here are your strings in alphabetical order: "+firstString+", "+secondString+", "+thirdString);
			}
			else {
				secondString = string3;
				thirdString = string1;
				System.out.println("You did not enter the words in alphabetical order.");
				System.out.println("Here are your strings in alphabetical order: "+firstString+", "+secondString+", "+thirdString);
			}
		}
		if(string3.compareToIgnoreCase(string1) < 0 && string3.compareToIgnoreCase(string2) < 0){
			firstString = string3;
			if(string1.compareToIgnoreCase(string2) < 0){
				secondString = string1;
				thirdString = string2;
				System.out.println("You did not enter the words in alphabetical order.");
				System.out.println("Here are your strings in alphabetical order: "+firstString+", "+secondString+", "+thirdString);
			}
			else {
				secondString = string2;
				thirdString = string1;
				System.out.println("You did not enter the words in alphabetical order.");
				System.out.println("Here are your strings in alphabetical order: "+firstString+", "+secondString+", "+thirdString);
			}
		}	
	}
}
