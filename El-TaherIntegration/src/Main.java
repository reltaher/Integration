
import java.util.Random;
import java.util.Scanner;

// This Project has been created by Ramzy El-Taher.
// This program is a quiz on how well you know champion quotes from the game "League of Legends".
// At the end, it will display your result, which ranges from Bronze to Diamond.

/*
 * WHEN DOING SCANNERS: IF I GO FROM NUMBERS TO STRINGS CLEAR BUFFER FROM PREVIOUS LINE.
 * To do this:
 * Before int a = scan.NextLine(); insert scan.NextLine(); That way, string will read the keystroke
 * rather than the integer.
 */

/*
 * In this program, we will be using Data-Types. These data-types will include
 * int, bool, and double.
 * 
 * Main primitive data types:
 * 
 * int: 32 bit integer and our main variable type.
 * bool: true or false.
 * double: 64-bit floating point. Used for decimals.
 * 
 * Other data types that will not be used:
 * 
 * float: 32-bit floating point. Used for decimals, but doubles are preferred
 * over floats. 
 * byte: 8-bit integer. Data is not large enough to use. 
 * short: 16-bit integer. Data is not large enough to use.
 * (Note: Short IS used in this program, but it is only used for casting purposes.)
 * long: 64-bit integer.
 * char: used for unicode, which will not be necessary here.
 */


//To format with Google Style Java Guide, Ctrl+Shift+F
public class Main {

	/*
	 * This is a header.
	 * Public is an access modifier.
	 * void is the return type meaning this method does not return anything.
	 * method names should be in
	 * lowerCamelCase and be named with a verb.
	 * Within this header is the parameter, which in this case would be String[] args.
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to my Integration Project!");
		System.out.println("This program will quiz you based on how knowledgable"
				+ " you are with champion quotes from League of Legends.");
		System.out.println("Type 1 to take the quiz, type 2 to try the " +
				"Random Number Generator minigame.");	
		//Menu screen
		Scanner scan = new Scanner(System.in);
		int select = 0;	
		select = scan.nextInt();
		switch (select) {
		case 1: 
			Question question1 = new Question();
			question1.setQuestion("Question1\n");
			question1.setChoiceA("A\n");
			question1.setChoiceB("B\n");
			question1.setChoiceC("C\n");
			question1.setChoiceD("D");
			Question question2 = new Question();
			question2.setQuestion("Question2\n");
			question2.setChoiceA("A\n");
			question2.setChoiceB("B\n");
			question2.setChoiceC("C\n");
			question2.setChoiceD("D");
			Question question3 = new Question();
			question3.setQuestion("Question3\n");
			question3.setChoiceA("A\n");
			question3.setChoiceB("B\n");
			question3.setChoiceC("C\n");
			question3.setChoiceD("D");
			Rating ratingResult = new Rating();
			ratingResult.setBronzeRating("Bronze");
			ratingResult.setSilverRating("Silver");
			ratingResult.setGoldRating("Gold");
			ratingResult.setPlatinumRating("Platinum");
			ratingResult.setDiamondRating("Diamond");
			System.out.println(question1.getQuestion() + "A: " + question1.getChoiceA() + "B: " + question1.getChoiceB()
			+ "C: " + question1.getChoiceC() + "D: " + question1.getChoiceD());
			System.out.println(question2.getQuestion() + question2.getChoiceA() + question2.getChoiceB()
			+ question2.getChoiceC() + question2.getChoiceD());
			System.out.println(question3.getQuestion() + question3.getChoiceA() + question3.getChoiceB()
			+ question3.getChoiceC() + question3.getChoiceD());
			System.out.println("Score: " + Math.ceil(ratingResult.getScore())); //Math.ceil rounds up score
			System.out.println("Here is your result: " + ratingResult.getBronzeRating());
			System.out.println("Here is your result: " + ratingResult.getSilverRating());
			System.out.println("Here is your result: " + ratingResult.getGoldRating());
			System.out.println("Here is your result: " + ratingResult.getPlatinumRating());
			System.out.println("Here is your result: " + ratingResult.getDiamondRating());
			break;
		case 2:
			Champion myChamp = new Champion();
			System.out.println("Random Champion Game");
			myChamp.ranChamp();
			break;
		default:
			System.out.println("Error");
		}
			
		/*
		 * With the getter/setter method in our different classes, we have to use the
		 * set string extension. Using this will bring our private string into the main
		 * method, and the name of the string is within the argument of the string.
		 * 
		 * After declaring set, when printing the result, we then have to use the get
		 * string extension to obtain the string from its set form.
		 *
		 * the \n is a type of escape sequence which stands for newline. \n (newline)
		 * creates a new line for the next string (EX: A is below the first question).
		 * 
		 * The following few lines below are good examples of call and argument.
		 * For example, question1.setQuestion() would be considered the call.
		 * within its parentheses is the argument. In the example below, the argument
		 * would be ("Question1\n").
		 */


