package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello world");
		String input1=JOptionPane.showInputDialog("what is your name");
		
		String input2=JOptionPane.showInputDialog(null,"hello,"+input1+"what is your favorite animal");
		JOptionPane.showMessageDialog(null,"i love"+input2+"s too");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
