import java.util.Scanner;

public class PythagoreanTriples {
	
	public static void main (String args []) {
		
		//Declare Variables 
		int side1;
		int side2;
		int hyp;
	
			//Write loop for side 1 to try values from 1 - 500
			for (side1 = 1; side1 <= 500; side1 ++)
		
				//Write loop for side 2 to try values from 1 - 500
				for (side2 = 1; side2 <= 500; side2 ++)
					
					//Write loop for side 3 to try values 1 - 500
					for (hyp = 1; hyp <= 500; hyp ++)
		
						//Determine if the the sides form a triangle and output results
						if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(hyp, 2))
							System.out.printf("s1: %d, s2: %d, hyp: %d\n" , side1 , side2 , hyp);
				 
	}//end of main method 

}//end of class 
