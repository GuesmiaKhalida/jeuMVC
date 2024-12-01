package com.quiz;

import java.util.ArrayList;

public class ModelQuiz {
	
	 private String player;
	 private ArrayList<Question> quiz;
	 private int numQuestion;
	 private int points;
	 
	 
	 	 
	 
	 
	 
	 
	 
	 
	 public ModelQuiz(String player) {
		
		this.player = player;
		this.quiz=initQsts();
		this.numQuestion=1;
		this.points=0;
	}
	
	
	 
	public int getNumQuestion() {
		return numQuestion;
	}



	public void setNumQuestion(int numQuestion) {
		this.numQuestion = numQuestion;
	}



	

	public ArrayList<Question> getQuestions() {
		return quiz;
	}



	public void setQuestions(ArrayList<Question> questions) {
		this.quiz = questions;
	}



	public int getPoints() {
		return points;
	}



	public void setPoints(int points) {
		this.points = points;
	}



	public String getUser() {
		return player;
	}



	public void setUser(String user) {
		this.player = user;
	}



	public ArrayList<Question> initQsts() {
		String statement,answer;
		String [] choices;
		Question q;
		ArrayList<Question> quiz=new ArrayList<Question>();
		
		statement="Quel animal est l'emblême de Mozilla Firefox ?";
		choices =new String []{
				"Un lézard",
               "Un renard", 
               "Un papillon",
               "Un louveteau"};
		answer="Un renard";
		q=new Question(statement,choices,answer);
		quiz.add(q);
		
		statement="Lequel de ces sites n'est pas un moteur de recherche ?";
		choices =new String [] {
				"Google",
               "Bing", 
               "Chrome",
               "Yahoo!"};
		answer="Chrome";
		q=new Question(statement,choices,answer);
		quiz.add(q);
		
		statement="Trouvez l'intrus";
		choices =new String [] {
				"Firefox",
               "Chrome", 
               "Internet Explorer",
               "Windows Explorer"};
		answer="Windows Explorer";
		q=new Question(statement,choices,answer);
		quiz.add(q);
		
		statement="Comment savoir si votre site d'achat en ligne est sécurisé ?";
		choices =new String [] {
				"Il y a un logo spécifique en haut de la page",
               "L'adresse commence par https", 
               "Votre antivirus vous le confirme",
               "La page s'ouvre dans un nouvel onglet"};
		answer="L'adresse commence par https";
		q=new Question(statement,choices,answer);
		quiz.add(q);
		
		statement="Quelle est la signification de WWW dans une adresse internet (URL) ?";
		choices =new String [] {
				"World Wide Web",
               "World Wide Worms", 
               "Work Without Wait",
               "Web World Wide"};
		answer="World Wide Web";
		q=new Question(statement,choices,answer);
		quiz.add(q);
		
		return quiz;
	}
	 
	
	public String getQstStatement(int numQuestion ) {
		return this.getQuestions().get(numQuestion-1).getStatement();
		
	}
	
	public String[] getQstChoices(int numQuestion ) {
		return this.getQuestions().get(numQuestion-1).getChoices();
		
	}
	
	public boolean isCorrect(String answer, int numQuestion ) {
		if(answer.equals(this.getQuestions().get(numQuestion-1).getAnswer()))
			
			  {addPoints();
			    return true;
			  }
		return false;
	
			
		
	}
	
	
	public int incrementNumQuestion() {
		 this.numQuestion++;
		 return numQuestion;
	}
	
	public void addPoints() {
		this.points+=10;
	}
	
	public boolean isFinish(int numQuestion) {
		if(numQuestion-1>=this.getQuestions().size())
			return true;
		else
			return false;
	}
	 

}
