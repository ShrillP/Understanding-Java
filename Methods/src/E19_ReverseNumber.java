import java.util.Scanner;

public class E19_ReverseNumber {

	public static void main (String args[]) {

		//Variables
		Scanner input = new Scanner (System.in);
		int num;
		
		System.out.println("Enter a number [-1 to quit]:");
		num = input.nextInt();
		
		while (num != -1) {
			
			System.out.println("Reversed number = " + reverseInt(num));
			
			System.out.println("Enter a number [-1 to quit]:");
			num = input.nextInt();
			
			if (num == -1)
				System.out.println("Goodbye!");
		}
	}

	public static int reverseInt (int number) {

		int reverseNum = 0;
		int remainder;

		//Calculates the reverse while the number doesn't equal to zero
		while (number != 0) {

			remainder = number % 10; 					//pull out the last digit in number
			reverseNum = reverseNum * 10 + remainder; 	//changes the place value of each digit 
			number /= 10;								//pulls out the remaining digits 

		}

		return reverseNum;
	}
}