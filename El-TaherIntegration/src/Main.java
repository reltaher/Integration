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
 * 
 * Operator precedence - order in which operators are evaluated.
 * This is important to understand because a lot of operators are used in this program.
 * Precedence order: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
 */

//To format with Google Style Java Guide, Ctrl+Shift+F
public class Main {

	/*
	 * This is a header. Public is an access modifier. void is the return type
	 * meaning this method does not return anything. method names should be in
	 * lowerCamelCase and be named with a verb. Within this header is the parameter,
	 * which in this case would be String[] args.
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to my Integration Project!");
		System.out.println("This program will quiz you based on how knowledgable"
				+ " you are with champion quotes from League of Legends.");
		System.out.println(
				"Type 1 to take the quiz.\n"
				+ "Type 2 to try the Random Champion Game.\n"
				+ "Type 3 enter a number for a champion output.\n"
				+ "Type 4 to compare the Strings of two champions.\n"
				+ "Type 5 to end the program.");
		// Menu screen
		boolean runProgram = true;
		while (runProgram) {
			Scanner scan = new Scanner(System.in);
			int select = 0;
			int score = 0;
			String choice = "";
			select = scan.nextInt();
			switch (select) {
			case 1:
				choice = scan.nextLine();
					Question question1 = new Question();
					question1.setQuestion("Question1\n");
					question1.setChoiceA("A\n");
					question1.setChoiceB("B\n");
					question1.setChoiceC("C\n");
					question1.setChoiceD("D");
					System.out.println(question1.getQuestion() + "A: " + question1.getChoiceA() + "B: "
							+ question1.getChoiceB() + "C: " + question1.getChoiceC() + "D: " + question1.getChoiceD());
					choice = scan.nextLine();
					if (choice.equals("A")) {
						score--;
					} else if (choice.equals("B")) {
						score--;
					} else if (choice.equals("C")) {
						score++;
					} else if (choice.equals("D")) {
						score--;
					} else {
						score--;
					}
					Question question2 = new Question();
					question2.setQuestion("Question2\n");
					question2.setChoiceA("A\n");
					question2.setChoiceB("B\n");
					question2.setChoiceC("C\n");
					question2.setChoiceD("D");
					System.out.println(question2.getQuestion() + "A: " + question2.getChoiceA() + "B: "
							+ question2.getChoiceB() + "C: " + question2.getChoiceC() + "D: " + question2.getChoiceD());
					choice = scan.nextLine();
					if (choice.equals("A")) {
						score++;
					} else if (choice.equals("B")) {
						score--;
					} else if (choice.equals("C")) {
						score--;
					} else if (choice.equals("D")) {
						score--;
					} else {
						score--;
					}
					Question question3 = new Question();
					question3.setQuestion("Question3\n");
					question3.setChoiceA("A\n");
					question3.setChoiceB("B\n");
					question3.setChoiceC("C\n");
					question3.setChoiceD("D");
					System.out.println(question3.getQuestion() + "A: " + question3.getChoiceA() + "B: "
							+ question3.getChoiceB() + "C: " + question3.getChoiceC() + "D: " + question3.getChoiceD());
					choice = scan.nextLine();
					if (choice.equals("A")) {
						score--;
					} else if (choice.equals("B")) {
						score--;
					} else if (choice.equals("C")) {
						score++;
					} else if (choice.equals("D")) {
						score--;
					} else if (choice.equals("AB"))  {
						score += score + 1;
					} else {
						score--;
					}
					Rating ratingResult = new Rating();
					ratingResult.setScoreResult(score);
					ratingResult.setBronzeRating("Bronze");
					ratingResult.setSilverRating("Silver");
					ratingResult.setGoldRating("Gold");
					ratingResult.setPlatinumRating("Platinum");
					ratingResult.setDiamondRating("Diamond");
					System.out.println("Score: " + Math.ceil(ratingResult.getScoreResult())); // Math.ceil rounds up																			// score
					if (score <= 0) {
						System.out.println("Here is your result: " + ratingResult.getBronzeRating());
					} else if (score == 1) {
						System.out.println("Here is your result: " + ratingResult.getSilverRating());
					} else if (score == 2) {
						System.out.println("Here is your result: " + ratingResult.getGoldRating());
					} else if (score == 3) {
						System.out.println("Here is your result: " + ratingResult.getPlatinumRating());
					} else if (score >= 4) {
						System.out.println("Here is your result: " + ratingResult.getDiamondRating());
					}
					System.out.println(
							"Type 1 to re-take the quiz.\n"
							+ "Type 2 to try the Random Champion Game.\n"
							+ "Type 3 enter a number for a champion output.\n"
							+ "Type 4 to compare the Strings of two champions.\n"
							+ "Type 5 to end the program.");
					break;
			case 2:
				Champion myChamp = new Champion();
				System.out.println("Random Champion Game");
				myChamp.ranChamp();
				System.out.println(
						"Type 1 to take the quiz.\n"
						+ "Type 2 to retry the Random Champion Game.\n"
						+ "Type 3 enter a number for a champion output.\n"
						+ "Type 4 to compare the Strings of two champions.\n"
						+ "Type 5 to end the program.");
				break;
			case 3:
				int champInt = 0;
				String champResult = "unknown";
				champResult = String.valueOf(champInt);
				System.out.println("Enter a number: ");
				champInt = scan.nextInt();
				do {
				if (champInt >= 0 || champInt <= 0) {
					champInt = champInt + 150 - 100 * 2 / 3 % 4;
					if (champInt <= 0)  {
						champResult = "Zed";
						System.out.println(champResult);
					} else if (champInt == 1) {
						
						// ? is the ternary opertator
						//variable x = (expression) ? value if true: value if false
						//https://www.tutorialspoint.com/Java-Ternary-Operator-Examples
						//Enter -147 to get Teemo
						
						champInt = (champInt == 1) ? 1: 99;
						champResult = "Teemo";
						System.out.println(champResult);
					} else if (champInt <= 100)  {
						champResult = "Yasuo";
						System.out.println(champResult);
					} else if (champInt <= 200)  {
						champResult = "Talon";
						System.out.println(champResult);
					} else if (champInt <= 300)  {
						champResult = "Leblanc";
						System.out.println(champResult);
					} else if (champInt == 999)  {
						continue; //skips this part of the loop to the end.
					}
				}
				} while(champInt == 0);
				System.out.println(
						"Type 1 to take the quiz.\n"
						+ "Type 2 to try the Random Champion Game.\n"
						+ "Type 3 re-enter a number for a champion output.\n"
						+ "Type 4 to compare the Strings of two champions.\n"
						+ "Type 5 to end the program.");
				break;
			case 4:
				int programCase4 = 1;
				String choice1 = "";
				String choice2 = "";
				while(programCase4 == 1) {
				String champ1 = "Ahri";
				String champ2 = "Kayle";
				String champ3 = "Varus";
				choice = scan.nextLine();
				System.out.println("Enter a champion: ");
				choice1 = scan.nextLine();
				System.out.println("Enter a second champion: ");
				choice2 = scan.nextLine();
				if (choice1.equals(champ1) && choice2.equals(champ2)) {
				System.out.println(champ1.compareTo(champ2));
				System.out.println("Type 1 to try again. Type 2 to quit.");
				}
				else if (choice1.equals(champ2) && choice2.equals(champ1)) {
					System.out.println(champ2.compareTo(champ1));
					System.out.println("Type 1 to try again. Type 2 to quit.");
				}
				else if (choice1.equals(champ3) && choice2.equals(champ1)) {
					System.out.println(champ3.compareTo(champ1));
					System.out.println("Type 1 to try again. Type 2 to quit.");
				}
				else {
					System.out.println("Invalid entry. Type 1 to try again. Type 2 to quit.");
					programCase4 = scan.nextInt();
				}
				}
				System.out.println(
						"Type 1 to take the quiz.\n"
						+ "Type 2 to retry the Random Champion Game.\n"
						+ "Type 3 enter a number for a champion output.\n"
						+ "Type 4 to re-compare the Strings of two champions.\n"
						+ "Type 5 to end the program.");
				break;
			case 5:
				System.out.println("Thanks for playing!");
				runProgram = false;
				break; //terminates loop/program.
			default:
				System.out.println("Invalid choice. Try again.");
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
			 * The following few lines below are good examples of call and argument. For
			 * example, question1.setQuestion() would be considered the call. within its
			 * parentheses is the argument. In the example below, the argument would be
			 * ("Question1\n").
			 */

			/*
			 * One method of Strings that we will be using in this program is concatenating.
			 * The + operator is used to concatenate strings together, which helps create
			 * sentences out of strings. It is also useful for other purposes, such as
			 * making a multiple choice test like we are in this program.
			 */
		}
	}

}