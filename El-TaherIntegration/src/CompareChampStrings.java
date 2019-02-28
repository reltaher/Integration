import java.util.Scanner;

class CompareChampStrings {
	public void startCompare(Scanner scan) {
		int programCase4 = 1;
		String buffer = "";
		String choice1 = "";
		String choice2 = "";
		while(programCase4 == 1) {
		String champ1 = "Ahri";
		String champ2 = "Kayle";
		String champ3 = "Varus";
		buffer = scan.nextLine();
		System.out.println("Enter a champion: ");
		choice1 = scan.nextLine();
		System.out.println("Enter a second champion: ");
		choice2 = scan.nextLine();
		if (choice1.equalsIgnoreCase(champ1) && choice2.equalsIgnoreCase(champ2)) {
		System.out.println(champ1.compareTo(champ2));
		System.out.println("Type 1 to try again. Type 2 to quit.");
		}
		else if (choice1.equalsIgnoreCase(champ2) && choice2.equalsIgnoreCase(champ1)) {
			System.out.println(champ2.compareTo(champ1));
			System.out.println("Type 1 to try again. Type 2 to quit.");
		}
		else if (choice1.equalsIgnoreCase(champ3) && choice2.equalsIgnoreCase(champ1)) {
			System.out.println(champ3.compareTo(champ1));
			System.out.println("Type 1 to try again. Type 2 to quit.");
		}
		else {
			System.out.println("Invalid entry. Type 1 to try again. Type 2 to quit.");
			programCase4 = scan.nextInt();
		}
		}
	}

}
