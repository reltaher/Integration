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
public class Question {

  /*
   * Everything in this class would be defined as scope. Scope is where all the
   * variables are located in. (Variables = location in memory). In this case, the
   * location of the variables would be in the class of the object.
   * 
   * For this project, we want to set our fields in each class private. When a
   * field is set to private, the main class is unable to locate these strings.
   * This is due to the concept of scope, which the scope of these strings are
   * located in the Rating class.
   * 
   * In order for main to find these fields, I use the getter/setter method. For
   * strings within this class, I set a public string for each private string that
   * we have. We then have to return the string which allows it to be prepared to
   * be shipped to the main method.
   *
   * After using the get method, I now have to use the set method. The set method
   * will create a new string, which we can set equal to out old string. This will
   * then allow the string to be shipped to the main class.
   */
  private String questionText;
  private String correctAnswer;

  /**
   * Gets questionText.
   * 
   * @return questionText.
   */
  public String getQuestionText() {
    return questionText;
  }

  /**
   * Method with a constructor containing a String variable being passed down.
   * 
   * @param newQuestionText - the new name for the String variable "questionText"
   *                        which is used as a setter.
   */
  public void setQuestionText(String newQuestionText) {
    this.questionText = newQuestionText;
  }

  /**
   * Gets correctAnswer.
   * 
   * @return correctAnswer.
   */
  public String getCorrectAnswer() {
    return correctAnswer;
  }

  /**
   * Method with a constructor containing a String variable being passed down.
   * 
   * @param newCorrectAnswer - the new name for the String variable
   *                         "correctAnswer" which is used as a setter.
   */
  public void setCorrectAnswer(String newCorrectAnswer) {
    this.correctAnswer = newCorrectAnswer;
  }

  /**
   * Method named "askQuestion" - used with super to print "Question " for each
   * question in the quiz.
   */
  public void askQuestion() {
    System.out.print("Question ");
  }
}
