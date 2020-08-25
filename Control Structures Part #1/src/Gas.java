import java.util.Scanner;

public class Gas {

	public static void main (String args []) {
		
		Scanner input = new Scanner (System.in);
		
		int km = 0; 					//Set kilometers to zero 
		int liters = 0;				//Set liters to zero 
		int totalkm = 0;				//Set total kilometers to zero
		int totalliters = 0;			//Set total liters to zero 
		
		int answer = 1; 				//Set sentinel to 1 to start 
		
		//While sentinel is true (1)
		while (answer == 1) {
			
			//I - prompt user for kilometers driven and liters used
			System.out.printf("Enter the kilometers driven:\n");
			km = input.nextInt();
			System.out.println("Enter the liters used:");
			liters = input.nextInt();
			
			//Display the km/liter
			//P - calculate kilometers per liter, total kilometers, and total liters
			System.out.printf("The km/liter used was %.2f.\n" , (double) km/liters);
			totalkm = totalkm + km;
			totalliters = totalliters + liters;
			
			//Prompt user to enter a sentinel value  
			System.out.printf("Enter [1] to continue and [2] to end: ");
			answer = input.nextInt();
			
		}//end of while loop
		
		//Calculate and display km/liter
		System.out.printf("The total km/liter used was %.2f.\n" , (double) totalkm/totalliters);
		
	}//end of main method 
	
}//end of class
