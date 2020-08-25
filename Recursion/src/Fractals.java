package Recursion;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fractals extends JFrame{

	private static final int WIDTH = 500; 
	private static final int HEIGHT = 500;
	private static final int MIN_LEVEL = 0 , MAX_LEVEL = 50;

	private JButton changeColourButton, increaseLevelButton, decreaseLevelButton;
	private JLabel levelLabel;
	private FractalsJPanel drawSpace;
	private JPanel mainPanel, controlJPanel;

	public Fractals() {

		super("Fractal");

		//set up control panel 
		controlJPanel = new JPanel();
		controlJPanel.setLayout(new FlowLayout());

		//set up colour button and register listener 
		changeColourButton = new JButton ("Change Colour");
		controlJPanel.add(changeColourButton);
		changeColourButton.addActionListener(
				new ActionListener()
				{

					//process changeColourButton event 
					public void actionPerformed (ActionEvent event) {

						Color colour = JColorChooser.showDialog(Fractals.this, "Chose a colour", Color.BLUE);

						//set default colour, if no colour is returned 
						if (colour == null)
							colour  = Color.BLUE;

						drawSpace.setColour(colour);

					}
				}
			);

		//set up decrease level button to add to control panel and register listener 
		decreaseLevelButton = new JButton ("Decrease Level");
		controlJPanel.add(decreaseLevelButton);
		decreaseLevelButton.addActionListener(
				new ActionListener()
				{

					//process changeColourButton event 
					public void actionPerformed (ActionEvent event) {

						int level = drawSpace.getLevel();
						--level; //decrease level by one 

						//modify level if possible 
						if ((level >= MIN_LEVEL) && (level <= MAX_LEVEL)){

							levelLabel.setText("Level: " + level);
							drawSpace.setLevel(level);
							repaint();
							
						}
					}
				}
			);
		
		//set up increase level button to add to control panel and register listener
		increaseLevelButton = new JButton ("Increase Level");
		controlJPanel.add(increaseLevelButton);
		increaseLevelButton.addActionListener(
				new ActionListener()
				{

					//process changeColourButton event 
					public void actionPerformed (ActionEvent event) {

						int level = drawSpace.getLevel();
						++level; //increase level by one 

						//modify level if possible 
						if ((level >= MIN_LEVEL) && (level <= MAX_LEVEL)){

							levelLabel.setText("Level: " + level);
							drawSpace.setLevel(level);
							repaint();
							
						}
					}
				}
			);
		
		//set up levelJLabel to add to controlJPanel
		levelLabel = new JLabel ("Level: 0");
		controlJPanel.add(levelLabel);
		
		drawSpace = new FractalsJPanel(0);
		
		//create mainJPanel to contain controlJPanel and drawSpace
		mainPanel = new JPanel();
		mainPanel.add(controlJPanel);
		mainPanel.add(drawSpace);
		
		add(mainPanel);
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		
	}
	
	public static void main (String [] args) {
		
		Fractals demo = new Fractals();
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}