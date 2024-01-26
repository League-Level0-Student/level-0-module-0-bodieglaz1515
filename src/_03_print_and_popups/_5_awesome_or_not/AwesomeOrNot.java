package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {
	public static void main(String[] args) {
	// 1. Make a main method that includes everything below

	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
	 Random number1 = ran; 
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	int number2 = ran.nextInt(4);
		// 3. Print your variable to the console
	System.out.print(number2);
		// 4. Get the user to enter something that they think is awesome
	 String input1= JOptionPane.showInputDialog("what do you think is awsome"  );
		// 5. If your variable is  0
	if ( number2 == (0)){
		
		JOptionPane.showMessageDialog(null,"that is awesome");
		
		
	}		// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
	if (number2 == (1)) {
		
		JOptionPane.showMessageDialog(null, " that is ok");
		
	}
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	if (number2== (2)) {
		JOptionPane.showMessageDialog(null, "thats pretty boring");
	}
			// -- tell the user whatever they entered is boring.
	if (number2== (3)) {
		// 8. If your variable is  3
	JOptionPane.showMessageDialog(null, "boooooooooooooooooo thats the most boring thing ive ever heard");}
			// -- invent your own message to give to the user (be nice).
		
	}
}
