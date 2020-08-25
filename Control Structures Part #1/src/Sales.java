import java.util.Scanner;

public class Sales {

	public static void main (String args []) {
		
		Scanner input = new Scanner (System.in);
		
		//Set product number, number sold, and total amount sold to zero
		int productNum = 0;
		int numSold = 0;
		double totalSold = 0;
		
		String answer; //used to continue the loop
		
		//Run the program until the user wants to end it 
		do {
			
			//I - prompt user for product number and amounts sold
			System.out.println("Enter the products that were sold (1-4):");
			productNum = input.nextInt();
			
			System.out.println("Enter the amount of products sold:");
			numSold = input.nextInt();
			
			//P - add to the total based on the product number 
			if (productNum == 1) 
				totalSold += 239.99 * numSold;
			
			else if (productNum == 2) 
				totalSold += 129.75 * numSold;
			
			else if (productNum == 3)
				totalSold += 99.95 * numSold;
			
			else if (productNum == 4)
				totalSold += 350.89 * numSold;
			
			//O - determine if the user want to create more entries
			System.out.println("Do you wish to continue (yes/no):");
			answer = input.next();
			
		} while (answer.equals("yes"));
		
		//display the total earning for salesperson 
		System.out.printf("The total earnings is $%.2f." , totalSold*0.09 + 200);
	}//end of main method
	
}//end of class