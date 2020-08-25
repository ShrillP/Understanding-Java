import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

import java.awt.event.*;

public class E26_DiceGame extends JFrame implements ActionListener {

	//Create the game labels 
	JLabel statusLabel = new JLabel ("Select an amount to wager and then ROLL the dice.");
	JLabel die1Label = new JLabel (new ImageIcon ("1.png"));
	JLabel die2Label = new JLabel (new ImageIcon ("1.png"));
	JLabel bankLabel = new JLabel (new ImageIcon ("$1000"));
	JLabel chatterLabel = new JLabel ("Welcome to the CRAPS game!");

	//Create the game buttons 
	JButton rollButton = new JButton ("Roll");
	JButton wagerButton = new JButton ("Wager");

	Timer rollTimer = new Timer (100, this);   //the timer will simulate the rolling of the dice   

	int count = 0;   //this will count the number of times that the dice are rolled; it will reset after 10 rolls 

	//Add Balance and Wager as integers
	int bankBalance = 1000;
	int wager;

	//Tracks the dice and its rolls 
	int diceTotal; 
	boolean firstRoll;
	int point; 

	//Constructor Method (makes the GUI)
	public E26_DiceGame () {

		//Create the Game Interface 
		setSize (500, 500);
		setTitle ("CRAPS GAME");
		setLayout (null);

		die1Label.setBounds (50, 50, 162, 162);
		add (die1Label);

		die2Label.setBounds (275, 50, 162, 162);
		add (die2Label);

		statusLabel.setBounds(100, 200, 300, 100);
		add (statusLabel);

		rollButton.setBounds (125, 300, 100, 50);
		rollButton.addActionListener (this);
		rollButton.setEnabled(false);
		add(rollButton);

		wagerButton.setBounds (275, 300, 100, 50);
		wagerButton.addActionListener (this);
		add(wagerButton);

		chatterLabel.setBounds(150, 375, 300, 50);
		add(chatterLabel);

		//Track the first roll 
		firstRoll = true;
		setVisible (true);

	}
	
	public void showDice (int die1, int die2) {

		//File names for the dice
		String die1File = die1 + ".png";
		String die2File = die2 + ".png";

		//Load the dice images 
		die1Label.setIcon(new ImageIcon (die1File));
		die2Label.setIcon(new ImageIcon (die2File));
	}
	public void setResult (String message, int amount) {

		bankBalance += amount;
		statusLabel.setText(message);

		//Determine if there is any money left to roll again 
		if (bankBalance > 0) {
			rollButton.setEnabled(false);
			wagerButton.setEnabled(true);
			firstRoll = true;

		} else { 

			//If you are broke then display message and exit 
			JOptionPane.showMessageDialog(null, "Sorry! You Busted.");
			System.exit(0);

		}
	}
	public void rollDice () {

		//Stores random die values 
		Random randomNumber = new Random ();
		int die1;
		int die2;

		die1 = 1 + randomNumber.nextInt(6); 
		die2 = 1 + randomNumber.nextInt(6);

		showDice (die1, die2);

		diceTotal = die1 + die2;

	}
	public void analyzeRoll () {

		//For the first roll
		if (firstRoll) {

			if (diceTotal == 7 || diceTotal == 11)
				setResult ("Winner on the first roll!" , wager);

			else if (diceTotal == 2 || diceTotal == 3 || diceTotal == 12)
				setResult("Lost on the first roll!" , -wager);

			else {
				point = diceTotal;  //memorizes the first roll outcome
				statusLabel.setText(String.format("Point is %d. Now try to match it. \n" , point));
				firstRoll = false;
			}

		} else {   //for subsequent rolls 
			if (diceTotal ==7)
				setResult ("Lost - did not match the point." , -wager);

			else if (diceTotal == point)
				setResult ("Winner - you matched the point rolled!" , wager);

			else 
				statusLabel.setText(String.format("Point is still %d. Try to match it.\n" , point));

		}
	}
	public void getWager () {

		String answer;   //Stores user answer about the wager (or cancel to exit)

		while (true) {

			answer = JOptionPane.showInputDialog(String.format("Enter amount to wager - maximum $%d" , bankBalance));

			//If user selects cancel 
			if (answer == null) {

				//Verify choice to 'quit'
				int choice = JOptionPane.showOptionDialog(null, "Do you wish to quit?" , "Quit?" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

				//If verified then exit the system 
				if (choice == JOptionPane.YES_OPTION)
					System.exit(0); 

			} else {

				wager = Integer.valueOf(answer);  //Converts the amount entered (STRING) to the wager (INT) 

				if (wager > 0 && wager <= bankBalance)    //If the wager amount is valid then exit 
					break;

				else   //Otherwise give 'invalid'
					JOptionPane.showMessageDialog(null, "Invalid wager amount - re-enter amount or 'cancel' to exit.");

			}
		}
	}
	public void chatter () {

		int messageNum = (int) (Math.random() * 3);   //Random message (0, 1, 2)

		if (messageNum == 0)
			chatterLabel.setText("Oh, you're going for broke, huh?");
		else if (messageNum == 1)
			chatterLabel.setText("Aw c'mon, take a chance!");
		else if (messageNum == 2)
			chatterLabel.setText("You're up big.Now's the time to cash in your chips!");

	}
	@Override
	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == wagerButton) {    //Prompts user for wager and enables the roll button 
			getWager();
			wagerButton.setEnabled(false);
			rollButton.setEnabled(true);
			chatter();

		} else if (event.getSource() == rollButton) {   //Starts the dice rolling 
			rollButton.setEnabled(false);
			rollTimer.start();

		} else if (event.getSource() == rollTimer) {    //Rolls the dice
			rollDice();
			count ++;

			if (count == 10) {    //After 10 'rolls' stop the dice and analyze the roll
				rollTimer.stop();
				rollButton.setEnabled(true);
				count = 0;
				analyzeRoll();

			}
		}
	}
}