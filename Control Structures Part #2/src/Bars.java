import java.util.Scanner;

public class Bars {

	public static void main (String args []) {

		//Variables
		Scanner input = new Scanner (System.in);
		int length = 0;

		//Count the number of inputs (ONLY 5)
		for (int n = 1; n <= 5; n++) {

			//Ask the user to enter a number
			do {
				System.out.println("Enter a number between 1 and 30:");
				length = input.nextInt();
			} while (length < 1 || length > 30);

			//Print the number of stars according to input
			for (int stars = 1; stars <= length; stars++)
				System.out.println("*");
				System.out.println();

		}//end of for loop 

	}//end of main method 

}//end of class