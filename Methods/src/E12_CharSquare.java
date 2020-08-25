import java.util.Scanner;

public class E12_CharSquare {

	public static void main (String args []) {

		//Variables
		Scanner input = new Scanner (System.in);
		int side;
		char fillCharacter;

		//Prompt user to enter the dimension of the square 
		System.out.println("Enter the length of your square:");
		side = input.nextInt();
		
		//Ask user what they want the square to be made from 
		System.out.println("Enter the character to be used to make your square:");
		fillCharacter = input.next().charAt(0);

		//Output the square 
		squareOfAsterisks (side, fillCharacter);

	}

	public static void squareOfAsterisks (int side, char fillCharacter) {

		//Draw the rows 
		for (int rows = 1; rows <= side; rows++) {

			//Draw the columns 
			for (int columns = 1; columns <= side; columns++)
				System.out.print(fillCharacter);
			System.out.println();
		}	
	}
}