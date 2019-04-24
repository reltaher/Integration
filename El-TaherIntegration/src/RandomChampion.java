import java.util.InputMismatchException;
import java.util.Random;
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
public class RandomChampion {
  /**
   * Method with constructor being passed down. The method is a minigame that is
   * used in MainMenu.java.
   * 
   * @param scan passes down the Scanner object named "scan".
   */
  public void ranChamp(Scanner scan) {
    /*
     * I will be using the Random class for a different setting rather than for the
     * quiz. What I plan to do is to assign specific integers (EX: 10-20) to a
     * champion in LoL. When the program prints out the number, whatever number is
     * printed out will also print the champion that is associated with the number.
     * This will just be a fun side game in this program.
     * 
     * More will be added on to this later.
     */
    Random randomNumber = new Random();
    int championRanNum;
    String champion = "unknown";
    // There has to be something IN the loop to change the condition.
    for (int programCase2 = 1; programCase2 <= 1; programCase2++) {
      championRanNum = randomNumber.nextInt(101);

      /*
       * valueOf(); is another string method that this program utilizes. What
       * valueOf(); does is that it converts our variables into a string. The reason
       * why we want to convert the int variable "number" to a string is because we
       * will need the string form of this variable to convert the number into the
       * string "Champion" in order to output a champion name.
       */
      // Will add more champions later.
      champion = String.valueOf(championRanNum);
      System.out.println(championRanNum);
      if (championRanNum <= 0) {
        champion = "Ashe";
      } else if (championRanNum <= 10) {
        champion = "Ekko";
      } else if (championRanNum <= 20) {
        champion = "Gragas";
      } else if (championRanNum <= 30) {
        champion = "Ahri";
      } else if (championRanNum <= 40) {
        champion = "Xerath";
      } else if (championRanNum <= 50) {
        champion = "Urgot";
      } else if (championRanNum <= 60) {
        champion = "Yorick";
      } else if (championRanNum <= 70) {
        champion = "Ivern";
      } else if (championRanNum <= 80) {
        champion = "Rek'sai";
      } else if (championRanNum <= 90) {
        champion = "Elise";
      } else if (championRanNum < 100) {
        champion = "Hecarim";
      } else if (championRanNum == 100) {
        champion = "Kha'Zix";
      } else {
        System.out.println("Something went wrong...");
      }
      System.out.println(champion);
      System.out.println("Type 0 to obtain another champion. Type 1 to return to main menu.");
      boolean goodInput = false;
      while (goodInput == false) {
        try {
          programCase2 = scan.nextInt();
          goodInput = true;
        } catch (InputMismatchException ex) {
          System.out.println("Invalid input. Please try again.");
          scan.nextLine();
        } catch (Exception ex) {
          System.out.println("Not sure how you got here! Contact system admin.");
        }
      }
    }
  }
}
