import java.util.Scanner;

public class E9_Multiples {
	
	public static void main (String args []) {
		
		//Variables
		Scanner input = new Scanner (System.in);
		int firstNum;
		int secondNum;
		String answer;
		 
		do {
			
			//Prompt user to enter 2 integers
			System.out.println("Enter a pair of integers:");
			firstNum = input.nextInt();
			secondNum = input.nextInt();
			
			//Check if the quotient produces a remainder 
			if (isMultiple(firstNum, secondNum))
				System.out.printf("%d is a multiple of %d.\n" , secondNum, firstNum);
			
			else
				System.out.printf("%d is not a multiple of %d.\n" , secondNum, firstNum);
			
			System.out.println("Do you wish to continue (y/n):");
			answer = input.next();
			
			if (answer.equalsIgnoreCase("n")) {
				System.out.println("Thank you for using this program!");
			break;
			}
			
		} while (answer.equalsIgnoreCase("y"));
	}

	public static boolean isMultiple (int firstNum, int secondNum) {
		
		if (secondNum % firstNum == 0)
			return true;
		else
			return false;
		
	}
}