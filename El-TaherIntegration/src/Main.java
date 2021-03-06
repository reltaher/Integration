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
public class Main {

  // To format with Google Style Java Guide, Ctrl+Shift+F

  /*
   * WHEN DOING SCANNERS: IF I GO FROM NUMBERS TO STRINGS CLEAR BUFFER FROM
   * PREVIOUS LINE. To do this: Before int a = scan.NextLine(); insert
   * scan.NextLine(); That way, string will read the keystroke rather than the
   * integer.
   */

  /*
   * In this program, we will be using Data-Types. These data-types will include
   * int, bool, and double.
   * 
   * Main primitive data types:
   * 
   * int: 32 bit integer and our main variable type. bool: true or false. double:
   * 64-bit floating point. Used for decimals.
   * 
   * Other data types that will not be used:
   * 
   * float: 32-bit floating point. Used for decimals, but doubles are preferred
   * over floats. byte: 8-bit integer. Data is not large enough to use. short:
   * 16-bit integer. Data is not large enough to use. (Note: Short IS used in this
   * program, but it is only used for casting purposes.) long: 64-bit integer.
   * char: used for unicode, which will not be necessary here.
   * 
   * Operator precedence - order in which operators are evaluated. This is
   * important to understand because a lot of operators are used in this program.
   * Precedence order:
   * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
   */

  /**
   * Main method, which is also a header. Public is an access modifier. void is
   * the return type meaning this method does not return anything. method names
   * should be in lowerCamelCase and be named with a verb. Within this header is
   * the parameter, which in this case would be String[] args. static belongs to
   * the class, not the object.
   * 
   * @param args - calls all arguments
   */
  public static void main(String[] args) {
    MainMenu menuscreen = new MainMenu(); // Creates an object from the MainMenu class.
    menuscreen.menu(); // Retrieves method from the MainMenu class.
  }
}