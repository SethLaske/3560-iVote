package assignment1;

public class SingleChoiceQuestion extends Question{

	public int answersAllowed = 1;
	
	//extends the basic question
	public SingleChoiceQuestion(String AskedQuestion, String[] Answers) {
		super(AskedQuestion, Answers);
	}

	public int numberOfAnswers(){
		return answersAllowed;
		//Uses variable for consistency with other classes
	}
	
	
}
