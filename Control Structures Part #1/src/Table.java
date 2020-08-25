import java.util.Scanner;

public class Table {
	
	public static void main (String args []) {
		
		Scanner input = new Scanner (System.in);
		
		int c = 0;
		int rows;
		
		//Get number of rows
		System.out.println("Enter the number of rows:");
		rows = input.nextInt();
		
		//Display table headings
		System.out.printf("N \t 10*N \t 100*N \t 1000*N \n\n");
		
		//Keep going until the counter is less than or equal to the table size 
		while (c < rows) {
			
			//Increase the counter
			c++;
			
			//Display the formated chart 
			System.out.printf("%d \t %d \t %d \t %d \n" , c, c*10, c*100, c*1000);
			
		}//while loop ends 
		
	}//end of main method 

}//end of class 