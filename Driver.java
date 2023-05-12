public class Driver {
// Created this driver class to test if the code is working.
	public static void main(String[] args) {		
		Question[] q = QuestionManager.getQuestion(); // this part of the code is to retrieve the question array.
		for(Question question : q) {
			System.out.println(question.toText());
		}
	}
}
