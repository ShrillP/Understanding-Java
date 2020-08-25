import java.util.Scanner;

public class E21_Marks {

	public static void main (String args []) {

		//Variables
		Scanner input = new Scanner (System.in);
		double marks;

		//Prompt user to enter a mark
		System.out.println("Enter a mark [-1 to quit]:");
		marks = input.nextDouble();

		while (marks != -1) {
			
			if (marks >= 0 && marks <= 100)
				System.out.println("Level Mark: " + qualityPoints(marks));
			else 
				System.out.println("Invalid Entry!");
			
			System.out.println("Enter a mark [-1 to quit]:");
			marks = input.nextDouble();
			
			if (marks == -1)
				System.out.println("Goodbye!");
		}
	}

	public static int qualityPoints (double grade) {

		if (grade >= 90)
			return 4;
		else if (grade >= 80 && grade < 90)
			return 3;
		else if (grade >= 70 && grade < 80)
			return 2; 
		else if (grade >= 60 && grade < 70)
			return 1;
		else
			return 0;
	}
}