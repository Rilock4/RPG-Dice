package myPack;

import javax.swing.*;

public class Dice {
	
	public static void main(String[] args) {
		
		while (true) {
			String side = JOptionPane.showInputDialog("What sided dice do you need, 4, 6, 8, 10, 12, or 20?");
			int s = Integer.parseInt(side);
			
			if (s == 4 || s == 6 || s == 8 || s == 10 || s == 12 || s == 20); {
				int d = (int)(Math.random() * s) + 1;
				JOptionPane.showMessageDialog(null, "Your dice roll is " +d);
			} // if closing brace
		} // while closing brace
	} // main closing brace
} // class closing brace

