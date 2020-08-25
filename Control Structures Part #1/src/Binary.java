import java.util.Scanner;

public class Binary {
	
	public static void main (String args []) {
		
		//variables 
		Scanner input = new Scanner (System.in);
		
		//variables
		String binary;
		
		//Prompt user to enter a binary line
		System.out.println("Enter a binary line please:");
		binary = input.next();
		
		//Display the binary conversion to decimal
		System.out.println("Decimal number is: " + Integer.parseInt(binary , 2));
		
	}//end of main method 

}//end of class 