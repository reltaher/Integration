import java.util.InputMismatchException;
import java.util.Scanner;
//This Project has been created by Ramzy El-Taher.

public class ChampionNumber {
  /** Method with constructor being passed down.
   * The method is a minigame that is used in MainMenu.java.
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
          champResult = "Zed";
          // System.out.println(champResult);
        } else if (champInt == 1) {

          // ? is the ternary operator
          // variable x = (expression) ? value if true: value if false
          // https://www.tutorialspoint.com/Java-Ternary-Operator-Examples
          // Enter -147 to get Teemo

          champInt = (champInt == 1) ? 1 : 99;
          champResult = "Teemo";
        } else if (champInt <= 100) {
          champResult = "Yasuo";
        } else if (champInt <= 200) {
          champResult = "Talon";
        } else if (champInt <= 300) {
          champResult = "Leblanc";
        } else if (champInt >= 300) {
          champResult = "Vi";
        } else {
          System.out.println("Undetected Error.");
        }
        System.out.println(champInt);
        System.out.println(champResult + "\n");
        System.out.println("Would you like to try another number? Y/N");
        programCase3 = scan.next();
      }
    }
  }
}
