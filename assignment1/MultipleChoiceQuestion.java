package assignment1;

public class MultipleChoiceQuestion extends Question {

	private int answersAllowed;
	
	public MultipleChoiceQuestion(String AskedQuestion, String[] Answers) {
		super(AskedQuestion, Answers);
		answersAllowed = Answers.length;
	}

	public int numberOfAnswers(){
		return answersAllowed;
	}
}
