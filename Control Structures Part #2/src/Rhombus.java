public class Rhombus {
	
	public static void main (String ags []) {
		 
		//Set values 
		int leftspaces = 4;
		int stars = 5;
		int insidespaces = 0;
		
		//Draw the Rows 
		for (int rows = 1; rows <= 5; rows++) {
			
			//Draw the Spaces 
			for (int sc = 1; sc <= leftspaces; sc++)
				System.out.print(" ");
			
			//Draw the Stars
			for (int stc = 1; stc <= stars; stc++)
				System.out.print("* ");
	
			//Skip to new line each time 
			System.out.println();
			
			//Conditions 
			leftspaces --;
			
		}//end of for loop 
	
	}//end of main method 

}//end of class 