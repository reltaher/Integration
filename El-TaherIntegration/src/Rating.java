class Rating {

	// ?  the ternary opertator
	//variable x = (expression) ? value if true: value if false
	//https://www.tutorialspoint.com/Java-Ternary-Operator-Examples
	//2String rating ? '0' : '1';
	
	private int scoreResult;
	private String bronzeRating = "0";
	private String silverRating = "1";
	private String goldRating = "2";
	private String platinumRating = "3";
	private String diamondRating = "4";

	public int getScoreResult() {
		return scoreResult;
	}
	
	public void setScoreResult(int newScoreResult)  {
		scoreResult = newScoreResult;
	}
	
	public String getBronzeRating() {
		return bronzeRating;
	}

	public void setBronzeRating(String newBronzeRating) {
		bronzeRating = newBronzeRating;
	}

	public String getSilverRating() {
		return silverRating;
	}

	public void setSilverRating(String newSilverRating) {
		silverRating = newSilverRating;
	}

	public String getGoldRating() {
		return goldRating;
	}

	public void setGoldRating(String newGoldRating) {
		goldRating = newGoldRating;
	}

	public String getPlatinumRating() {
		return platinumRating;
	}

	public void setPlatinumRating(String newPlatinumRating) {
		platinumRating = newPlatinumRating;
	}

	public String getDiamondRating() {
		return diamondRating;
	}

	public void setDiamondRating(String newDiamondRating) {
		diamondRating = newDiamondRating;
	}
}