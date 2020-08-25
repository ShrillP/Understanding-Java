package Recursion;

public class RecursivePower {
	
	public static long original;
	
	public static void main (String args []) {
		
		long base = 5;
		long exponent = 3;
		original = base;
		
		System.out.println(power(base, exponent));
		
	}
	
	public static long power (long base, long exponent) {
	
		if (exponent == 0)
			return 1;
		else if (exponent == 1)
			return base;
		else 
			return power(base * original, exponent - 1);
		
	}
}