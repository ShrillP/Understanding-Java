public class Triangle2 {

	public static void main (String args []) {
		
		//Variables 
		int outerstars = 1;
		int outerspaces = 9;
		int middlestars = 10;
		int middlespaces = 0;
		
		//
		for (int row = 1; row <= 10; row++) {
			
			//Draw the outer most triangle (LEFT)
			for (int star = 1; star <= outerstars; star++)
				System.out.print("*");
			
			//Draw the outer spaces (LEFT)
			for (int space = 1; space <= outerspaces ;space ++)
				System.out.print(" ");
			
			//Draw the middle stars (LEFT)
			for (int star = 1; star <= middlestars ;star ++)
				System.out.print("*");
			
			//Draw the middle spaces 
			for (int spaces = 1; spaces <= middlespaces ;spaces ++)
				System.out.print(" ");
			
			//Draw the middle stars (RIGHT)
			for (int stars = 1; stars <= middlestars ;stars ++)
				System.out.print("*");
			
			//Draw the outer spaces (RIGHT)
			for (int spaces = 1; spaces <= outerspaces ;spaces ++)
				System.out.print(" ");
			
			//Draw the outer stars (RIGHT)
			for (int stars = 1; stars <= outerstars ;stars ++)
				System.out.print("*");
			
			//Prints the stars on a new line each time 
			System.out.println();
			
			//Conditions for the variables 
			outerstars ++;
			outerspaces --;
			middlestars --;
			middlespaces += 2;
	
		}//end of nested for loops 

	}//end of main method

}//end of class 