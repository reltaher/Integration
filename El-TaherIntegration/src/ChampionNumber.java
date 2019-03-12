import java.util.Scanner;
//This Project has been created by Ramzy El-Taher.

public class ChampionNumber {
	public void champNum(Scanner scan) {
		int champInt = 0;
		int programCase3 = 0;
		String champResult = "unknown";
		champResult = String.valueOf(champInt);
		do {
			System.out.println("Enter a number: ");
			champInt = scan.nextInt();
			if (champInt >= 0 || champInt <= 0) {
				champInt = champInt + 150 - 100 * 2 / 3 % 4;
				if (champInt <= 0) {
					champResult = "Zed";
					System.out.println(champResult);
					champInt = scan.nextInt();
				} else if (champInt == 1) {

					// ? is the ternary operator
					// variable x = (expression) ? value if true: value if false
					// https://www.tutorialspoint.com/Java-Ternary-Operator-Examples
					// Enter -147 to get Teemo

					champInt = (champInt == 1) ? 1 : 99;
					champResult = "Teemo";
					System.out.println(champResult);
				} else if (champInt <= 100) {
					champResult = "Yasuo";
					System.out.println(champResult);
				} else if (champInt <= 200) {
					champResult = "Talon";
					System.out.println(champResult);
				} else if (champInt <= 300) {
					champResult = "Leblanc";
					System.out.println(champResult);
				} else if (champInt >= 300) {
					champResult = "Vi";
					System.out.println(champResult);
				} else if (champInt == 999) {
					continue; // skips this part of the loop to the end.
				} else {
					System.out.println("Invalid Entry.");
				}
				System.out.println("Type 0 to try again. Type 1 to return to main menu.");
				programCase3 = scan.nextInt();
			}
		} while (programCase3 == 0);
		System.out.println("Type 1 to take the quiz.\n" + "Type 2 to try the Random Champion Game.\n"
				+ "Type 3 re-enter a number for a champion output.\n"
				+ "Type 4 to compare the Strings of two champions.\n" + "Type 5 to end the program.");
	}
}
