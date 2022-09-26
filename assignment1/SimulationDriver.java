package assignment1;

import java.util.Random;

public class SimulationDriver {
	
	//Number of students initialized at the top for ease of use
	static int NumberOfStudents = 30;

	public static void main(String[] args) {
		//Initialize Question
		
		//Both option work, question and answer currently hardcoded in to limit user input
		//SingleChoiceQuestion qOTD = new SingleChoiceQuestion("How many hours to finish this assignment", new String[] {"a", "b", "c" });
		MultipleChoiceQuestion qOTD = new MultipleChoiceQuestion("How many hours to finish this assignment", new String[] {"Less than 1 Hour", "1 to 3 hours", "3 to 5 hours" , "More than 5 hours"});

		
		
		
		//Generate n students with random IDs and answers
		Random rand = new Random();
		
		//Number of Students set at the top for ease of use
		Student StudentList[] = new Student[NumberOfStudents];
		
		for (int i = 0; i<NumberOfStudents; i++) {
			
			//generate student ID
			String ID = "";
			for (int j = 0; j<9; j++) {
				ID = ID + rand.nextInt(10);
			}
			
			StudentList[i] = new Student(ID);
			
			
			
			//A random number of random answers will be provided for each student
			int AnswersGiven = rand.nextInt(qOTD.numberOfAnswers()) + 1;
			
			
			
			for (int n = 0; n<AnswersGiven; n++) {
				int RandomAnswer = rand.nextInt(qOTD.getAnswerArray().length);
				StudentList[i].addAnswer(RandomAnswer);
			}
			
			//Allows user to visualize each students ID and respective answers
				//Helps ensure the program is accurately inputting each student
			//StudentList[i].displayStudent();
			
		}
		
		//submit answers into ivote
		VotingService Jeff = new VotingService();
		
		//Initialize with the answers
		Jeff.setAnswers(qOTD.getAnswerArray());
		for(int i = 0; i < NumberOfStudents; i++) {
			Jeff.getStudentAnswers(StudentList[i].getID(), StudentList[i].getAnswers());
		}
		
		
		//Call Voting Service output
		Jeff.displayAnswers();
		

	}

}
