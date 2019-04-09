import java.util.InputMismatchException;
import java.util.Scanner;

public class CrashCatcher {
	public static void getGoodInput(Scanner scan) {
		boolean gotGoodInput = false;
		int select = 0;
		int continueProgram = 0;
		do {
		try {
			continueProgram = scan.nextInt();
			select = scan.nextInt();
			gotGoodInput = true;
		} catch (InputMismatchException ex){
			System.out.println("Wrong input. Try again.");
			/*System.out.println("Type 1 to take the quiz.\n" + "Type 2 to try the Random Champion Game.\n"
				+ "Type 3 enter a number for a champion output.\n" + "Type 4 to compare the Strings of two champions.\n"
				+ "Type 5 to view the list of champions.\n" + "Type 6 to end the program.");*/
			scan.nextLine();
			}	
		} while (gotGoodInput == false);
	}
}
