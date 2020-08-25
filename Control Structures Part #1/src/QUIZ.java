import java.util.Scanner;

public class QUIZ {

	public static void main (String args []) {

		//Variables 
		Scanner input = new Scanner (System.in);
		double average; 
		int counter = 0;
		int mark;
		int total = 0;

		//Get a mark from user 
		do {
			System.out.println("Enter a mark [-1 to exit]:");
			mark = input.nextInt();

			//Check if the marks are valid entries 
			if (mark >= 0 && mark <= 100) {
				counter ++;
				total += mark;

			//All while the marks do not equal -1
			} else if (mark != -1)
				System.out.println("Invalid Numberr!");

		} while (mark != -1);

		//Calculate the Average 
		average = total / counter;

		//Display the Results 
		System.out.printf("The average of the marks entered is %.1f." , average);

	}//end of main method 

}//end of class  