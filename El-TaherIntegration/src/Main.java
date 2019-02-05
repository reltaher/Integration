// This Project has been created by Ramzy El-Taher.
// This program is a quiz on how well you know champion quotes from the game "League of Legends".
// At the end, it will display your result, which ranges from Bronze to Diamond.

/*
 * WHEN DOING SCANNERS: IF I GO FROM NUMBERS TO STRINGS CLEAR BUFFER FROM PREVIOUS LINE.
 * To do this:
 * Before int a = scan.NextLine(); insert scan.NextLine(); That way, string will read the keystroke
 * rather than the integer.
 */

//To format with Google Style Java Guide, Ctrl+Shift+F
public class Main {

  // This is a header.
  // Public is an access modifier.
  // void is the return type meaning this method does not return anything.
  // method names should be in lowerCamelCase and be named with a verb.
  public static void main(String[] args) {
    System.out.println("Welcome to my Integration Project!");
    System.out.println("This program will quiz you based on how knowledgable"
        + " you are with champion quotes from League of Legends.");

    /*
     * In this program, we will be using Data-Types.
     * These data-types will include int, bool, and
     * double.
     * 
     * Main primitive data types:
     * 
     * int: 32 bit integer and our main variable type.
     * bool: true or false
     * double: 64-bit floating point. Used for decimals.
     * 
     * Other data types that will not be used:
     * 
     * float: 32-bit floating point. Used for decimals, but doubles are preferred over floats.
     * byte: 8-bit integer. Data is not large enough to use.
     * short: 16-bit integer. Data is not large enough to use.
     * (Note: Short IS used in this program, but it is only used for casting
     * purposes.) 
     * long: 64-bit integer. char: used for unicode, which will not be necessary here.
     */
    Question question1 = new Question();
    question1.question = "Question1\n"; // the \n is a type of escape sequence which stands for
                                        // newline.
    question1.choiceA = "A\n"; // \n (newline) creates a new line for the next string (EX: A is
                               // below the first question).
    question1.choiceB = "B\n";
    question1.choiceC = "C\n";
    question1.choiceD = "D";
    Question question2 = new Question();
    question2.question = "Question2\n";
    question2.choiceA = "A\n";
    question2.choiceB = "B\n";
    question2.choiceC = "C\n";
    question2.choiceD = "D";
    Question question3 = new Question();
    question3.question = "Question3\n";
    question3.choiceA = "A\n";
    question3.choiceB = "B\n";
    question3.choiceC = "C\n";
    question3.choiceD = "D";
    Rating ratingResult = new Rating();
    ratingResult.setBronzeRating("Bronze");
    ratingResult.setSilverRating("Silver");
    ratingResult.goldRating = "Gold";
    ratingResult.platinumRating = "PLatinum";
    ratingResult.diamondRating = "Diamond";
    
    
    
    /*
     * One method of Strings that we will be using in this program is concatenating. The + operator
     * is used to concatenate strings together, which helps create sentences out of strings. It is
     * also useful for other purposes, such as making a multiple choice test like we are in this
     * program.
     */

    System.out.println(question1.question + question1.choiceA + question1.choiceB
        + question1.choiceC + question1.choiceD);
    System.out.println(question2.question + question2.choiceA + question2.choiceB
        + question2.choiceC + question2.choiceD);
    System.out.println(question3.question + question3.choiceA + question3.choiceB
        + question3.choiceC + question3.choiceD);
    System.out.println("Here is your result: " + ratingResult.getBronzeRating());
    System.out.println("Here is your result: " + ratingResult.getSilverRating());
    System.out.println("Here is your result: " + ratingResult.goldRating);
    System.out.println("Here is your result: " + ratingResult.platinumRating);
    System.out.println("Here is your result: " + ratingResult.diamondRating);

  }
}


class Question {

  /*
   * Everything in this code block would be defined as a scope. A scope is where all the variables
   * are located in. Variables: location in memory. In this case, the location of the variables
   * would be in the class of the object.
   */

  static final double time = 10.25; // the time you have for each question. Final variable will
                                    // prevent the time from changing.
  String question;
  String choiceA;
  String choiceB;
  String choiceC;
  String choiceD;
  boolean correctAnswer = true;
  boolean incorrectAnswer = false;

}


class Rating {

  int points = 0;
  short score = (short) points; // This line indicates casting, which converts a type of value into
                                // another. (EX: short to int)
  private String bronzeRating = "0";
  private String silverRating = "1";
  String goldRating = "2";
  String platinumRating = "3";
  String diamondRating = "4";
  
  public String getBronzeRating() {
	  return bronzeRating;
  }
  
  public void setBronzeRating(String newBronzeRating)  {
	  bronzeRating = newBronzeRating;
  }
  
  public String getSilverRating() {
	  return silverRating;
  }
  
  public void setSilverRating(String newSilverRating)  {
	  silverRating = newSilverRating;
  }

  /*
   * valueOf(); is another string method that this program utilizes. What valueOf(); does is that
   * it converts our variables into a string. The reason why we want to convert the int variable
   * "score" to a string is because we will need the string form of this variable to convert the
   * score into the type of result that the user gets.
   */

  String ratingResult = String.valueOf(score);
  
  
  
}
