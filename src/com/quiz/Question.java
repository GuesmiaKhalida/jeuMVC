package com.quiz;


public class Question {
	
	private String statement;
	private String [] choices;
	private String answer;
		
	
	public Question() {
		
	}
	public Question(String statement, String [] choices, String answer) {
		super();
		this.statement = statement;
		this.choices = choices;
		this.answer = answer;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String[] getChoices() {
		return choices;
	}

	public void setChoices(String[] choices) {
		this.choices = choices;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
		
}
