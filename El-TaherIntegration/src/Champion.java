import java.util.Random;

class Champion  {
	public void ranChamp() {
		/*
		 * I will be using the Random class for a different setting rather than for the quiz.
		 * What I plan to do is to assign specific integers (EX: 10-20) to a champion in LoL.
		 * When the program prints out the number, whatever number is printed out will also
		 * print the champion that is associated with the number. This will just be a fun
		 * side game in this program.
		 * 
		 * More will be added on to this later.
		 */
		Random randomNumber = new Random();
		int number;
		String champion = "unknown";
		for(int champ = 1; champ<=1; champ++) { //There has to be something IN the loop to change the condition.
		number = randomNumber.nextInt(101);
		
		/*
		 * valueOf(); is another string method that this program utilizes. What
		 * valueOf(); does is that it converts our variables into a string. The reason
		 * why we want to convert the int variable "number" to a string is because we
		 * will need the string form of this variable to convert the number into the string
		 * "Champion" in order to output a champion name.
		 */
		
		champion = String.valueOf(number);
		System.out.println(number);	
		if (number <= 0)  {
		champion = "Ashe";
		System.out.println(champion);
		} else if (number <=10)  {
		champion = "Ekko";
		System.out.println(champion);	
		} else if (number <= 20)  {
		champion = "Gragas";
		System.out.println(champion);
		} else if (number <= 30)  {
		champion = "Ahri";
		System.out.println(champion);
		} else if (number <= 40)  {
		champion = "Xerath";
		System.out.println(champion);
		} else if (number <= 50)  {
		champion = "Urgot";
		System.out.println(champion);
		} else if (number <= 60)  {
		champion = "Yorick";
		System.out.println(champion);
		} else if (number <= 70)  {
		champion = "Ivern";
		System.out.println(champion);
		} else if (number <= 80)  {
		champion = "Graves";
		System.out.println(champion);
		} else if (number <= 90)  {
		champion = "Elise";
		System.out.println(champion);
		} else if (number <= 100)  {
		champion = "Kha'Zix";
		System.out.println(champion);
		} else {
		System.out.println("Something went wrong...");
				}
			}
		}
	}