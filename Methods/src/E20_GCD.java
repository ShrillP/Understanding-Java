import java.util.Scanner;

public class E20_GCD {
	
	public static void main (String args []) {
		
		//Variables 
		Scanner input = new Scanner (System.in);
		int num1, num2;
		
		//Prompt user to enter the first number 
		System.out.println("Enter the first number [-1 to quit]:");
		num1 = input.nextInt();
		
		//While they do not want to quit 
		while (num1 != -1) {
			
			System.out.println("Enter the second number:");
			num2 = input.nextInt();
			
			System.out.printf("GCD is: %d\n" , gcd (num1, num2));
	
			System.out.println("Enter the first number [-1 to quit]:");
			num1 = input.nextInt();
			
			if (num1 == -1)
				System.out.println("Goodbye!");
		}
	}
	
	public static int gcd (int x, int y) {
		
		int mod; //remainder of x/y get stored in this variable 
		
		while (y != 0) {
			
			mod = x % y;
			x = y;
			y = mod; 
		}
		
		return x; 
		
	}
}