package Recursion;

public class Factorial {

	public static long number = 20;
	public static long temp = number;

	public static void main(String[] args) {

		long answer = factorial(number);

		System.out.println("= " + answer);

	}

	public static long factorial (long x) {

		if (x == 0)
			return 0; 
		else if (x == 1)
			return 1; 
		
		if (temp == x)
			System.out.printf("  %d * %d!\n" , temp, (x - 1));
		else 
			System.out.printf("= %d * %d!\n" , temp, (x - 1));
		
		temp *= (x - 1);

		return (x * factorial(x - 1));

	}

}