import java.util.Scanner;

public class Triangle {

	public static void main (String args []) {
		
		//Variables 
		Scanner input = new Scanner (System.in);
		
		int s1, s2, s3;
		int a, b, c; 
		
		//Prompt user to enter the sides of the triangle
		System.out.println("Enter the sides of the triangle.");
		s1 = input.nextInt();
		s2 = input.nextInt();
		s3 = input.nextInt();
		
		//Determine which side is the hypotenuse 
		if (s1 > s2 && s1 > s3) {
			c = s1;
			a = s2;
			b = s3;
		} else if (s2 > s3 && s2 > s1) {
			c = s2;
			a = s3;
			b = s1;
		} else {
			c = s3;
			a = s1;
			b = s2; 
			
		}
		
		//Determine if the sides will form a triangle 
		if ((a + b) > c) {
			System.out.println("The sides form a triangle.");
		
		//Determine if the triangle is a RIGHT triangle 
		if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
			System.out.println("The triangle is a RIGHT triangle.");
		else 
			System.out.println("The triangle is not a RIGHT triangle.");
		
		} else
			System.out.println("The sides do not form a triangle.");
		
	}//end of main method 
	
}//end of class 