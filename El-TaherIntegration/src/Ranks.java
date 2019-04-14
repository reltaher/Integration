
//Made by Ramzy El-Taher
import java.util.Scanner;

public class Ranks {
	public void displayRanks(Scanner scan) {
		int programCase8 = 0;
		while (programCase8 == 0) {

			System.out.println("Here are the possible Ranks that you can get from the quiz: ");
			Rating ranks = new Rating();
			ranks.setIronRating("Iron");
			ranks.setBronzeRating("Bronze");
			ranks.setSilverRating("Silver");
			ranks.setGoldRating("Gold");
			ranks.setPlatinumRating("Platinum");
			ranks.setDiamondRating("Diamond");
			ranks.setMasterRating("Master");
			ranks.setGrandmasterRating("Grandmaster");
			ranks.setChallengerRating("Challenger");

			System.out.println(ranks.getIronRating());
			System.out.println(ranks.getBronzeRating());
			System.out.println(ranks.getSilverRating());
			System.out.println(ranks.getGoldRating());
			System.out.println(ranks.getPlatinumRating());
			System.out.println(ranks.getDiamondRating());
			System.out.println(ranks.getMasterRating());
			System.out.println(ranks.getGrandmasterRating());
			System.out.println(ranks.getChallengerRating());

			System.out.println();
			System.out.println("Type 1 to return back to main menu.");
			programCase8 = scan.nextInt();
		}
		System.out.println("Type 1 to take the quiz.");
		System.out.println("Type 2 to try the Random Champion Game.");
		System.out.println("Type 3 enter a number for a champion output.");
		System.out.println("Type 4 to compare the Strings of two champions.");
		System.out.println("Type 5 to view the list of champions.");
		System.out.println("Type 6 to view the ranks that you can obtain from the quiz.");
		System.out.println("Type 7 to end the program.");
	}
}
