import java.util.Scanner;

public class E3_E4_RoundingNumbers {

	//Rounds to the nearest integer 
	public static int NearestInteger (double x) {
		return (int) Math.floor (x);
	}

	//Rounds to the nearest tenth
	public static double NearestTenths (double x) {
		return Math.floor (x * 10 + 0.5) / 10;
	}

	//Rounds to the nearest hundredth
	public static double NearestHundreths (double x) {
		return Math.floor (x * 100 + 0.5) / 100;
	}

	//Rounds to the nearest thousandths 
	public static double NearestThousandths (double x) {
		return Math.floor (x * 1000 + 0.5) / 1000;
	}

	//Rounds to the nearest integer
	public static void main (String args []) {

		//Variables 
		Scanner input = new Scanner (System.in);
		double num;
		int selection;

		do {
			//Prompts user to enter a number 
			System.out.println("Enter a number to round:");
			num = input.nextDouble();

			//Gives them options on what to do with the number entered 
			System.out.println("Please select one of the options below:");
			System.out.println("[1] Round to the nearest integer.");
			System.out.println("[2] Round to the nearest tenths.");
			System.out.println("[3] Round to the nearest thousandths.");
			System.out.println("[4] Round to the nearest integer.");
			System.out.println("[0] To Exit.");
			selection = input.nextInt();

			switch (selection) {

			case 1:
				System.out.println(NearestInteger(num));
				break;
				
			case 2:
				System.out.println(NearestTenths(num));
				break;
				
			case 3:
				System.out.println(NearestHundreths(num));
				break;
				
			case 4:
				System.out.println(NearestThousandths(num));
				break;

			}
			
		}while (selection != 0);
	}
}