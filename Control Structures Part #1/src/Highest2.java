import java.util.Scanner;

public class Highest2 {
	
	public static void main (String args []) {
		
		Scanner input = new Scanner (System.in);
		
		int counter = 0;
		int number;
		int highest; 
		int secondhighest = 0;
		
		//Enter fist number and set it as the highest number 
		System.out.println("Enter 10 integer:");
		number = input.nextInt();
		highest = secondhighest;
		
		number = input.nextInt();
		
		//If the number is greater than the highest number then set the number to the highest number
		if (number > highest)
			highest = number;
		
		//Otherwise
		else
			
			//Set the number to the second highest 
			secondhighest = number; 
		
		//Enter next number and if it is greater than first number, it becomes highest value
		while (counter < 8) {
		number = input.nextInt();
		
		//if the number is greater than the second highest number then 
		if (number > secondhighest) {
			
			//if the number is higher than the current number then 
			if (number > highest) {
			
				//Set the second highest to the current highest 
				//Set the highest number to the current number 
				secondhighest = highest;
				highest = number;
				
		}
		
			//Otherwise
			else 
				
				//Set the second highest number to the current number 
				secondhighest = number; 
			}
		
		//Place a counter to make sure only 10 numbers are entered
		counter ++;
		
		}//end of while loop 
		
		//Display highest number 
		System.out.printf("The highest number is %d.\n" , highest);
		System.out.printf("The second highest number is %d.\n" , secondhighest);
		
	}//end of main method 

}//end of class 