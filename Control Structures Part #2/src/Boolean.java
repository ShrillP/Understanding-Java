import java.util.Scanner; 

public class Boolean {
	
	public static void main (String args []) {
		
		//Variables 
		int i = 1;
		int j = 2;
		int k = 3;
		int m = 2;
		
		//a
		System.out.println( i == 1 );
		
		//b
		System.out.println( j == 3 );
		
		//c
		System.out.println( ( i >= 1 ) && ( j < 4 ) );
		
		//d
		System.out.println( ( m <= 99 ) & ( k < m ) );
		
		//e
		System.out.println( ( j >= i ) || ( k == m ) );
		
		//f
		System.out.println( ( k + m < j ) | ( 3 - j >= k ) );
		
		//g
		System.out.println( !( k > m ) );
		
	}//end of main method 

}//end of class 
