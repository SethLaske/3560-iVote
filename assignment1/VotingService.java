package assignment1;

import java.util.*;

public class VotingService{

	private String[] QuestionAnswers;
	private List<List<String>> Results = new ArrayList<List<String>>();
	
	
	//take votes first, save them as an Array, then create the rows for a list of lists 
	protected void setAnswers(String[] AnswerMap) {
		
		this.QuestionAnswers = AnswerMap;
		for(int i = 0; i<AnswerMap.length; i++) {
			
			Results.add(new ArrayList<String>());
		}
		
	}
	
	
	protected void getStudentAnswers(String ID, Set<Integer> StudentAnswers) {
		
		//In order to ensure only the most recent submission from a student is selected, their ID will be removed if seen in the list
		//Then if the student actually voted for an answer their ID will be added to the corresponding list
		for(int n = 0; n < Results.size(); n++) {
			List<String> innerList = Results.get(n);
			if (innerList.contains(ID)){
				innerList.remove(ID);
			}
			if(StudentAnswers.contains(n)) {
				innerList.add(ID);
				
			}
		}
	}
	
	//Simply outputs the number of votes with each answer and prints them out
	protected void displayAnswers () {
		
		System.out.println("I will now tally the votes:");
		
		for(int i = 0; i < Results.size(); i++) {
			List<String> innerList = Results.get(i);
			System.out.println(QuestionAnswers[i] + ": " + innerList.size());
		}
		
	}
	
	
}
