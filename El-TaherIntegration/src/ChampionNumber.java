import java.util.Scanner;
//This Project has been created by Ramzy El-Taher.

class ChampionNumber {
	public void champNum(Scanner scan) {
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
				
				// ? is the ternary operator
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
	}

}
