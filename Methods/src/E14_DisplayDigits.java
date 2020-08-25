import java.util.Scanner;

public class E14_DisplayDigits {

	public static void main (String args []) {

		//Variables 
		Scanner input = new Scanner (System.in);
		int number;

		do {

			//Prompt user to enter a number 
			System.out.println("Enter an integer (0 to exit):");
			number = input.nextInt();

			if (number <= 99999 && number >= 1) 
				displayDigits (number);

			if (number > 99999 && number < 1) 
				System.out.println("Invalid Number!");
			System.out.println();

			if (number == 0)
				System.out.println("Thank you!");

		} while (number != 0);
	}

	//Calculates the quotient 
	public static int integer (int a, int b) {
		return a/b;

	}

	//Calculates the remainder
	public static int remainder (int a, int b) {
		return a % b;

	}

	public static void displayDigits (int number) {

		//Variables 
		int d1, d2, d3, d4, d5;

		//Separate each digit 
		d5 = remainder (number, 10);
		number = integer (number, 10);

		d4 = remainder (number, 10);
		number = integer (number, 10);

		d3 = remainder (number, 10);
		number = integer (number, 10);

		d2 = remainder (number, 10);
		number = integer (number, 10);

		d1 = number;

		System.out.printf("%d  %d  %d  %d  %d" ,d1, d2, d3, d4, d5 );

	}
}