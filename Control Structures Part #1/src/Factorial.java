import java.util.Scanner;

public class Factorial {

	public static void main (String args []) {

		//Variables 
		Scanner input = new Scanner (System.in);

		int number;
		int counter;
		int answer;

		//Prompt user to enter a number to calculate 
		System.out.println("Enter a number:");
		number = input.nextInt();
		
		answer = number;

		//Loop this until number = 1
		while (number > 1) {
			number -= 1;
			answer *= number; 
		}//end of while loop 

		//Display the final answer 
		System.out.printf("The factorial is %d." , answer);

	}//end of main method 

}//end of class 
