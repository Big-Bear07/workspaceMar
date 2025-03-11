//Tripp 3/3 - Ch.7 Assignment 1

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		System.out.print("Enter a String >> ");
		Scanner userInput = new Scanner(System.in);
		String userString = userInput.nextLine();
		int wordCount = 0;
		boolean previousIsLetter = false;
		char aChar;
		
		for (int position = 0; position < userString.length(); position++) {
			aChar = userString.charAt(position);
			if (Character.isLetter(aChar) && previousIsLetter == false) {
				wordCount ++;
				previousIsLetter = true;
			}
			else if (Character.isLetter(aChar)){
				previousIsLetter = true;
			}
			else {
				previousIsLetter = false;
			}
			
		}
			
		System.out.println("There are "+wordCount+" words in the string.");

	}

}
