package Recursion;

import java.util.Scanner;

public class PrintArray {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the amount of array elements:");
		int index = input.nextInt();
		
		int[] array = new int [index];
		
		System.out.println("Enter an array:");
		
		for(int x = 0; x < array.length; x++) {
		
			array[x] = input.nextInt();
			
		}
		
		printArray(array, 0);
		
	}

	public static void printArray(int[] array, int index) {
		
		System.out.print(array[index] + " ");
		
		if (index < array.length - 1)
			printArray(array, ++index);
			
	}	
}