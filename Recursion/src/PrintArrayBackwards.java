package Recursion;

import java.util.Scanner;

public class PrintArrayBackwards {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a string: ");
		String word = input.nextLine();
		
		char[] characters = word.toCharArray();
		
		printArrayBackwards(characters, word.length() - 1);
		
	}

	public static void printArrayBackwards (char[] characters, int index) {
	
		System.out.print(characters[index] + " ");
		
		if (index > 0)
			printArrayBackwards(characters, --index);
		
	}
}