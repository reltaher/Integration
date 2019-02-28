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
		Scanner scan = new Scanner(System.in);
		while (runProgram) {
			int select = 0;
			select = scan.nextInt();
			switch (select) {
			case 1:
				Quiz takeQuiz = new Quiz();
				takeQuiz.quizStart(scan);
					System.out.println(
							"Type 1 to re-take the quiz.\n"
							+ "Type 2 to try the Random Champion Game.\n"
							+ "Type 3 enter a number for a champion output.\n"
							+ "Type 4 to compare the Strings of two champions.\n"
							+ "Type 5 to end the program.");
					break;
			case 2:
				RandomChampion myChamp = new RandomChampion();
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
				ChampionNumber startNumGame = new ChampionNumber();
				startNumGame.champNum(scan);
				System.out.println(
						"Type 1 to take the quiz.\n"
						+ "Type 2 to try the Random Champion Game.\n"
						+ "Type 3 re-enter a number for a champion output.\n"
						+ "Type 4 to compare the Strings of two champions.\n"
						+ "Type 5 to end the program.");
				break;
			case 4:
				CompareChampStrings useCompare = new CompareChampStrings();
				useCompare.startCompare(scan);
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