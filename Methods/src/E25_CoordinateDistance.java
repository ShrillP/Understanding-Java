import java.util.Scanner;

public class E25_CoordinateDistance {
	
	public static void main (String args []) {
		
		//Variables 
		Scanner input = new Scanner (System.in);
		double x1;
		double y1;
		double x2;
		double y2;
		String answer;
		
		do {
			
			System.out.println("Enter X1:");
			x1 = input.nextDouble();
			
			System.out.println("Enter Y1:");
			y1 = input.nextDouble();
			
			System.out.println("Enter X2:");
			x2 = input.nextDouble();
			
			System.out.println("Enter Y2:");
			y2 = input.nextDouble();
			
			System.out.printf("%.2f is the distance between the two points entered.\n" , distance(x1, y1, x2, y2));
			
			System.out.println("Do you wish to continue (y/n):");
			answer = input.next();
			
		} while (answer.equalsIgnoreCase("y"));
		
		if (answer.equalsIgnoreCase("n"))
			System.out.println("Goodbye!");
	}
	
	public static double distance (double x1, double y1, double x2, double y2) {
		
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}

}