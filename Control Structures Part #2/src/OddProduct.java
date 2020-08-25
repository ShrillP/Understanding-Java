import java.util.Scanner;

public class OddProduct {

	public static void main (String args []) {

		//Variables 
		int product = 1;

		//Calculate the product of add number from 1 to 15
		for (int counter = 1; counter <= 15; counter += 2) 
			product *= counter;

			//Output Results 
			System.out.printf("The product of all the odd integers from 1-15 is: %d" , product);

	}//end of main method 

}//end of class 