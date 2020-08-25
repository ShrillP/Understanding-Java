import java.util.Scanner; 

public class Compound3 {
	
	public static void main (String args[]) {
		
		//Variables 
		double amount; //amount deposited at the end of each year 
		double principal = 100000; //initial amount before interest 
		double rate = 0.05; //interest rate
		int dollars; 
		int cents; 
		
		//Display the Headers 
		System.out.printf("%s%20s\n" , "Year" , "Amount on Deposit");
		
		//Calculate amount on deposit for each of the ten years 
		for (int year = 1; year <= 10; year ++) {
			
			//Calculate new amount for specified year
			amount = principal * Math.pow(1.0 + rate, year);
			
			//Seperating the cents 
			cents = (int) (amount % 100);
			
			//Seperating the dollars
			dollars = (int) (amount / 100);
			
			//Display the year and amount 
			System.out.printf("%4d%,17d.%02d\n" , year , dollars, cents);
			
		}//end of for loop 
		
	}//end of main method 

}//end of class 
