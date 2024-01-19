package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
 String input1 =JOptionPane.showInputDialog(null, "do you know how to code");
		// 2. If they say "yes", tell them they will rule the world.
 System.out.println(input1);
if(input1.equals("yes")||input1.equals("yeah")) {
	JOptionPane.showMessageDialog(null,"you wil rule the world");
	
	
}else {
	
	JOptionPane.showMessageDialog(null,"signup for classes at the league");
	
	
}
		// 3. Otherwise, tell them to sign up for classes at The League.

	}
}

