public class E18_PrimeNumbers {
	
	public static void main (String args []) {
		
		System.out.println("The prime numbers from 1 to 10000 are:");
		
		//It will test all the number between the range given
		for (int counter = 2; counter <= 10000; counter ++)
			
			//if it is a prime number, display it 
			if (prime (counter))
				System.out.println(counter);
	}

	public static boolean prime (int number) {
		
		int maximum = (int) Math.sqrt (number); 
		
		for (int test = 2; test <= maximum; test ++)
			
			if (number % test == 0)
				return false;
		
		return true;
	
	}
}
