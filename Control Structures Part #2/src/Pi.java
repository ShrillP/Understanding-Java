import java.util.Scanner;

public class Pi {
	
	public static void main(String[]args){
		
		//Variables 
		double pi = 0;
		int denominator = 1;
		int terms = 0;
		int coefficient = 1;
		
		//
		while (Math.abs(pi-3.14) > 0.005) {
			terms ++;
			pi += (double) coefficient * 4 / denominator;
			
			coefficient *= -1;
			denominator += 2;
			
		}//end of while loop 
		
		System.out.printf("The approximation of PI is %f at %d amount of terms.\n" , pi , terms);
	
	}//end of main method 

}//end of class 