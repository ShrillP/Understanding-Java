import java.util.Scanner;

public class AccountTest {

	public static void main (String args []) {

		//Create Scanner for user input 
		Scanner input = new Scanner (System.in);
		double deposit;
		double withdraw; 
 
		Account account1 = new Account(1500.00);		//Creates Account object
		Account account2 = new Account(-175.00);		//Creates Account object

		//Show the user the inital balance in each account 
		System.out.printf("Account #1 Balance = $%.2f\n" , account1.getBalance());
		System.out.printf("Account #2 Balance = $%.2f\n" , account2.getBalance());

		//Prompts user to enter a deposit for each account 
		System.out.print("Enter a deposit ammount for ACCOUNT #1: ");
		deposit = input.nextDouble();
		System.out.printf("\nAdding $%.2f to ACCOUNT #1 Balance\n\n" , deposit);
		account1.credit(deposit);

		System.out.print("Enter a deposit ammount for ACCOUNT #2: ");
		deposit = input.nextDouble();
		System.out.printf("\nAdding $%.2f to ACCOUNT #2 Balance\n\n" , deposit);
		account2.credit(deposit);

		//Display the updated balances for both accounts 
		System.out.printf("ACCOUNT #1 Balance = $%.2f\n" , account1.getBalance());
		System.out.printf("ACCOUNT #2 Balance = $%.2f\n" , account2.getBalance());

		//Prompts user to enter a withdrawal for each account 
		System.out.print("Enter a withdrawal ammount for ACCOUNT #1: ");
		withdraw = input.nextDouble();
		System.out.printf("\nSubtracting $%.2f from ACCOUNT #1 Balance\n\n" , withdraw);
		account1.debit(withdraw);

		System.out.print("Enter a withdrawal ammount for ACCOUNT #2: ");
		withdraw = input.nextDouble();
		System.out.printf("\nSubtracting $%.2f from ACCOUNT #2 Balance\n\n" , withdraw);
		account2.debit(withdraw);

		//Display the updated balances for both accounts 
		System.out.printf("ACCOUNT #1 Balance = $%.2f\n" , account1.getBalance());
		System.out.printf("ACCOUNT #2 Balance = $%.2f\n" , account2.getBalance());

		//Close input 
		input.close();
		
	}
}