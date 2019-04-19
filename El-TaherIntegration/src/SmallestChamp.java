import java.util.Scanner;

//This class manually checks the smallest value stored in an array.
//We will use this class for the user to find the answer to a quiz question.
public class SmallestChamp {
    public void smallestChamp(Scanner scan) {
        boolean programCase7 = true;
        while (programCase7 == true) {
            /*
             * array declared with 4 values, index is ranged from 0 to 3. 35 is
             * at index 0 22 is at index 1 25 is at index 2 45 is at index 3.
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
            // Hidden answer to a quiz question
            boolean found = false;
            int index = 0;
            while (found == false && index < smallestChamp.length) {
                if (smallestChamp[index] == 22) {
                    found = true;
                } else {
                    index = index + 1;
                }
                if (found) {
                    System.out.println("\nThe answer is Orianna, age: "
                            + smallest + " (located at index " + index + ")");
                }
            }
            // prints the sum of the values in the array.
            System.out.println("The sum of the ages are: " + sum);
            System.out.println();
            programCase7 = false;
        }
    }
}