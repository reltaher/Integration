/** Represents the author of this program, who is a student currently enrolled at FGCU.
 * @author eltah
 *
 */
public class MCquestion extends Question {
  //This class utilizes inheritance.
  //Inheritance = one class containing the fields and methods of another class.
  //In this case, this class contains the properties from the Question class.
  //These fields and methods are obtained with the extends keyword.
  private String questionText;
  private String choiceA;
  private String choiceB;
  private String choiceC;
  private String choiceD;
  private String correctAnswer;

  public String getQuestionText() {
    return questionText;
  }

  public void setQuestionText(String newQuestionText) {
    questionText = newQuestionText;
  }

  public String getChoiceA() {
    return choiceA;
  }

  public void setChoiceA(String newChoiceA) {
    choiceA = newChoiceA;
  }

  public String getChoiceB() {
    return choiceB;
  }

  public void setChoiceB(String newChoiceB) {
    choiceB = newChoiceB;
  }

  public String getChoiceC() {
    return choiceC;
  }

  public void setChoiceC(String newChoiceC) {
    choiceC = newChoiceC;
  }

  public String getChoiceD() {
    return choiceD;
  }

  public void setChoiceD(String newChoiceD) {
    choiceD = newChoiceD;
  }

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
