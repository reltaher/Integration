import java.util.Scanner;

//This class manually checks the smallest value stored in an array.
//We will use this class for the user to find the answer to a quiz question (youngest champion)
public class SmallestChamp {
	public void smallestChamp(Scanner scan)  {
	int programCase6 = 0;
	while(programCase6 == 0)  {
		//array declared with 4 values, index is ranged from 0 to 3.
		int smallestChamp[] = {35, 22, 25, 45};
		//first value is declared as smallest
		int smallest = smallestChamp[0];
		//second value is declared as next, used to compare to smallest value.
		int next = smallestChamp[1];
			//if value at index 0 is LESS than value at index 1
			if (smallest < next)  {
				//smallest is declared as value at index 0
				smallest = smallestChamp[0];
				//next is declared as value at index 2 to compare 0 and 2.
				next = smallestChamp[2];
				//if value at index 0 is LESS than value at index 2
				if (smallest < next)  {
					//smallest is declared as value at index 0
					smallest = smallestChamp[0];
					//next is declared as value at index 3 to compare 0 and 3.
					next = smallestChamp[3];
					//if value at index 0 is less than value at index 3
					if (smallest < next)  {
						//smallest number is value at index 0
						smallest = smallestChamp[0];
					} else {
						//smallest number is value at index 3
						smallest = smallestChamp[3];
					}
				//if value at index 0 is GREATER than value at index 2
				} else {
					//smallest is declared as value at index 2
					smallest = smallestChamp[2];
					//next declared as value at index 3 to compare 2 and 3
					next = smallestChamp[3];
					//if value at index 2 is LESS than value at index 3
					if (smallest < next)  {
						//smallest number is value at index 2
						smallest = smallestChamp[2];
					//if value at index 2 is GREATER than value at index 3
					} else {
						//smallest number is value at index 3
						smallest = smallestChamp[3];
					}
				}
			//If value at index 0 is GREATER than value at index 1
			} else {
				//smallest is declared as value at index 1
				smallest = smallestChamp[1];
				//next is declared as value at index 2 to compare 1 and 2
				next = smallestChamp[2];
				//if value at index 1 is LESS than value at index 2
				if (smallest < next)  {
					//smallest is declared as value at index 1
					smallest = smallestChamp[1];
					//next is declared as value at index 3 to compare 1 and 3.
					next = smallestChamp[3];
					//if value at index 1 is LESS than value at index 3
					if (smallest < next)  {
						//smallest number would be value at index 1
						smallest = smallestChamp[1];
					//if value at index 1 is GREATER than value at index 3
					} else {
						//smallest number would be value at index 3
						smallest = smallestChamp[3];
					}
				//if value at index 1 is GREATER than value at index 2
				} else {
					//smallest is declared as value at index 2
					smallest = smallestChamp[2];
					//next is declared as value at index 3 to compare 2 and 3.
					next = smallestChamp[3];
					//if value at index 2 is LESS than value at index 3
					if (smallest < next)  {
						//smallest number would be value at index 2
						smallest = smallestChamp[2];
					//if value at index 2 is GREATER than value at index 3
					} else {
						//smallest number would be value at index 3
						smallest = smallestChamp[3];
					}
				}
			}
		//smallest value in the array would be printed out
		System.out.println("The answer is Orianna, age: " + smallest);
		System.out.println("Type 0 to retry. Type 1 to return to main menu.");
		programCase6 = scan.nextInt();
		}
	System.out.println("Type 1 to take the quiz.\n" + "Type 2 to try the Random Champion Game.\n"
			+ "Type 3 enter a number for a champion output.\n" + "Type 4 to compare the Strings of two champions.\n"
			+ "Type 5 to view the list of champions.\n" + "Type 6 to end the program.");
	}
}