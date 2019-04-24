/**
 * Represents the author of this program, who is a student currently enrolled at
 * FGCU.
 * 
 * @author reltaher
 *
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
   * @return choiceA.
   */
  public String getChoiceA() {
    return choiceA;
  }

  /** Method with a constructor containing a String variable being passed down.
   * @param newChoiceA - the new name which is used as a setter.
   */
  public void setChoiceA(String newChoiceA) {
    choiceA = newChoiceA;
  }

  /**
   * Gets choiceB.
   * @return choiceB.
   */
  public String getChoiceB() {
    return choiceB;
  }

  /** Method with a constructor containing a String variable being passed down.
   * @param newChoiceB - the new name which is used as a setter.
   */
  public void setChoiceB(String newChoiceB) {
    choiceB = newChoiceB;
  }

  /**
   * Gets choiceC.
   * @return choiceC.
   */
  public String getChoiceC() {
    return choiceC;
  }

  /** Method with a constructor containing a String variable being passed down.
   * @param newChoiceC - the new name which is used as a setter.
   */
  public void setChoiceC(String newChoiceC) {
    choiceC = newChoiceC;
  }

  /**
   * Gets choiceD.
   * @return choiceD.
   */
  public String getChoiceD() {
    return choiceD;
  }

  /** Method with a constructor containing a String variable being passed down.
   * @param newChoiceD - the new name which is used as a setter.
   */
  public void setChoiceD(String newChoiceD) {
    choiceD = newChoiceD;
  }

  /**
   * Gets correctAnswer.
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
