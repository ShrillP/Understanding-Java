import java.util.Scanner;

public class Compound2 {

	public static void main (String args[]) {

		//Variables 
		double amount;
		double pricipal = 1000;
		double rate;

		//Display the chart headers 
		System.out.printf("Rate \t\t Years \t\t Amount on Deposit \n\n");

		//Calculate the amount on deposit each year 
		for (rate = 0.05; rate <= 0.1; rate += 0.01 ) {

			for (int year = 1; year <= 10; year++) {

				amount = pricipal * Math.pow(1.0 + rate, year);

				//Display the results
				System.out.printf("%.2f \t\t %d \t\t %.2f \n" , rate, year, amount);

			}//end of nested for loop

		}//end of for loop

	}//end of main method 

}//end of class