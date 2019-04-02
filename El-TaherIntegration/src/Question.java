//This project has been created by Ramzy El-Taher.
public class Question {

	/*
	 * Everything in this code block would be defined as a scope. A scope is where
	 * all the variables are located in. Variables: location in memory. In this
	 * case, the location of the variables would be in the class of the object.
	 */

	/*
	 * the time you have for each question. Final variable will prevent the time
	 * from changing.
	 */

	private static final double time = 10.25;

	/*
	 * For this project, we want to set our fields in each class private. When a
	 * field is set to private, the main class is unable to locate these strings.
	 * This is due to the concept of scope, which the scope of these strings are
	 * located in the Rating class. TO DO: Set each field (String, boolean, final
	 * double) in this class private.
	 */

	// NOTE: Questions/Answers associated with questions need to be randomized. Will
	// add on to it later.
	private String question;
	private String choiceA = "A";
	private String choiceB = "B";
	private String choiceC = "C";
	private String choiceD = "D";

	/*
	 * In order for main to find these fields, we use the getter/setter method. For
	 * strings within this class, we set a public string for each private string
	 * that we have. We then have to return the string which allows it to be
	 * prepared to be shipped to the main method.
	 *
	 * After using the get method, we now have to use the set method. The set method
	 * will create a new string, which we can set equal to out old string. This will
	 * then allow the string to be shipped to the main class.
	 */

	public double getTime() {
		return time;
	}

	public void setTime(double newTime) {
		newTime = time;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String newQuestion) {
		question = newQuestion;
	}

	public String getChoiceA() {
		return choiceA;
	}

	public void setChoiceA(String newChoiceA) {
		choiceA = newChoiceA;
	}

	public String getChoiceB() {
		return choiceB;
	}

	public void setChoiceB(String newChoiceB) {
		choiceB = newChoiceB;
	}

	public String getChoiceC() {
		return choiceC;
	}

	public void setChoiceC(String newChoiceC) {
		choiceC = newChoiceC;
	}

	public String getChoiceD() {
		return choiceD;
	}

	public void setChoiceD(String newChoiceD) {
		choiceD = newChoiceD;
	}
}
