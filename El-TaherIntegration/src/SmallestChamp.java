import java.util.Scanner;

//This class manually checks the smallest value stored in an array.
//We will use this class for the user to find the answer to a quiz question (youngest champion)
public class SmallestChamp {
	public void smallestChamp(Scanner scan) {
		boolean programCase7 = true;
		while (programCase7 == true) {
			/*
			 * array declared with 4 values, index is ranged from 0 to 3. 35 is at index 0
			 * 22 is at index 1 25 is at index 2 45 is at index 3.
			 */
			int smallestChamp[] = { 35, 22, 25, 45 };
			int sum = 0;
			// first value is declared as smallest
			int smallest = smallestChamp[0];

			
			// smallest value in the array would be printed out.
			// Hidden answer to a quiz question

			// takes each value in the array and adds them together
			for (int i : smallestChamp) {
				sum += i;
				if (i < smallest) {
					smallest = i;
				}
			}
			// prints the sum of the values in the array. Hidden answer to a quiz question
			System.out.println("The answer is Orianna, age: " + smallest);
			System.out.println("The sum of the ages are: " + sum);
			System.out.println();
			// System.out.println("Type 1 to return to main menu.");
			programCase7 = false;
		}
		System.out.println("Type 1 to take the quiz.\n" + "Type 2 to try the Random Champion Game.\n"
				+ "Type 3 enter a number for a champion output.\n" + "Type 4 to compare the Strings of two champions.\n"
				+ "Type 5 to view the list of champions.\n" + "Type 6 to end the program.");
	}
}