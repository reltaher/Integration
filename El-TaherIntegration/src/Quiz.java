import java.util.Scanner;
//This Project has been created by Ramzy El-Taher.

class Quiz {
	public void quizStart(Scanner scan) {
		int score = 0;
		String choice = "";
		choice = scan.nextLine();
		Question question1 = new Question();
		question1.setQuestion("Question1\n");
		question1.setChoiceA("A\n");
		question1.setChoiceB("B\n");
		question1.setChoiceC("C\n");
		question1.setChoiceD("D");
		System.out.println(question1.getQuestion() + "A: " + question1.getChoiceA() + "B: "
				+ question1.getChoiceB() + "C: " + question1.getChoiceC() + "D: " + question1.getChoiceD());
		choice = scan.nextLine();
		if (choice.equals("A")) {
			score--;
		} else if (choice.equals("B")) {
			score--;
		} else if (choice.equals("C")) {
			score++;
		} else if (choice.equals("D")) {
			score--;
		} else {
			score--;
		}
		Question question2 = new Question();
		question2.setQuestion("Question2\n");
		question2.setChoiceA("A\n");
		question2.setChoiceB("B\n");
		question2.setChoiceC("C\n");
		question2.setChoiceD("D");
		System.out.println(question2.getQuestion() + "A: " + question2.getChoiceA() + "B: "
				+ question2.getChoiceB() + "C: " + question2.getChoiceC() + "D: " + question2.getChoiceD());
		choice = scan.nextLine();
		if (choice.equals("A")) {
			score++;
		} else if (choice.equals("B")) {
			score--;
		} else if (choice.equals("C")) {
			score--;
		} else if (choice.equals("D")) {
			score--;
		} else {
			score--;
		}
		Question question3 = new Question();
		question3.setQuestion("Question3\n");
		question3.setChoiceA("A\n");
		question3.setChoiceB("B\n");
		question3.setChoiceC("C\n");
		question3.setChoiceD("D");
		System.out.println(question3.getQuestion() + "A: " + question3.getChoiceA() + "B: "
				+ question3.getChoiceB() + "C: " + question3.getChoiceC() + "D: " + question3.getChoiceD());
		choice = scan.nextLine();
		if (choice.equals("A")) {
			score--;
		} else if (choice.equals("B")) {
			score--;
		} else if (choice.equals("C")) {
			score++;
		} else if (choice.equals("D")) {
			score--;
		} else if (choice.equals("AB"))  {
			score += score + 1;
		} else {
			score--;
		}
		Rating ratingResult = new Rating();
		ratingResult.setScoreResult(score);
		ratingResult.setBronzeRating("Bronze");
		ratingResult.setSilverRating("Silver");
		ratingResult.setGoldRating("Gold");
		ratingResult.setPlatinumRating("Platinum");
		ratingResult.setDiamondRating("Diamond");
		System.out.println("Score: " + Math.ceil(ratingResult.getScoreResult())); // Math.ceil rounds up																			// score
		if (score <= 0) {
			System.out.println("Here is your result: " + ratingResult.getBronzeRating());
		} else if (score == 1) {
			System.out.println("Here is your result: " + ratingResult.getSilverRating());
		} else if (score == 2) {
			System.out.println("Here is your result: " + ratingResult.getGoldRating());
		} else if (score == 3) {
			System.out.println("Here is your result: " + ratingResult.getPlatinumRating());
		} else if (score >= 4) {
			System.out.println("Here is your result: " + ratingResult.getDiamondRating());
		}
	}
}
