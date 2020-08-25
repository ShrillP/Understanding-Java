import java.util.Scanner;
	
public class Square {
	
	public static void main (String args []) {
		
		Scanner input = new Scanner (System.in);
		
		int numStars = 0;
		int size;
		
		//Get the number of stars wanted by the user
		System.out.println("Enter the number of stars please:");
		size = input.nextInt();
		
		//Draw the top part of the square first 
		//Print the stars in the first row 
		while (numStars < size) {
			numStars ++;
			System.out.printf("* ");
		}//end of while loop
		
		//Skip to the next line
		System.out.printf("\n");
		
		//Draw the middle portion of the square 
		numStars = 0;
		while (numStars < size-2) {
			numStars ++;
		
		//Print the leftmost star first with an extra space (font is very small)
		System.out.printf("* ");
		
		//Print the middle spaces
		int spaces = 0;
		while (spaces < size-2) {
			spaces ++;
			System.out.printf("  "); //extra space since font is narrow
		}//end of while loop 
		
		//Print the rightmost star and a new line 
		System.out.printf("*\n");
	}
		//Draw the last part of the square
		numStars = 0;
		while (numStars < size) {
			numStars ++;
			System.out.printf("* ");
		}//end of while loop
		
	}//end of main method 

}//end of class 