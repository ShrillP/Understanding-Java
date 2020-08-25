package Recursion;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		
		System.out.println(gcd(230,500));

	}
	
	public static int gcd (int x, int y) {
	
		if(y == 0)
			return x;
		else 
			return gcd(y, x % y);
		
	}
}