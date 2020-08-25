import java.util.Scanner;

public class Practice {
	
	public static void main (String args []) {
		
		//variables 
		Scanner input = new Scanner (System.in);
		int tries = 4;
		String password;
		
		//1. Enter Password
		System.out.println("Enter your password:");
		password = input.next();
		
		//2. If password is valid
		if (password.equals ("seasaw"))
	
			//2.1 Give a welcome message 
			System.out.println("Welcome! Hope you have a great day!");
		
		//3. Otherwise 
		else {
			
			//3.1 Give a warning message 
			System.out.println("Invalid password you fool!");
			
			//3.2 Let user re-enter up to 3 times
			while (tries > 0 && password.equals("seasaw") == false) {
				
				System.out.printf("Please re-enter your password - you have %d tries left.\n" , tries);
				password = input.next();
				tries --;
				
			} 
			
			//3.2.1 If still invalid then give a locked out message
			if (password.equals ("seasaw"))
				System.out.println("What took you so long dumbo!!!!");
			else 
				System.out.println("Your account is FROZEN! Good job :(:(");
			
		}//end of else statement 
			
	}//end of main method

}//end of class