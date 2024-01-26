package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String input1 = JOptionPane.showInputDialog(null,"what is 1+1");
				// 3.  Use an if statement to check if their answer is correct
				if (input1.equals ("2")) {
				// 4.  if the user's answer was correct, add one to their score 
			score+=1;	}else {
				score-=1;
			}
				JOptionPane.showMessageDialog(null,"you got "+score+"");
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
				String input2 = JOptionPane.showInputDialog(null,"what is the coolest thing in the world?");
				// 3.  Use an if statement to check if their answer is correct
				if (input2.equals ("water polo")||input2.equals ("waterpolo")||input2.equals ("coding")) {
				// 4.  if the user's answer was correct, add one to their score 
			score+=1;	}else {
				score-=1;
			}
				JOptionPane.showMessageDialog(null,"you got "+score+"");
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, "your final score was "+score+" ");
	}
}
