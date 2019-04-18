//This project has been created by Ramzy El-Taher.
public class Question {

	/*
	 * Everything in this code block would be defined as a scope. A scope is where
	 * all the variables are located in. Variables: location in memory. In this
	 * case, the location of the variables would be in the class of the object.
	 * 
	 * For this project, we want to set our fields in each class private. When a
	 * field is set to private, the main class is unable to locate these strings.
	 * This is due to the concept of scope, which the scope of these strings are
	 * located in the Rating class.
	 * 
	 * In order for main to find these fields, we use the getter/setter method. For
	 * strings within this class, we set a public string for each private string
	 * that we have. We then have to return the string which allows it to be
	 * prepared to be shipped to the main method.
	 *
	 * After using the get method, we now have to use the set method. The set method
	 * will create a new string, which we can set equal to out old string. This will
	 * then allow the string to be shipped to the main class.
	 */
	private String questionText;


	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String newQuestionText) {
		questionText = newQuestionText;
	}

	public void askQuestion() {
		System.out.println(questionText);
	}
}
