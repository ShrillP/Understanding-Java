import java.util.Scanner;

public class E7_Power {

	public static void main (String rags []) {

		Scanner input = new Scanner(System.in);

		//Variables 
		int base;
		int exponent;

		do {

			//Prompt user to enter base and exponent of power 
			System.out.println("Enter a value for the base:");
			base = input.nextInt();

			System.out.println("Enter a value for the exponent:");
			exponent = input.nextInt();

			//Output results 
			System.out.println("The answer is " + integerPower (base, exponent));

		} while (exponent >= 0);
	}

	public static int integerPower (int base, int exponent) {

		int base1 = 1;

		for (int x = 1; x <= exponent; x++) 
			base1 *= base;

		return base1;
	}

}