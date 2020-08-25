public class Diamond {

	public static void main (String args []) {

		//Set Variables 
		int numspaces = 4;
		int numstars = 1;
		
		//Set up the number of rows 
		for (int rows = 1; rows <= 9; rows ++) {
			
			//Draw the spaces
			for (int spaces = 1; spaces <= numspaces; spaces ++)
				System.out.print(" ");
			
			//Draw the stars 
			for (int stars = 1; stars <= numstars; stars ++)
				System.out.print("*");
			
			//Skip to a new line each time 
			System.out.println();
			
			//Conditions 
			if (rows < 5) {
				numspaces --;
				numstars += 2;
				
			} else {
				numspaces ++;
				numstars -= 2;
				
			}//end of if - else 
			
		}//end of for loop 

	}//end of main method 

}//end of class 