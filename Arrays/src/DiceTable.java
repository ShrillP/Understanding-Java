import java.util.Random;

public class DiceTable {
	
	public static void main (String args []) {
		
		int die1, die2;		//holds values for die 1 and die 2
		int diceCount [] = new int [13];		//holds the value for each number rolled 
		
		Random randomNum = new Random();
		
		//Roll the dice 36000 times 
		for (int x = 0; x < 36000; x++) {
			
			die1 = 1 + randomNum.nextInt(6);		//rolls die1 from 1-6
			die2 = 1 + randomNum.nextInt(6);		//rolls die2 from 1-6
			
			++diceCount[die1 + die2];		//adds the sum of the 2 numbers rolled 
			
		}
		
		//Display column titles 
		System.out.printf("Sums\tAmount\n");
		
		//Display the results 
		for (int x = 2; x < diceCount.length; x++)
		System.out.printf("%d\t%d\t\n" , x, diceCount[x]);
		
	}
}
