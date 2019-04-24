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
public class Result {
  private int score;
  private int incorrectAnswers;

  /**
   * Gets score.
   * 
   * @return score.
   */
  public int getScore() {
    return score;
  }

  /**
   * Method with a constructor containing a short variable being passed down.
   * 
   * @param newScore - the new name for the int datatype "score" which is used as
   *                 a setter.
   */
  public void setScore(short newScore) {
    // When you want to convert a variable to another, use casting.
    // This line of code has a short variable being converted to an int variable.
    score = (int) newScore;
  }

  /**
   * Method with a constructor containing an int variable being passed down. A
   * short datatype of the same variable was also being passed down. This
   * represents overloading.
   * 
   * @param newScore - the new name for the int datatype "score" which is used as
   *                 a setter.
   */
  public void setScore(int newScore) {
    score = newScore;
  }

  /**
   * Gets incorrectAnswers.
   * 
   * @return incorrectAnswers.
   */
  public int getIncorrectAnswers() {
    return incorrectAnswers;
  }

  /**
   * Method with a constructor containing an int variable being passed down.
   * 
   * @param newIncorrectAnswers - the new name for the int datatype
   *                            "incorrectAnswers" which is used as a setter.
   */
  public void setIncorrectAnswers(int newIncorrectAnswers) {
    incorrectAnswers = newIncorrectAnswers;
  }

  /**
   * Method that is used in Quiz.java to display the user's score.
   * 
   */
  public void displayScore() {
    String rating = "";
    if (score <= 0) {
      score = 0;
      rating = "Iron";
    } else if (score == 1) {
      rating = "Bronze";
    } else if (score <= 3) {
      rating = "Silver";
    } else if (score <= 5) {
      rating = "Gold";
    } else if (score <= 7) {
      rating = "Platinum";
    } else if (score <= 9) {
      rating = "Diamoond";
    } else if (score <= 12) {
      rating = "Master";
    } else if (score <= 14) {
      rating = "Grandmaster";
    } else if (score == 15) {
      rating = "Challenger";
    } else {
      System.out.println("The quiz has encountered an error while displaying a result.");
    }
    System.out.println("Score: " + score + "\nHere is your result: " + rating);
    // Math.abs takes the absolute value of a number (prevents negative results).
    System.out.println("Incorrect Answers: " + Math.abs(incorrectAnswers));
  }

  /**
   * Method with constructor being passed down that is used to display the ranks
   * in MainMenu.java.
   * 
   * @param scan passes down the Scanner object named "scan".
   */
  public void displayResults(Scanner scan) {
    String programCase2 = "Y";
    while (programCase2.equals("Y")) {
      System.out.println("Here are the possible ranks you can get from the quiz: ");
      System.out.println("-Iron");
      System.out.println("-Bronze");
      System.out.println("-Silver");
      System.out.println("-Gold");
      System.out.println("-Platinum");
      System.out.println("-Diamond");
      System.out.println("-Master");
      System.out.println("-Grandmaster");
      System.out.println("-Challenger");
      System.out.println();
      System.out.println(
          "Type Y to view the list again. Type any other charcter to return to main menu.");
      programCase2 = scan.next();
    }
  }
}