import java.util.Scanner;

//This project has been created by Ramzy El-Taher.
public class Result {
	private int score;
	private int incorrectAnswers;
	
	public int getScore() {
		return score;
	}

	public void setScore(short newScore) {
	  //When you want to convert a variable to another, use casting.
	  //This line of code has a short variable being converted to an int variable.
		score = (int)newScore;
	}

	public void setScore(int newScore) {
		score = newScore;
	}
	
	public int getIncorrectAnswers()  {
		return incorrectAnswers;
	}
	
	public void setIncorrectAnswers(int newIncorrectAnswers)  {
		incorrectAnswers = newIncorrectAnswers;
	}

	public void displayScore() {
		String rating = "";
		if (score <= 0) {
			score = 0;
			rating = "Iron";
		} else if (score == 1) {
			rating = "Bronze";
		} else if (score <= 3) {
			rating = "Silver";
		} else if (score <= 5) {
			rating = "Gold";
		} else if (score <= 7) {
			rating = "Platinum";	
		} else if (score <= 9) {
			rating = "Diamoond";
		} else if (score <= 12) {
			rating = "Master";
		} else if (score <= 14) {
			rating = "Grandmaster";
		} else if (score == 15) {
			rating = "Challenger";
		} else {
			System.out.println("The quiz has encountered an error while displaying a result.");
		}
		System.out.println("Score: " + score + "\nHere is your result: " + rating);
		// Math.abs takes the absolute value of a number (prevents negative results).
		System.out.println("Incorrect Answers: " + Math.abs(incorrectAnswers));
		}
	public void displayResults(Scanner scan) {
		String programCase2 = "Y";
		while(programCase2.equals("Y")) {
		System.out.println("Here are the possible ranks you can get from the quiz: ");
		System.out.println("-Iron");
		System.out.println("-Bronze");
		System.out.println("-Silver");
		System.out.println("-Gold");
		System.out.println("-Platinum");
		System.out.println("-Diamond");
		System.out.println("-Master");
		System.out.println("-Grandmaster");
		System.out.println("-Challenger");
		System.out.println();
		System.out.println("Type N to return back to main menu.");
		programCase2 = scan.next();
		}
	}
}