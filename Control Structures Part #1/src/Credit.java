import java.util.Scanner;

public class Credit {
	
	public static void main (String args[]) {
		
		Scanner input = new Scanner (System.in);
		
		//Get account number, balance, limit, credit, and charges  
		double balance;
		double credits;
		double charges;
		double limit;
		
		String accNum;
		
		//Ask and get account number
		System.out.printf("Enter your account number:");
		accNum = input.next();
		
		System.out.printf("######%s%s%s%s \n" , accNum.charAt (6), accNum.charAt (7), accNum.charAt (8), accNum.charAt (9));
		
		//prompt user for credit and balance
		System.out.printf("Enter your balance:\n");
		balance = input.nextDouble();
		
		System.out.printf("Enter your credit limit:\n");
		limit = input.nextDouble();
		
		//While the balance is less than or equal to limit 
		while (balance <= limit) {
			
			//I - get charges and credit 
			System.out.printf("Enter your charges:\n");
			charges = input.nextDouble();
			
			System.out.printf("Enter your credits:\n");
			credits = input.nextDouble();
			
			//P - calculate the "new" balance 
			balance = balance + charges - credits; 
			
			//O - output the balance 
			System.out.printf("Your new balance is $%.2f.\n" , balance);
			
		}//end of while loop 
		
		//Display the credit limit reached message
		System.out.printf("Credit limit has been reached.\n");
		
	}//end of main method 
	
}//end of class 