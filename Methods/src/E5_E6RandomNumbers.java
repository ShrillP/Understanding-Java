public class E5_E6RandomNumbers {
	
	public static void main (String args []) {
		
		//5A) Random number between 1 and 2 
		System.out.println((int)(Math.random() * 2) + 1);
		
		//5B) Random number between 1 and 100 
		System.out.println((int)(Math.random() * 101) + 1);
		
		//5C) Random number between 0 and 9 
		System.out.println((int)(Math.random() * 10) + 0);
		
		//5D) Random number between 1000 and 1112 
		System.out.println((int)(Math.random() * 113) + 1000);
		
		//5E) Random number between -1 and 1 
		System.out.println((int)(Math.random() * 3) - 1);
		
		//5F) Random number between -3 and 11 
		System.out.println((int)(Math.random() * 15) - 3);
	
		//6a 
		System.out.println((int)(Math.random() * 5) * 2 + 2);
		
		//6b 
		System.out.println((int)(Math.random() * 5) * 2 + 3);
		
		//6c 
		System.out.println((int)(Math.random() * 5) * 4 + 6);
	
	}

}
