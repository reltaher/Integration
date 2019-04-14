//This project has been created by Ramzy El-Taher.
public class Rating {
	private int points = 0;
	protected short score = (short) points; // casting (converts a type of value into another)
	private int scoreResult;
	protected String choice = "";
	private String ironRating = "Iron";
	private String bronzeRating = "Bronze";
	private String silverRating = "Silver";
	private String goldRating = "Gold";
	private String platinumRating = "Platinum";
	private String diamondRating = "Diamond";
	private String masterRating = "Master";
	private String grandmasterRating = "Grandmaster";
	private String challengerRating = "Challenger";

	public int getPoints() {
		return points;
	}

	public void setPoints(int newPoints) {
		this.points = newPoints;
	}

	public short getScore() {
		return score;
	}

	public void setScore(short newScore) {
		score = newScore;
	}

	public void setScore(int newScore) {
		score = (short) newScore;
	}

	public int getScoreResult() {
		return scoreResult;
	}

	public void setScoreResult(int newScoreResult) {
		scoreResult = newScoreResult;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String newChoice) {
		choice = newChoice;
	}

	public String getIronRating() {
		return ironRating;
	}

	public void setIronRating(String newIronRating) {
		ironRating = newIronRating;
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

	public String getMasterRating() {
		return masterRating;
	}

	public void setMasterRating(String newMasterRating) {
		masterRating = newMasterRating;
	}

	public String getGrandmasterRating() {
		return grandmasterRating;
	}

	public void setGrandmasterRating(String newGrandmasterRating) {
		grandmasterRating = newGrandmasterRating;
	}

	public String getChallengerRating() {
		return challengerRating;
	}

	public void setChallengerRating(String newChallengerRating) {
		challengerRating = newChallengerRating;
	}

	public void displayScore() {
		if (score <= 0) {
			score = 0;
			System.out.println("Score: " + score);
			System.out.println("Here is your result: " + ironRating);
		} else if (score == 0) {
			System.out.println("Score: " + score);
			System.out.println("Here is your result: " + bronzeRating);
		} else if (score <= 2) {
			System.out.println("Score: " + score);
			System.out.println("Here is your result: " + silverRating);
		} else if (score <= 4) {
			System.out.println("Score: " + score);
			System.out.println("Here is your result: " + goldRating);
		} else if (score <= 6) {
			System.out.println("Score: " + score);
			System.out.println("Here is your result: " + platinumRating);
		} else if (score <= 8) {
			System.out.println("Score: " + score);
			System.out.println("Here is your result: " + diamondRating);
		} else if (score <= 10) {
			System.out.println("Score: " + score);
			System.out.println("Here is your result: " + masterRating);
		} else if (score <= 12) {
			System.out.println("Score: " + score);
			System.out.println("Here is your result: " + grandmasterRating);
		} else if (score <= 15) {
			System.out.println("Score: " + score);
			System.out.println("Here is your result: " + challengerRating
					+ "Congratulations! This is the highest possible rank you can achieve.");
		} else {
			System.out.println("The quiz has encountered an error while displaying a result.");
		}
	}
}