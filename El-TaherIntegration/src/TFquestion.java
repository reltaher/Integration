/** Represents the author of this program, who is a student currently enrolled at FGCU.
 * @author eltah
 *
 */
public class TFquestion extends Question {
  //This class utilizes inheritance.
  //Inheritance = one class containing the fields and methods of another class.
  //In this case, this class contains the properties from the Question class.
  //These fields and methods are obtained with the extends keyword.
  private String questionText;
  private String choiceT = "True";
  private String choiceF = "False";
  private boolean isTrue = true;
  private boolean isFalse = false;

  public String getQuestionText() {
    return questionText;
  }

  public void setQuestionText(String newQuestionText) {
    questionText = newQuestionText;
  }

  public String getChoiceT() {
    return choiceT;
  }

  public void setChoiceT(String newChoiceT) {
    choiceT = newChoiceT;
  }

  public String getChoiceF() {
    return choiceF;
  }

  public void setChoiceF(String newChoiceF) {
    choiceF = newChoiceF;
  }

  public boolean getIsTrue() {
    return isTrue;
  }

  public void setIsTrue(boolean newIsTrue) {
    isTrue = newIsTrue;
  }

  public boolean getIsFalse() {
    return isFalse;
  }

  public void setIsFalse(boolean newIsFalse) {
    isFalse = newIsFalse;
  }

  @Override
  public void askQuestion() {
    super.askQuestion();
    System.out.println(questionText);
  }
}
