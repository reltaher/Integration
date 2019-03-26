import java.util.Scanner;

public class ChampionList {
	public void champList(Scanner scan) {
		int programCase5 = 0;
		while (programCase5 == 0) {
		String list[] =
				{"143", "Aatrox", "Ahri", "Akali", "Alistar",
						"Amumu", "Anivia", "Annie", "Ashe", "Aurelion Sol",
						"Azir", "Bard", "Blitzcrank", "Brand", "Braum",
						"Caitlyn", "Camille", "Cassiopeia", "Cho'Gath",
						"Corki", "Darius", "Diana", "Dr. Mundo", "Draven",
						"Ekko", "Elise", "Evelynn", "Ezreal", "Fiddlesticks",
						"Fiora", "Fizz", "Galio", "Gangplank", "Garen", "Gnar",
						"Gragas", "Graves", "Hecarim", "Heimerdinger", "Illaoi",
						"Irelia", "Ivern", "Janna", "Jarvan IV", "Jax", "Jayce",
						"Jhin", "Jinx", "Kai'sa", "Kalista", "Karma", "Karthus",
						"Kassadin", "Katarina", "Kayle", "Kayn", "Kennen", "Kha'zix",
						"Kindred", "Kled", "Kog'Maw", "Leblanc", "Lee Sin", "Leona",
						"Lissandra", "Lucian", "Lulu", "Lux", "Malphite", "Malzahar",
						"Maokai", "Master Yi", "Miss Fortune", "Mordekaiser", "Morgana",
						"Nami", "Nasus", "Nautilus", "Neeko", "Nidalee", "Nocturne",
						"Nunu", "Olaf", "Orianna", "Ornn", "Pantheon", "Poppy", "Pyke",
						"Quinn", "Rakan", "Rammus", "Rek'Sai", "Renekton", "Rengar",
						"Riven", "Rumble", "Ryze", "Sejuani", "Shaco", "Shen",
						"Shyvana", "Singed", "Sion", "Sivir", "Skarner", "Sona",
						"Soraka", "Swain", "Sylas", "Syndra", "Tahm Kench", "Taliyah",
						"Talon", "Taric", "Teemo", "Thresh", "Tristana", "Trundle",
						"Tryndamere", "Twisted Fate", "Twitch", "Udyr", "Urgot",
						"Varus", "Vayne", "Veigar", "Vel'Koz", "Vi", "Viktor",
						"Vladimir", "Volibear", "Warwick", "Wukong", "Xayah", "Xerath",
						"Xin Zhao", "Yasuo", "Yorick", "Zac", "Zed", "Ziggs", "Zilean",
						"Zoe", "Zyra"};

			System.out.println("Champion List: ");
		for(int counter = 1; counter < list.length; counter++)   {	
			System.out.println(counter + ": " + list[counter]);
		}
			System.out.println("Right now, there are " + list[0] + " Champions. " + 
								"Scroll up to view all of the champions.");
			System.out.println("The list will update when new champions are added.");
			System.out.println();
			System.out.println("Type 1 to return back to main menu.");
			programCase5 = scan.nextInt();
		}
		System.out.println("Type 1 to take the quiz.\n" + "Type 2 to try the Random Champion Game.\n"
				+ "Type 3 enter a number for a champion output.\n" + "Type 4 to compare the Strings of two champions.\n"
				+ "Type 5 to view the list of champions.\n" + "Type 6 to end the program.");
	}
}
