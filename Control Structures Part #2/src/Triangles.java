import java.util.Scanner;

public class Triangles {

	public static void main (String args []) {

		//First Triangle 
		System.out.println("Tringle A:");

		for (int row = 1; row <= 10; row++) {

			for (int stars = 1; stars <= row; stars++)
				System.out.print("*");

			System.out.println(" ");

		}//end of for loop

		System.out.println(" ");

		//Second Triangle
		System.out.println("Tringle B:");

		for (int row = 10; row >= 1; row--) {

			for (int stars = 1; stars <= row; stars++)
				System.out.print("*");

			System.out.println(" ");

		}//end of for loop

		System.out.println(" ");

		//Third Triangle 
		System.out.println("Tringle C:");

		for (int row = 10; row >= 1; row--) {

			for (int spaces = 10; spaces > row; spaces--)
				System.out.print(" ");

			for (int stars = 1; stars <= row; stars++)
				System.out.print("*");

			System.out.println(" ");

		}//end of for loop

		System.out.println(" ");

		//Fourth Triangle 
		System.out.println("Tringle D:");

		for (int row = 10; row >= 1; row--) {

			for (int spaces = 1; spaces < row; spaces++)
				System.out.print(" ");

			for (int stars = 10; stars >= row; stars--)
				System.out.print("*");

			System.out.println(" ");

		}//end of for loop

	}//end of main method

}//end of class 