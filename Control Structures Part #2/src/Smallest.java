import java.util.Scanner;

public class Smallest {

	public static void main (String args []) {
		
		//Variables 
		Scanner input = new Scanner (System.in);
		int amount;
		int smallest;
		int number;
		
		//Prompt user to enter the amount of values
		System.out.println("Enter the amount of numbers:");
		amount = input.nextInt();
		
		//Prompt user to enter the first number
		System.out.println("Enter the first number:");
		smallest = input.nextInt();
		
		//Get the rest of the numbers from the user
		for (int counter = 2; counter <= amount; counter ++) {
			
			//Prompt user to enter the rest of their numbers 
			System.out.println("Enter the next number:");
			number = input.nextInt();
			
			//Determine if the next number is smaller than the first 
			if (number < smallest)
				smallest = number;
			
		}//end of for loop 
		
		//Output the smallest number 
		System.out.printf("The smallest number is %d." , smallest);
		
	}//end of main method 
	
}//end of class 