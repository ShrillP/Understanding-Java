import java.util.Scanner;

public class Binary2 {
	
	public static void main (String args []) {
		
		//variables 
		Scanner input = new Scanner (System.in);
		int digit;
		int decAnswer = 0;
		int in;
		int power = 0;
		
		//Prompt user to enter a binary number
		System.out.println("Enter a binary number please:");
		in = input.nextInt();
		
		//Repeat process while the binary number is greater than zero 
		while (in > 0) {
			
			digit = in % 10;
			
			while (digit > 1) {
				System.out.println("Enter a new number.");
				in = input.nextInt();
				digit = in % 10;
				
			}//end of nested while loop
			
			decAnswer +=  digit * (int)(Math.pow(2, power));
			power ++;
			in /= 10;
			
		}//end of while loop 
		
		//Display the decimal number 
		System.out.printf("Deciamal Number: %d" , decAnswer);
		
	}//end of main method 

}//end of class