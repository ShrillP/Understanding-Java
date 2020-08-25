package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinimum {

	public static void main (String [] args) {

		Scanner input = new Scanner (System.in);

		System.out.println("Enter the amount of array elements:");
		int index = input.nextInt();

		int[] numbers = new int [index];

		System.out.println("Enter an array:");

		for(int x = 0; x < numbers.length; x++) {

			numbers[x] = input.nextInt();

		}
		
		System.out.println("The lowest number in the array is: " + findMinimum(numbers));

	}

	public static int findMinimum (int[] numbers) {

		if (numbers.length == 1)
			return numbers[0];

		int minimum = findMinimum(Arrays.copyOfRange(numbers, 1, numbers.length));

		if (numbers[0] > minimum)
			return minimum; 
		else 
			return numbers[0];

	}	
}