import java.util.Scanner;

/*
 * This program contains different game modes which is based on the game "League of Legends".
 * The game modes include a quiz, random champion game, champion number game, and comparing
 * champion strings.
 */

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

public class MainMenu {
	public void menu()  {
		System.out.println("Welcome to my Integration Project!");
		System.out.println("This program will quiz you based on how knowledgable"
				+ " you are with champion quotes from League of Legends.");
		System.out.println();
		System.out.println("Type 1 to take the quiz.\n" + "Type 2 to try the Random Champion Game.\n"
				+ "Type 3 enter a number for a champion output.\n" + "Type 4 to compare the Strings of two champions.\n"
				+ "Type 5 to view the list of champions.\n" + "Type 6 to end the program.");
		// Menu screen
		boolean runProgram = true;
		Scanner scan = new Scanner(System.in);
		while (runProgram) {
			int select = 0; // used for menu selection
			select = scan.nextInt(); // reads input for menu selection
			// A switch statement is used to create the menu screen.
			switch (select) {
			case 1:
				Quiz takeQuiz = new Quiz(); // creates a quiz object.
				takeQuiz.quizStart(scan); // takes code from the Quiz class.
				break; // terminates this specific case after user is finished.
			case 2:
				RandomChampion myChamp = new RandomChampion();
				System.out.println("Random Champion Game");
				myChamp.ranChamp(scan);
				break;
			case 3:
				ChampionNumber startNumGame = new ChampionNumber();
				startNumGame.champNum(scan);
				break;
			case 4:
				CompareChampStrings useCompare = new CompareChampStrings();
				useCompare.startCompare(scan);
				break;
			case 5:
				ChampionList champs = new ChampionList();
				champs.champList(scan);
				break;
			case 6:
				System.out.println("Thanks for playing!");
				runProgram = false;
				break; // terminates loop/program.
			case 7:
				SmallestChamp start = new SmallestChamp();
				start.smallestChamp(scan);
				break;
			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
	}
}
