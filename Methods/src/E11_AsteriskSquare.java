import java.util.Scanner;

public class E11_AsteriskSquare {
	
	public static void main (String args []) {
		
		//Variables
		Scanner input = new Scanner (System.in);
		int side;
		
		//Prompt user to enter the dimension of the square 
		System.out.println("Enter the length of your square:");
		side = input.nextInt();
		
		//Output the square 
		squareOfAsterisks (side);
		
	}
	
	public static void squareOfAsterisks (int side) {
		
		//Draw the rows 
		for (int rows = 1; rows <= side; rows++) {
			
			//Draw the columns 
			for (int columns = 1; columns <= side; columns++)
				System.out.print("* ");
				System.out.println();
		}	
	}
}
