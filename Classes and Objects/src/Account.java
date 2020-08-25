public class Account {
	
	private double balance;		//Instance variable that stores the balance 
	
	public Account (double initialBalance) {
		setBalance(initialBalance);
		
	}
		
	private void setBalance (double initialBalance) {
		//Make sure the inital balance is greater than 0
		//If not, balance is set to default value of 0
		if (initialBalance < 0.0)
			balance = 0.0;
		else
			balance = initialBalance;
		
	}
	
	//Return the total balance in the account 
	public double getBalance() {
		return balance;
		
	}
	
	//Utility Methods (2)
	//A method to credit (add) a sum to the account 
	public void credit (double amount) {
		balance += amount;		//Adds amount to the total balance 
		
	}
	
	//A method to debit (subtract( a sum from the account 
	public void debit (double amount) {
		
		//Checks if money can be taken away from the account 
		if (amount > balance)
			System.out.println("Debit amount exceeded account balance!");
		else
		balance -= amount;		//Substracts amount from the total balance 
		
	}
}