package assignment1;

public class Question {

	private String Question;
	private String[] answerArray;
	
	//Saves all the information about a question, the question and answers can not be changed once uploaded.
	public Question (String AskedQuestion, String[] Answers) {
		this.Question = AskedQuestion;
		this.answerArray = Answers;
	}
	
	
	protected void askQuestion() {
		System.out.println(Question);
		
	}
	
	protected String[] getAnswerArray() {
		return answerArray;
	}

	
}
