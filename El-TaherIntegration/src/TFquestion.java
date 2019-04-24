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
public class TFquestion extends Question {
  // This class utilizes inheritance.
  // Inheritance = one class containing the fields and methods of another class.
  // In this case, this class contains the properties from the Question class.
  // These fields and methods are obtained with the extends keyword.
  private String questionText;
  private String choiceT = "True";
  private String choiceF = "False";
  private boolean isTrue = true;
  private boolean isFalse = false;

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
   * Gets choiceT (String assigned "True").
   * 
   * @return choiceT.
   */
  public String getChoiceT() {
    return choiceT;
  }

  /**
   * Method with a constructor containing a String variable being passed down.
   * 
   * @param newChoiceT - the new name for choiceT which is used as a setter.
   */
  public void setChoiceT(String newChoiceT) {
    choiceT = newChoiceT;
  }

  /**
   * Gets choiceF (String assigned "False").
   * 
   * @return choiceF.
   */
  public String getChoiceF() {
    return choiceF;
  }

  /**
   * Method with a constructor containing a String variable being passed down.
   * 
   * @param newChoiceF - the new name for choiceF which is used as a setter.
   */
  public void setChoiceF(String newChoiceF) {
    choiceF = newChoiceF;
  }

  /**
   * Gets isTrue (boolean assigned True).
   * 
   * @return isTrue.
   */
  public boolean getIsTrue() {
    return isTrue;
  }

  /**
   * Method with a constructor containing a boolean variable being passed down.
   * 
   * @param newIsTrue - the new name for isTrue which is used as a setter.
   */
  public void setIsTrue(boolean newIsTrue) {
    isTrue = newIsTrue;
  }

  /**
   * Gets isFalse (boolean assigned False).
   * 
   * @return isFalse.
   */
  public boolean getIsFalse() {
    return isFalse;
  }

  /**
   * Method with a constructor containing a boolean variable being passed down.
   * 
   * @param newIsFalse - the new name for isFalse which is used as a setter.
   */
  public void setIsFalse(boolean newIsFalse) {
    isFalse = newIsFalse;
  }

  @Override
  public void askQuestion() {
    super.askQuestion();
    System.out.println(questionText);
  }
}
