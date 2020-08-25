import java.util.Scanner;

public class AirplaneSeats {
	
	public static void main (String args []) {
		
		Scanner input = new Scanner (System.in);
		
		int seatChoice = 0;
		int firstClassSeats = 0;
		int economyClassSeats = 5;
		
		boolean[] seats = new boolean [10];
		
		do {
			
			System.out.println("Please type 1 for First Class, 2 for Economy, or 3 to leave:");
			seatChoice = input.nextInt();
			
			if (seatChoice == 1) {
				
				if (firstClassSeats < 5) {
					
					seats[firstClassSeats] = true;
					firstClassSeats++;
					
				} else if (economyClassSeats <= 5) {
					
					seats[economyClassSeats] = true;
					economyClassSeats++;
					
				} else 
					System.out.println("The next flight leaves in 3 hours!");
				
			} else if (seatChoice == 2) {
				
				if (economyClassSeats < 10) {
					
					seats[economyClassSeats] = true;
					economyClassSeats++;
					
				} else if (firstClassSeats <= 5) {
					
					seats[firstClassSeats] = true;
					firstClassSeats++;
					
				}
				
			} else 
				System.out.println("The next flight leaves in 3 hours!");
			
			for (boolean x : seats) 
				System.out.print(x + " ");
			
			System.out.println();
			
		} while (seatChoice != 3);
		
	}

}
