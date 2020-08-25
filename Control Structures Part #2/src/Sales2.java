import java.util.Scanner;

public class Sales2 {

	public static void main (String args []) {

		//Variables
		Scanner input = new Scanner (System.in);
		int productNum = 0;
		int numSold;
		double total = 0;
		int answer = 6;

		//Use a sentinel control loop to determine when user wants to quit
		while (answer == 6) {

			//Prompt user to enter product number and amount sold
			System.out.println("Enter the products that were sold (1-5):");
			productNum = input.nextInt();

			System.out.println("Enter the amount of products sold:");
			numSold = input.nextInt();

			switch (productNum) {
			case 1: 
				total += 2.98 * numSold;
				break;
			case 2: 
				total += 4.50 * numSold;
				break;
			case 3: 
				total += 9.98 * numSold;
				break;
			case 4: 
				total += 4.49 * numSold;
				break;
			case 5: 
				total += 6.87 * numSold;
				break;

			}//end of switch loop

			System.out.println("Do you wish to continue [6] yes / [7] no):");
			answer = input.nextInt();

		}//end of while loop

		System.out.printf("The total retail value of all the products sold: $%.2f" , total);

	}//end of main method 

}//end of class 