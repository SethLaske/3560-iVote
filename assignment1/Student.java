package assignment1;

import java.util.*;

public class Student {

	private String ID;
	Set<Integer> AnswerSet = new HashSet<Integer>();
	
	//Every Student must have an ID
	protected Student (String SID) {
		this.ID = SID;
	}
	
	//Any answer that they have will be saved as a set to prevent multiple votes for the same entry
	protected void addAnswer(Integer NewAnswer){
		AnswerSet.add(NewAnswer);
	}
	
	//get methods to return the students information
	protected String getID() {
		return ID;
	}
	protected Set<Integer> getAnswers(){
		return AnswerSet;
	}
	
	//print out all information saved about the student
	protected void displayStudent() {
		System.out.println(ID + ": answers are " + AnswerSet);
	}
	
}
