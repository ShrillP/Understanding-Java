import java.util.Scanner;

public class Factorial2 {

	public static void main (String args []) {

		//Variables 
		int factorial = 1;

		//Display the table headings 
		System.out.printf("Num:\t Results:\n");
		
		//Loops until it calculates the factorials from 1-5
		for (int x = 1; x <= 20; x++) {    
			factorial *= x;	
			
			//Display the results
			System.out.printf("%d \t %d \n" , x, factorial);
			
		}//end of for loop
		
	}//end of main method 

}//end of class 