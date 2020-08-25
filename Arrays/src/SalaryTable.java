import java.util.Scanner;

public class SalaryTable {

	public static void main (String args []) {

		Scanner input = new Scanner (System.in);		//user input

		double sales;		//how much did each person sell 
		double salary;		//how much each person earns (same)
		int [] salaryCount = new int [11];		//this array hold each salary category count 
												//**not using index 0 and 1**
		String answer;		//used to exit loop 

		//Get salaries of different salespeople 
		do {

			//Prompts user for sales amount 
			System.out.println("How much did you sell?");
			sales = input.nextDouble();

			//Calculate salary with commision 
			salary = 200 + 0.9 * sales;

			//If user's salary falls in the highest category
			if (salary >= 1000)
				++salaryCount[10];
			else 
				++salaryCount[(int) (salary / 100)];		//imcrements the matching element 
														//must be a whole number 

			//Prompts user for more salespeople
			System.out.println("Are there any more employees (y/n)?");
			answer = input.next();

		}while (answer.equalsIgnoreCase("y"));

		//Contruct the table of values

		//Titles
		System.out.printf("Range\t\tAmount\n");

		//Display the amounts for salary ranges from $200 to $900
		for (int index = 2; index < salaryCount.length - 1; index++)
			System.out.printf("$%d00-%d99\t\t%d\n" , index, index, salaryCount[index]);

		//Another line for $1000+
		System.out.printf("$1000 and over\t%d\n" , salaryCount[10]);

	}
}