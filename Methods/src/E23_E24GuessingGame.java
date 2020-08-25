import java.util.Scanner;

public class E23_E24GuessingGame {

	public static void main (String args []) {

		Scanner input = new Scanner (System.in);

		int userNum;
		int choice;

		do {

			int tries = 0;
			int randNum = (int) ((Math.random() * 1000) + 1);

			do {

				System.out.println("Enter your guess (1-1000):" + randNum);
				userNum = input.nextInt();
				tries ++;

				System.out.println(guessNum (userNum, randNum));

			} while (userNum != randNum);

			System.out.println(tries (tries));
			
			System.out.println("Would you like to play again [-1] Yes OR [-2] No:");
			choice = input.nextInt();

		} while (choice == -1);

		if (choice == -2)
			System.out.println("Goodbye!");

	}

	public static String guessNum (int userNum, int randNum) {

		if (userNum < randNum) {
			return "Too Low!";		

		}else if (userNum > randNum) {
			return "Too high";

		}else 
			return "Congratulations, you guessed the number!";

	}
	
	public static String tries (int tries) {
		
		if (tries <= 10)
			return "Either you know the secret or you got lucky!";
	
		else if (tries == 10)
			return "Aha! You knew the secret!";
		
		else  
			return "You should be able to do better!";
	}
}