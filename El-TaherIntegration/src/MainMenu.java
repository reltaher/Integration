import java.util.InputMismatchException;
import java.util.Scanner;
/** Represents the author of this program, who is a student currently enrolled at FGCU.
 * @author eltah
 *
 */

public class MainMenu {
  /** Method named "menu" that was passed down from Main.java.
   * 
   */
  public void menu() {
    System.out.println("Welcome to my Integration Project!");
    System.out.println("This program will quiz you based on how knowledgable"
        + " you are with champion quotes from League of Legends.");
    System.out.println();
    // Menu screen
    boolean runProgram = true;
    // When a variable has the final keyword, it means that the variable cannot be
    // replaced.
    final Scanner scan = new Scanner(System.in, "utf-8");
    int select = 0;
    while (runProgram) {

      boolean goodInput = false;
      while (goodInput == false) {
        System.out.println("Type 1 to take the quiz.");
        System.out.println("Type 2 to to view the ranks that you can obtain from the quiz.");
        System.out.println("Type 3 to try the Random Champion Game.");
        System.out.println("Type 4 enter a number for a champion output.");
        System.out.println("Type 5 to view the list of champions.");
        System.out.println("Type 6 to end the program.");
        try {
          // used for menu selection
          select = scan.nextInt(); // reads input for menu selection
          goodInput = true;
        } catch (InputMismatchException ex) {
          System.out.println("Invalid Entry.\n");
          scan.nextLine();
        } catch (Exception ex) {
          System.out.println("Not sure how you got here! Contact System admin.");
        }
      }
      // A switch statement is used to create the menu screen.
      switch (select) {
        case 1:
          Quiz takeQuiz = new Quiz(); // creates a quiz object.
          takeQuiz.quizStart(scan); // takes code from the Quiz class.
          break; // terminates this specific case after user is finished
        case 2:
          Result showrank = new Result();
          showrank.displayResults(scan);
          break;
        case 3:
          RandomChampion myChamp = new RandomChampion();
          System.out.println("Random Champion Game");
          myChamp.ranChamp(scan);
          break;
        case 4:
          ChampionNumber startNumGame = new ChampionNumber();
          startNumGame.champNum(scan);
          break;
        case 5:
          ChampionList champs = new ChampionList();
          champs.champList(scan);
          break;
        case 6:
          System.out.println("Thanks for playing!");
          runProgram = false;
          break; // terminates loop/program
        case 7:
          SmallestChamp start = new SmallestChamp();
          start.smallestChamp(scan);
          break;
        default:
          System.out.println("Invalid choice. Try again.");
      }
    }
  }
}