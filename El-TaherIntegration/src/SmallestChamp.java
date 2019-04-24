import java.util.Scanner;

/**
 * Represents the author of this program, who is a student currently enrolled at
 * FGCU.
 * 
 * @author reltaher
 *
 */

/*
 * This program contains different game modes which is based on the game
 * "League of Legends". The game modes include a quiz, random champion game,
 * champion number game, and comparing champion strings.
 */

public class SmallestChamp {
  // This class manually checks the smallest value stored in an array.
  // The purpose of this class is for the user to find the answer to a quiz
  // question.

  /**
   * Method with constructor being passed down. The method is used in
   * MainMenu.java as a hidden case to give the user two answers in Quiz.java
   * 
   * @param scan passes down the Scanner object named "scan".
   */
  public void smallestChamp(Scanner scan) {
    boolean programCase7 = true;
    while (programCase7 == true) {
      /*
       * array declared with 4 values, index is ranged from 0 to 3. 35 is at index 0
       * 22 is at index 1 25 is at index 2 45 is at index 3.
       */
      int[] smallestChamp = { 35, 22, 25, 45 };
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
          System.out
              .println("\nOrianna is " + smallest + " years old (located at index " + index + ").");
        }
      }
      // prints the sum of the values in the array.
      System.out.println("Graves, Orianna, Lucian, Olaf combined ages is " + sum + ".");
      System.out.println();
      programCase7 = false;
    }
  }
}