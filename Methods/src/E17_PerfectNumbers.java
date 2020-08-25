public class E17_PerfectNumbers {

	public static void main (String args []) {
		
		int counter = 0;
		
		for (int number = 1; number <= 100000000; number ++) {
			
			String result = perfect (number);
			
			if (result != null) {
				System.out.printf("%d is a perfect number.\n" , number);
				System.out.printf("Factors: %s\n" , result);
				System.out.println();
	
			}	
		}
	}

	public static String perfect (int number) {

		int sum = 0;
		String factors = "";

		for (int test = 1; test < number; test ++) {
			
			if (number % test == 0) {
				sum += test;
				factors += test + " ";
				
			}
		}
		
		if (sum == number) {
			return factors;
			
		} else {
			return null;
			
		}	
	}
}