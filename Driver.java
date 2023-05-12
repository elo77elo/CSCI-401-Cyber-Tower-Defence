public class Driver {

	public static void main(String[] args) {		
		Question[] q = QuestionManager.getQuestion();
		for(Question question : q) {
			System.out.println(question.toText());
		}
	}
}
