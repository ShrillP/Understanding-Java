package Recursion;

import java.awt.*;
import javax.swing.*;

public class FractalsJPanel extends JPanel{

	private Color colour; //stores colour used to draw fractal 
	private int level; 	  //stores current level of fractal 
	
	private static final int WIDTH = 400; 	//defines width of JPanel 
	private static final int HEIGHT = 400;	//defines height of JPanel 
	
	//set up initial fractal level to the value specified and set up JPanel specifications 
	public FractalsJPanel(int currentLevel) {
		
		colour = Color.BLUE;	//initialize drawing colour to blue
		level = currentLevel;	//set up initial fractal level
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
	}
	
	public void drawLoFractal (int level, int xA, int yA, int xB, int yB, Graphics g) {
		
		//base case: draw a line connecting two given points 
		if (level == 0) {
			g.drawLine(xA, yA, xB, yB);
			
		}else { 
			
			//Lo Fractal 
			//recursion step: determine new points, draw next level 
			int xC = (xA + xB) / 2;
			int yC = (yA + yB) / 2;
			
			//calculate the fourth point (xD, yD) which forms an
			//isosceles right triangle between (xA, yA) and (xC, yC)
			//where the right angle is at (xD, yD)
			int xD = xA + (xC - xA) / 2 - (yC - yA) / 2;
			int yD = yA + (yC - yA) / 2 + (xC - xA) / 2;
			
			//recursively draw the fractal 
			drawLoFractal(level - 1, xD, yD, xA, yA, g);
			drawLoFractal(level - 1, xD, yD, xC, yC, g);
			drawLoFractal(level - 1, xD, yD, xB, yB, g);
			
		}
	}
	
	public void drawSierpinskiFractal (int level, int xA, int yA, int xB, int yB, int xC, int yC, Graphics g) {
		
		//base case: draw a line connecting two given points 
		if (level == 0) {
			g.drawLine(xA, yA, xB, yB);
			g.drawLine(xB, yB, xC, yC);
			g.drawLine(xC, yC, xA, yA);
			
		}else { 
			
			drawSierpinskiFractal(level - 1, (xA + xB) / 2, (yA + yB) / 2, (xB + xC) / 2, (yB + yC) / 2, xB, yB, g);
			drawSierpinskiFractal(level - 1, (xA + xC) / 2, (yA + yC) / 2, (xB + xC) / 2, (yB + yC) / 2, xC, yC, g);
			drawSierpinskiFractal(level - 1, (xA + xC) / 2, (yA + yC) / 2, (xA + xB) / 2, (yA + yB) / 2, xA, yA, g);
			
		}
	}
	
	//start drawing the fractal 
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		 
		g.setColor(colour);
		
		//Lo Fractal 
//		drawLoFractal(level, 100, 90, 290, 200, g);
		
		//Sierpinski Triangle 
		drawSierpinskiFractal(level, 100, 300, 300, 300, 200, 300 - (int) Math.sqrt(30000), g);
		
	}
	
	//set the drawing colour to c
	public void setColour(Color c) {
		colour = c;
	}
	
	//set the new level of recursion 
	public void setLevel(int currentLevel) {
		level = currentLevel;
	}
	
	//returns level of recursion 
	public int getLevel() {
		return level;
	}
}