import java.util.Scanner;

public class E10_EvenNumbers {

	public static void main (String args []) {

		//Variables
		Scanner input = new Scanner (System.in);
		int number;
		String answer;

		do {

			//Prompt user to enter an integer 
			System.out.println("Enter one integer:");
			number = input.nextInt();

			//Check if the quotient produces a remainder 
			if (isEven(number))
				System.out.printf("%d is an even number.\n" , number);

			else
				System.out.printf("%d is not an even number.\n" , number);
			
			System.out.println("Do you wish to continue (y/n):");
			answer = input.next();
			
			if (answer.equalsIgnoreCase("n")) {
				System.out.println("Thank you for using this program!");
			break;
			}

		} while (answer.equalsIgnoreCase("y")); 
	}

	public static boolean isEven (int number) {

		if (number % 2 == 0)
			return true;
		else 
			return false;
	}
}