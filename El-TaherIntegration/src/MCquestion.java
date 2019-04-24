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
public class MCquestion extends Question {
  // This class utilizes inheritance.
  // Inheritance = one class containing the fields and methods of another class.
  // In this case, this class contains the properties from the Question class.
  // These fields and methods are obtained with the extends keyword.
  private String questionText;
  private String choiceA;
  private String choiceB;
  private String choiceC;
  private String choiceD;
  private String correctAnswer;

  /**
   * Gets questionText.
   * 
   * @return questionText.
   */
  public String getQuestionText() {
    return questionText;
  }

  public void setQuestionText(String newQuestionText) {
    questionText = newQuestionText;
  }

  /**
   * Gets choiceA.
   * 
   * @return choiceA.
   */
  public String getChoiceA() {
    return choiceA;
  }

  /**
   * Method with a constructor containing a String variable being passed down.
   * 
   * @param newChoiceA - the new name which is used as a setter.
   */
  public void setChoiceA(String newChoiceA) {
    choiceA = newChoiceA;
  }

  /**
   * Gets choiceB.
   * 
   * @return choiceB.
   */
  public String getChoiceB() {
    return choiceB;
  }

  /**
   * Method with a constructor containing a String variable being passed down.
   * 
   * @param newChoiceB - the new name which is used as a setter.
   */
  public void setChoiceB(String newChoiceB) {
    choiceB = newChoiceB;
  }

  /**
   * Gets choiceC.
   * 
   * @return choiceC.
   */
  public String getChoiceC() {
    return choiceC;
  }

  /**
   * Method with a constructor containing a String variable being passed down.
   * 
   * @param newChoiceC - the new name which is used as a setter.
   */
  public void setChoiceC(String newChoiceC) {
    choiceC = newChoiceC;
  }

  /**
   * Gets choiceD.
   * 
   * @return choiceD.
   */
  public String getChoiceD() {
    return choiceD;
  }

  /**
   * Method with a constructor containing a String variable being passed down.
   * 
   * @param newChoiceD - the new name which is used as a setter.
   */
  public void setChoiceD(String newChoiceD) {
    choiceD = newChoiceD;
  }

  /**
   * Gets correctAnswer.
   * 
   * @return correctAnswer.
   */
  public String getCorrectAnswer() {
    return correctAnswer;
  }

  public void setCorrectAnswer(String newCorrectAnswer) {
    correctAnswer = newCorrectAnswer;
  }

  @Override
  public void askQuestion() {
    super.askQuestion();
    System.out.println(questionText);
    System.out.println(choiceA);
    System.out.println(choiceB);
    System.out.println(choiceC);
    System.out.println(choiceD);
  }
}
