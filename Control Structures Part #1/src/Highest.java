import java.util.Scanner;

public class Highest {
	
	public static void main (String args []) {
		
		Scanner input = new Scanner (System.in);
		
		int counter = 0;
		int number;
		int highest;
		
		//Enter fist number and set it as the highest number 
		System.out.println("Enter 10 integer:");
		number = input.nextInt();
		highest = number;
		
		//Enter next number and if it is greater than first number, it becomes highest value
		while (counter < 8) {
		number = input.nextInt();
		
		//if number is greater than the highest, switch that number to the highest
		if (number > highest)
			highest = number;
	
		//Place a counter to make sure only 10 numbers are entered
		counter ++;
		
		}//end of while loop 
		
		//Display highest number 
		System.out.printf("The highest number is %d." , highest);
		
	}//end of main method 

}//end of class 
