import java.util.Scanner;

public class E2_ParkingGarage {
	
	public static double calculateCharges (double hours) {
		
		double charges = 0;
		
		//If hours is less than or equal to 3
		if (hours <= 3)
			charges = 2.00;
		
		//Otherwise 
		else
			//Add initial fee to the part thereof and its price 
			charges = 2.00 + Math.ceil(hours - 3) * 0.05;
		
		//If charges exceed 10.00
		if (charges > 10.00)
			charges = 10.00;
		
		//Return the charges 
		return charges;
	
	}
	
	public static void main (String args []) {
		
		//Variables
		Scanner input = new Scanner (System.in);
		double hours = 0;
		double charges = 0;
		double totalcharges = 0;
		String answer;

		//Keep calculating until answer equals "yes"
		do {
			//Prompt user to enter hours parked
			System.out.println("Enter the hours you parked for:");
			hours = input.nextDouble();
			
			//Calculate the charges 
			charges = calculateCharges(hours);
			
			//Add this to the total charges 
			totalcharges += charges;
			
			//Ask if there are other customer left 
			System.out.println("Are there other customer left (yes/no):");
			answer = input.next();
			
		} while (answer.equalsIgnoreCase("yes"));
		
		//If there are no more customers left, display results 
		System.out.printf("The total charges are $%.2f." , totalcharges);
		
	}
	
}