		/*
		 * One method of Strings that we will be using in this program is concatenating.
		 * The + operator is used to concatenate strings together, which helps create
		 * sentences out of strings. It is also useful for other purposes, such as
		 * making a multiple choice test like we are in this program.
		 */
		}
}

class Question {

	/*
	 * Everything in this code block would be defined as a scope. A scope is where
	 * all the variables are located in. Variables: location in memory. In this
	 * case, the location of the variables would be in the class of the object.
	 */

	/* 
	 * the time you have for each question. Final variable will
	 * prevent the time from changing.
	 */
	
	private static final double time = 10.25; 

	/*
	 * For this project, we want to set our fields in each class private. When a
	 * field is set to private, the main class is unable to locate these strings.
	 * This is due to the concept of scope, which the scope of these strings are
	 * located in the Rating class. TO DO: Set each field (String, boolean, final
	 * double) in this class private.
	 */

	//NOTE: Questions/Answers associated with questions need to be randomized. Will add on to it later.
	private String question;
	private String choiceA;
	private String choiceB;
	private String choiceC;
	private String choiceD;
	private boolean correctAnswer = true;
	private boolean incorrectAnswer = false;

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

	public boolean getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(boolean newCorrectAnswer) {
		correctAnswer = newCorrectAnswer;
	}

	public boolean getIncorrectAnswer() {
		return incorrectAnswer;
	}

	public void setIncorrectAnswer(boolean newIncorrectAnswer) {
		incorrectAnswer = newIncorrectAnswer;
	}
}

class Rating {

	private int points = 0;
	private short score = (short) points; // casting (converts a type of value into another)
	// ?  the ternary opertator
	//variable x = (expression) ? value if true: value if false
	//https://www.tutorialspoint.com/Java-Ternary-Operator-Examples
	//2String rating ? '0' : '1';
	private String bronzeRating = "0";
	private String silverRating = "1";
	private String goldRating = "2";
	private String platinumRating = "3";
	private String diamondRating = "4";

	/*
	 * valueOf(); is another string method that this program utilizes. What
	 * valueOf(); does is that it converts our variables into a string. The reason
	 * why we want to convert the int variable "score" to a string is because we
	 * will need the string form of this variable to convert the score into the type
	 * of result that the user gets.
	 */

	private String ratingResult = String.valueOf(score);

	public int getPoints() {
		return points;
	}

	public void setPoints(int newPoints) {
		points = newPoints;
	}

	public short getScore() {
		return score;
	}

	public void setScore(short newScore) {
		score = newScore;
	}

	public String getBronzeRating() {
		return bronzeRating;
	}

	public void setBronzeRating(String newBronzeRating) {
		bronzeRating = newBronzeRating;
	}

	public String getSilverRating() {
		return silverRating;
	}

	public void setSilverRating(String newSilverRating) {
		silverRating = newSilverRating;
	}

	public String getGoldRating() {
		return goldRating;
	}

	public void setGoldRating(String newGoldRating) {
		goldRating = newGoldRating;
	}

	public String getPlatinumRating() {
		return platinumRating;
	}

	public void setPlatinumRating(String newPlatinumRating) {
		platinumRating = newPlatinumRating;
	}

	public String getDiamondRating() {
		return diamondRating;
	}

	public void setDiamondRating(String newDiamondRating) {
		diamondRating = newDiamondRating;
	}

	public String getRatingResult() {
		return ratingResult;
	}

	public void setRatingResult(String newRatingResult) {
		ratingResult = newRatingResult;
	}
}

class Champion  {
	public static void ranChamp() {
		/*
		 * I will be using the Random class for a different setting rather than for the quiz.
		 * What I plan to do is to assign specific integers (EX: 10-20) to a champion in LoL.
		 * When the program prints out the number, whatever number is printed out will also
		 * print the champion that is associated with the number. This will just be a fun
		 * side game in this program.
		 * 
		 * More will be added on to this later.
		 */
		Random randomNumber = new Random();
		int number;
		String champion = "unknown";
		number = randomNumber.nextInt(101);
		System.out.println(number);
		if (number <= 0)  {
		champion = "Ashe";
		System.out.println(champion);
		} else if (number <=10)  {
		champion = "Ekko";
		System.out.println(champion);	
		} else if (number <= 20)  {
		champion = "Gragas";
		System.out.println(champion);
		} else if (number <= 30)  {
		champion = "Ahri";
		System.out.println(champion);
		} else if (number <= 40)  {
		champion = "Xerath";
		System.out.println(champion);
		} else if (number <= 50)  {
		champion = "Urgot";
		System.out.println(champion);
		} else if (number <= 60)  {
		champion = "Yorick";
		System.out.println(champion);
		} else if (number <= 70)  {
		champion = "Ivern";
		System.out.println(champion);
		} else if (number <= 80)  {
		champion = "Graves";
		System.out.println(champion);
		} else if (number <= 90)  {
		champion = "Elise";
		System.out.println(champion);
		} else if (number <= 100)  {
		champion = "Kha'Zix";
		System.out.println(champion);
		} else {
		System.out.println("Something went wrong...");
		}
	}
}