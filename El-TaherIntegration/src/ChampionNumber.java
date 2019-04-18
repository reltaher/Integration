import java.util.Scanner;
//This Project has been created by Ramzy El-Taher.

public class ChampionNumber {
	public void champNum(Scanner scan) {
		int champInt = 0;
		int programCase3 = 0;
		String champResult = "unknown";
		champResult = String.valueOf(champInt);
		while (programCase3 == 0) {
			System.out.println("Enter a number: ");
			while (programCase3 == 0) {
				try {
					champInt = scan.nextInt();
					programCase3 = 1;
					break;
				} catch (Exception ex) {
					System.out.println("Try again");
					scan.nextLine();
				}
			}
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
		}
		System.out.println("Type 1 to take the quiz.");
		System.out.println("Type 2 to try the Random Champion Game.");
		System.out.println("Type 3 enter a number for a champion output.");
		System.out.println("Type 4 to compare the Strings of two champions.");
		System.out.println("Type 5 to view the list of champions.");
		System.out.println("Type 6 to view the ranks that you can obtain from the quiz.");
		System.out.println("Type 7 to end the program.");
	}
}
