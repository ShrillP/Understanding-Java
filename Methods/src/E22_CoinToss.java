import java.util.*;

public class E22_CoinToss {

	public static void main (String args []) {

		//Variables 
		Scanner input = new Scanner (System.in);
		int heads = 0; 
		int tails = 0;
		int selection;

		do {

			//Prompt user with their choices 
			System.out.println("Toss Coin [1] OR Exit [2]");
			selection = input.nextInt();

			if (selection == 1) {

				if (flip ())
					heads ++;
				else 
					tails ++;

				System.out.printf("Heads: %d\nTails: %d\n" , heads, tails);
			}

		} while (selection != 2);

		if (selection == 2)
			System.out.println("Goodbye!");

	}

	public static boolean flip () {

		if ((int)(Math.random() * 2) == 0)
			return true;
		else 
			return false;

	}

}
