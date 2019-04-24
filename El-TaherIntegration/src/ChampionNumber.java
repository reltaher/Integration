import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Represents the author of this program, who is a student currently enrolled at
 * FGCU.
 * 
 * @author reltaher
 *
 */

/*
 * This program is primarily a quiz based on the game "League of Legends". Some
 * of the other modes in this program, such as the Random Champion game,
 * Champion Number game, and Champion List, contain information that gives the
 * user an answer to one of the quiz questions.
 * 
 * What this code accomplishes is a friendly user interface throughout the whole
 * program, with a menu selection for each different mode, such as the quiz or
 * the Random Champion game. For each game mode, the code will prompt the user
 * if they wish to continue or not, if they do not wish to continue, then it
 * will prompt them back to the main menu. If the user wishes to quit out of the
 * program, then case 6 will terminate the program for them, giving them a
 * friendly exiting message.
 */
public class ChampionNumber {
  /**
   * Method with constructor being passed down. The method is a minigame that is
   * used in MainMenu.java.
   * 
   * @param scan passes down the Scanner object named "scan".
   */
  public void champNum(Scanner scan) {
    double champInt = 0.0;
    String programCase3 = "Y";
    String champResult = "unknown";
    champResult = String.valueOf(champInt);
    while (programCase3.equalsIgnoreCase("Y")) {
      System.out.println("Enter a number: ");
      boolean goodInput = false;
      while (goodInput == false) {
        try {
          champInt = scan.nextDouble();
          goodInput = true;
        } catch (InputMismatchException ex) {
          System.out.println("Invalid input, type a number.");
          scan.nextLine();
        } catch (Exception ex) {
          System.out.println("Not sure how you got here! Contact System admin.");
        }
      }
      if (champInt >= 0 || champInt <= 0) {
        champInt += 150 - 100 * 2 / 3 % 4;
        if (champInt <= 0) {
          champResult = "Zilean";
        } else if (champInt == 0) {
          champResult = "Zed";
        } else if (champInt == 1) {

          // ? is the ternary operator.
          // variable x = (expression) ? value if true: value if false
          // https://www.tutorialspoint.com/Java-Ternary-Operator-Examples
          // Enter -147 to get Teemo.

          champInt = (champInt == 1) ? 1 : 99;
          champResult = "Teemo";
        } else if (champInt <= 50) {
          champResult = "Nami";
        } else if (champInt <= 100) {
          champResult = "Yasuo";
        } else if (champInt <= 200) {
          champResult = "Talon";
        } else if (champInt <= 300) {
          champResult = "Leblanc";
        } else if (champInt <= 400) {
          champResult = "Vi";
        } else if (champInt <= 500) {
          champResult = "Jayce";
        } else if (champInt <= 1000) {
          champResult = "Rammus";
        } else if (champInt <= 2000) {
          champResult = "Alistar";
        } else if (champInt <= 3000) {
          champResult = "Quinn";
        } else if (champInt <= 4000) {
          champResult = "Rumble";
        } else if (champInt <= 5000) {
          champResult = "Ryze";
        } else if (champInt <= 10000) {
          champResult = "Skarner";
        } else if (champInt >= 10000) {
          champResult = "Zilean";
        } else {
          System.out.println("Undetected Error.");
        }
        System.out.println(champResult + "\n");
        System.out.println("Would you like to try another number? Type Y to retry, or type "
            + "any other character to return to the main menu.");
        programCase3 = scan.next();
      }
    }
  }
}
