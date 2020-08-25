import java.util.Scanner;

public class E16_FloatingNUmbers {
	
	public static void main (String args []) {
		
		//Variables 
		Scanner input = new Scanner (System.in);
		float a;
		float b;
		float c;
		
		//Prompt user to enter 3 numbers 
		System.out.println("Enter any 3 numbers:");
		a = input.nextFloat();
		b = input.nextFloat();
		c = input.nextFloat();
		
		//Output the smallest number 
		System.out.println("The smallest number is " + minimum3(a , b, c));
		
	}

	public static float minimum3 (float a, float b, float c) {
		
		float minimum;
		
		minimum = Math.min(Math.min(a, b), c);
		
		return minimum;
		
	}
	
}
