public class TFQuestion extends Question {
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
	
	public boolean getIsTrue()  {
		return isTrue;
	}
	
	public void setIsTrue(boolean newIsTrue) {
		isTrue = newIsTrue;
	}
	
	public boolean getIsFalse() {
		return isFalse;
	}
	
	public void setIsFalse(boolean newIsFalse)  {
		isFalse = newIsFalse;
	}
	public void askQuestion() {
		System.out.println(questionText);
	}
}
