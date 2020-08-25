import java.util.Scanner;

public class Chromosomes {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		//Variables 
		int size;

		//Prompt user for size 
		do {
			
			System.out.println("Enter a number (1-19):");
			size = input.nextInt();

			//Check if entry is valid 
			if (size < 5 || size %2 == 0)
				System.out.println("Invalid Entry! Enter a number (1-8):");

		} while (size < 5 || size %2 == 0);

		//Set up values 
		int outerspaces = size - 1;

		//Draw the rows 
		for (int a = 0; a < size; a ++) {

			//Draw the outer spaces
			for (int b = 1; b <= outerspaces; b ++)
				System.out.print(" ");

			//Draw the left star 
			System.out.print("*");
			
			//Next Line 
			System.out.println();

			//Adjust values 
			if (a < size/2) {
				outerspaces ++;

			} else {
				outerspaces --;

			}//end of if - else statement 

		}//end of for loop 

	}//end of main method 

}//end of class