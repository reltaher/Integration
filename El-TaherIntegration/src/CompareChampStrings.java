import java.util.Scanner;
//This project has been created by Ramzy El-Taher.

public class CompareChampStrings {
	public void startCompare(Scanner scan) {
		int programCase4 = 0;
		String buffer = "";
		String choice1 = "";
		String choice2 = "";
		while (programCase4 == 0) {
			System.out.println("Available champions: Amumu, Kayle, Varus");
			String champ1 = "Amumu";
			String champ2 = "Kayle";
			String champ3 = "Varus";
			buffer = scan.nextLine();
			System.out.println("Enter a champion: ");
			choice1 = scan.nextLine();
			System.out.println("Enter a second champion: ");
			choice2 = scan.nextLine();
			if (choice1.equalsIgnoreCase(champ1) && choice2.equalsIgnoreCase(champ2)) {
				System.out.println("You get: " + champ1.compareTo(champ2));
				System.out.println("Type 0 to try again. Type 1 to return to main menu.");
				programCase4 = scan.nextInt();
			} else if (choice1.equalsIgnoreCase(champ2) && choice2.equalsIgnoreCase(champ1)) {
				System.out.println("You get: " + champ2.compareTo(champ1));
				System.out.println("Type 0 to try again. Type 1 to return to main menu.");
				programCase4 = scan.nextInt();
			} else if (choice1.equalsIgnoreCase(champ3) && choice2.equalsIgnoreCase(champ1)) {
				System.out.println("You get: " + champ3.compareTo(champ1));
				System.out.println("Type 0 to try again. Type 1 to return to main menu.");
				programCase4 = scan.nextInt();
			} else if (choice1.equalsIgnoreCase(champ1) && choice2.equalsIgnoreCase(champ3)) {
				System.out.println("You get: " + champ1.compareTo(champ3));
				System.out.println("Type 0 to try again. Type 1 to return to main menu.");
				programCase4 = scan.nextInt();
			} else {
				System.out.println("Invalid entry." + "Type 0 to try again. Type 1 to return to main menu.");
				programCase4 = scan.nextInt();
			}
		}
		System.out.println("Type 1 to take the quiz.\n" + "Type 2 to try the Random Champion Game.\n"
				+ "Type 3 enter a number for a champion output.\n" + "Type 4 to compare the Strings of two champions.\n"
				+ "Type 5 to view the list of champions.\n" + "Type 6 to end the program.");
	}

}
