package com.quiz;

public class ControlQuiz {
	
	private ModelQuiz model;
	private ViewQuiz view;
	
	
	public ControlQuiz() {
     this.view=new ViewQuiz();
     this.model=new ModelQuiz(view.showNameJDialog());
     this.updateNamePlayer(this.model.getUser());
     this.updateQuestionView ();
     this.addListener();
     
    }
	
	
	public void updateNamePlayer (String name){
		this.view.showNamePlayer(name);
		
	}
	
	public void updateNumQst (int num){
		this.view.showNumQst(num);
		
	}
	public void updatePoints (int num){
		this.view.showPoints(num);
		
	}
	public void updateQst (String statement,String[] choices){
		this.view.showQuestion(statement,choices);
		
	}
	public void updateQuestionView () {
		this.updateNumQst(this.model.getNumQuestion());
		this.updatePoints(this.model.getPoints());
		this.updateQst(this.model.getQstStatement(this.model.getNumQuestion()),this.model.getQstChoices(this.model.getNumQuestion()));
		 
	 }
	
	public void addListener() {
		this.view.getChoice1().addActionListener(e -> test(e.getActionCommand()));
		this.view.getChoice2().addActionListener(e -> test(e.getActionCommand()));
		this.view.getChoice3().addActionListener(e -> test(e.getActionCommand()));
		this.view.getChoice4().addActionListener(e -> test(e.getActionCommand()));
		
		
	}
	
	public void test(String choice) {
		if(this.model.isCorrect(choice, this.model.getNumQuestion()))
			this.view.showCorrectAnswerJDialog(this.model.getUser());
			else
				this.view.showInCorrectAnswerJDialog(this.model.getUser());
		if(!this.model.isFinish(this.model.incrementNumQuestion()))
			 
			this.updateQuestionView();
		else
			if(this.view.showPointsJDialog(this.model.getUser(),this.model.getPoints())==0)
				new ControlQuiz();
			else
				System.exit(0);
				
		
		
		
	}
}
