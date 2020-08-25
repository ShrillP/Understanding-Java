import java.util.Scanner;

public class E13_CircleArea {
	
	public static void main (String args []) {
		
		//Variables 
		Scanner input = new Scanner (System.in);
		double radius;
		
		//Prompt user to enter a radius value 
		System.out.println("Enter a value for the radius:");
		radius = input.nextDouble();
		
		//Output the area 
		System.out.printf("The area of your circle is %.4f units squared." , circleArea(radius));
		
	}
	
	public static double circleArea (double radius) {
		
		return Math.PI * Math.pow(radius, 2);
	}
}