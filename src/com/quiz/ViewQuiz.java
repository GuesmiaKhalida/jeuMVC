package com.quiz;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ViewQuiz {
	
	private JFrame quizFrame;
	private JLabel namePlayerLabel;
	private JLabel numQuestionLabel;
	private JLabel pointsLabel;
	
	private JLabel questionLabel;
	private JButton choice1;
	private JButton choice2;
	private JButton choice3;
	private JButton choice4;
	 
	
	
	public ViewQuiz() {
		
		quizFrame= new JFrame("Quiz");
		quizFrame.setSize(500, 300);
		quizFrame.setLocationRelativeTo(null);
		quizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizFrame.setIconImage(new ImageIcon("images/questions.png").getImage());
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		JPanel panelHeading = new JPanel();
		panelHeading.setLayout(new GridLayout(1,3));
		Font police =new Font("Tahoma",Font.BOLD, 10);
		
		namePlayerLabel= new JLabel();
		namePlayerLabel.setFont(police);
		panelHeading.add(namePlayerLabel);
		
		numQuestionLabel= new JLabel();
		numQuestionLabel.setFont(police);
		panelHeading.add(numQuestionLabel);
		
		pointsLabel= new JLabel();
		pointsLabel.setFont(police);
		panelHeading.add(pointsLabel);
		pointsLabel.setOpaque(true);
		
		panel.add(panelHeading,BorderLayout.NORTH);
		
		
		JPanel panelQst = new JPanel();
		panelQst.setLayout(new GridLayout(2,1));
		
		questionLabel = new JLabel();
		police =new Font("Tahoma",Font.BOLD, 14); 
		questionLabel.setFont(police);
		panelQst.add(questionLabel);
		
		JPanel panelChoice = new JPanel();
		panelChoice.setLayout(new GridLayout(2,2));
		
		
		choice1= new JButton();
		panelChoice.add(choice1);
		choice2= new JButton();
		panelChoice.add(choice2);
		choice3= new JButton();
		panelChoice.add(choice3);
		choice4= new JButton();
		panelChoice.add(choice4);
		
		panelQst.add(panelChoice);    
		panel.add(panelQst, BorderLayout.CENTER);  
		quizFrame.add(panel);
		quizFrame.setVisible(true);
		
		
		
	}
	
	
	public JButton getChoice1() {
		return choice1;
	}

	public void setChoice1(JButton choice1) {
		this.choice1 = choice1;
	}

	public JButton getChoice2() {
		return choice2;
	}

	public void setChoice2(JButton choice2) {
		this.choice2 = choice2;
	}

	public JButton getChoice3() {
		return choice3;
	}

	public void setChoice3(JButton choice3) {
		this.choice3 = choice3;
	}

	public JButton getChoice4() {
		return choice4;
	}

	public void setChoice4(JButton choice4) {
		this.choice4 = choice4;
	}

	public String showNameJDialog() {
		return JOptionPane.showInputDialog(this.quizFrame,"Bienvenue dans le Quiz", "Saisissez votre nom:");
	}
	
	
	
	
	
	
	
	public void showNamePlayer(String name) {
		this.namePlayerLabel.setText(name);
		this.namePlayerLabel.setIcon(new ImageIcon("images/user.png"));
	}
	
	public void showNumQst(int num) {
		this.numQuestionLabel.setText("Question n°"+num);
		this.numQuestionLabel.setIcon(new ImageIcon("images/quest.png"));
		this.numQuestionLabel.setHorizontalAlignment(JLabel.CENTER);
		
	}
	
	public void showPoints(int num) {
		this.pointsLabel.setText(num+"  points");
		this.pointsLabel.setIcon(new ImageIcon("images/coins.png"));
		this.pointsLabel.setHorizontalAlignment(JLabel.RIGHT);
		
	}
	
	public void showQuestion(String statement,String[] choices) {
		
		this.questionLabel.setText(statement);
		this.questionLabel.setIcon(new ImageIcon("images/questionM.png"));
	    this.questionLabel.setHorizontalAlignment(JLabel.CENTER);
	
	    choice1.setText(choices[0]);
	    choice1.setIcon(new ImageIcon("images/1.png"));
	    choice2.setText(choices[1]);
	    choice2.setIcon(new ImageIcon("images/2.png"));
	    choice3.setText(choices[2]);
	    choice3.setIcon(new ImageIcon("images/3.png"));
	    choice4.setText(choices[3]);
	    choice4.setIcon(new ImageIcon("images/4.png"));
	    
	}
	
	public void showCorrectAnswerJDialog(String player) {
		  JOptionPane.showMessageDialog(null, "Bravo " + player+" ! Vous avez choisi la bonne réponse !", "information", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("images/happy.png"));

		
	}
	
	public void showInCorrectAnswerJDialog(String player) {
		  JOptionPane.showMessageDialog(null, "Désolé " + player+" ! Vous avez choisi la mauvaise réponse!", "information", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("images/cry.png"));
		  
		
	}
	
	public int showPointsJDialog(String player, int points) {
		  return JOptionPane.showConfirmDialog(null, player+ " vous avez gngné "+ points+" points ! \n voulez-vous rejouer ?", "Quiz",
		               JOptionPane.YES_NO_OPTION,
		               JOptionPane.QUESTION_MESSAGE);
		
	}
	
            
	


	
	

}
