import java.util.Scanner;

public class E8_Hypotenuse {

	public static void main (String args []) {

		//Variables 
		Scanner input = new Scanner (System.in);
		double side1;
		double side2; 
		String answer;

		//Prompt user for side 1 and side 2 while they do not want to exit 
		do {

			System.out.println("Enter a value for the first side of the triangle:");
			side1 = input.nextDouble();

			System.out.println("Enter a value for the second side of the triangle:");
			side2 = input.nextDouble();

			//Display results 
			System.out.printf("The hypotenuse for your triangle is %.2f.\n" , hypotenuse (side1, side2));

			System.out.println("Do you wish to continue (y/n):");
			answer = input.next();
			
			if (answer.equalsIgnoreCase("n")) {
				System.out.println("Thank you for using this program!");
			break;
			}
			
		} while (answer.equalsIgnoreCase("y"));
	}

	public static double hypotenuse (double side1, double side2) {

		return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

	}
}