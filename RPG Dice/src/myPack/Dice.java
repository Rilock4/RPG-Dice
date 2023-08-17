package myPack;

import javax.swing.*;

public class Dice {
	
	public static void main(String[] args) {
		
		String side = JOptionPane.showInputDialog("What sided dice do you need, 4, 6, 8, 10, 12, or 20?");
		
		// creating random number dice rolls
		int d4 = (int)(Math.random() * 4) + 1;
		int d6 = (int)(Math.random() * 6) + 1;
		int d8 = (int)(Math.random() * 8) + 1;
		int d10 = (int)(Math.random() * 10) + 1;
		int d12 = (int)(Math.random() * 12) +1;
		int d20 = (int)(Math.random() *20) +1;
			
		
		// testing to make sure they produce correctly
		System.out.println("4 sided "+d4);
		System.out.println("6 sided "+d6);
		System.out.println("8 " +d8);
		System.out.println("10 "+d10);
		System.out.println("12 "+d12);
		System.out.println("20 "+d20);
	}
}
