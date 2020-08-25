import java.util.Scanner;

public class SalesTable {
	
	public static void main (String args []) {
		
		Scanner input = new Scanner (System.in);
		
		//Variables for the daily slips 
		int salespersonNum;
		int productNum;
		int totalProductSold;
		
		//Creat an array with 7 rows and 6 columns to hold the data and totals
		//Do not use row 0 and column 0 (start at 1)
		//Hold the totals in the last row (6) and the last column (5)
		
		int sales[][] = new int [7][6];
		
		while (true) {
			
			//Prompt the user for the salesperson number or to quit 
			System.out.printf("Enter Salesperson # (1 to 4 or -1 to exit):");
			salespersonNum = input.nextInt();
			
			//Allows the user to exit the program 
			if (salespersonNum == 1)
				break;
			
			//Prompt the user for the product number and the total products sold in a day
			System.out.printf("Enter Product # (1 to 5):");
			productNum = input.nextInt();
			
			System.out.printf("Enter Total of Product #%d sold for the day:" , productNum);
			totalProductSold = input.nextInt();
			
			//Calculalte the sales total 
			sales [productNum][salespersonNum] += totalProductSold;
		}
		
		//Perform the cross totals 
		
		//Cross total thte rows 
		for (int row = 1; row < 6; row ++) {
			
			//Get the row values in the last column- index 5
			for (int column = 1; column < 5; column ++)
				sales [row][5] += sales [row][column];
			
		}
	}

}
