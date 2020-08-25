import java.util.Scanner;

public class Palindrome {

	public static void main (String args []) {

		//variables
		Scanner input = new Scanner (System.in);

		int number; 
		int length;

		//Propmt user to enter a 5-digit number
		System.out.println("Enter a valid 5-digit number:");
		number = input.nextInt();

		//Determine if the number is a 5-digit number 
		while ((Integer.toString(number).length() != 5)) {
			System.out.println("This is not a valid number.");
			System.out.println("Enter a valid 5-digit number:");
			number = input.nextInt();
		}//end of while loop

		//Check if number is a palindrome
		if (Integer.toString(number).charAt(0) == Integer.toString(number).charAt(4) && Integer.toString(number).charAt(1) == Integer.toString(number).charAt(3))
			System.out.println("This number is a palindrome.");
		else
			System.out.println("This number is not a palindrome.");

	}//end of main method 

}//end of class