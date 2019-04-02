import java.util.Scanner;
//This Project has been created by Ramzy El-Taher.

/*
 * With the getter/setter method in our different classes, we have to use the
 * set string extension. Using this will bring our private string into the main
 * method, and the name of the string is within the argument of the string.
 * 
 * After declaring set, when printing the result, we then have to use the get
 * string extension to obtain the string from its set form.
 *
 * the \n is a type of escape sequence which stands for newline. \n (newline)
 * creates a new line for the next string (EX: A is below the first question).
 * 
 * The following few lines below are good examples of call and argument. For
 * example, question1.setQuestion() would be considered the call. within its
 * parentheses is the argument. In the example below, the argument would be
 * ("Question1\n").
 */

/*
 * One method of Strings that we will be using in this program is concatenating.
 * The + operator is used to concatenate strings together, which helps create
 * sentences out of strings. It is also useful for other purposes, such as
 * making a multiple choice test like we are in this program.
 */

//This class utilizes inheritance.
//Inheritance = one class containing the fields and methods of another class.
//In this case, this class contains the properties from the Question class.
//These fields and methods are obtained with the extends keyword.
public class Quiz extends Rating {
	public void quizStart(Scanner scan) {
		int programCase1 = 0;
		String choice = "";
		while (programCase1 == 0) {
			score = 0;
			choice = scan.nextLine();
			// Will add more questions later.
			Question question1 = new Question();
			question1.setQuestion("1. Which champion states this quote?: " + "\"Balance is weakness.\"\n");
			question1.setChoiceA("Vayne\n");
			question1.setChoiceB("Thresh\n");
			question1.setChoiceC("Zed\n");
			question1.setChoiceD("Jayce");
			System.out.println(question1.getQuestion() + "A: " + question1.getChoiceA() + "B: " + question1.getChoiceB()
					+ "C: " + question1.getChoiceC() + "D: " + question1.getChoiceD());
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
			question2.setQuestion(
					"2. Which champion states this quote?: " + "\"Am I the abyss? Or did I gaze into it?\"\n");
			question2.setChoiceA("Aatrox\n");
			question2.setChoiceB("Kaisa\n");
			question2.setChoiceC("Vel'Koz\n");
			question2.setChoiceD("Kayn (Rhaast)");
			System.out.println(question2.getQuestion() + "A: " + question2.getChoiceA() + "B: " + question2.getChoiceB()
					+ "C: " + question2.getChoiceC() + "D: " + question2.getChoiceD());
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
			question3.setQuestion("3. Which of the following champions are Marksmen?\n");
			question3.setChoiceA("Lucian\n");
			question3.setChoiceB("Graves\n");
			question3.setChoiceC("Braum\n");
			question3.setChoiceD("Swain");
			System.out.println(question3.getQuestion() + "A: " + question3.getChoiceA() + "B: " + question3.getChoiceB()
					+ "C: " + question3.getChoiceC() + "D: " + question3.getChoiceD());
			choice = scan.nextLine();
			if (choice.equals("A")) {
				score++;
			} else if (choice.equals("B")) {
				score++;
			} else if (choice.equals("C")) {
				score--;
			} else if (choice.equals("D")) {
				score--;
			} else if (choice.equals("AB")) {
				score += score + 1;
			} else {
				score--;
			}
			Question question4 = new Question();
			question4.setQuestion("4. What is the FIRST item to purchase as Lee Sin?\n");
			question4.setChoiceA("Runic Echoes\n");
			question4.setChoiceB("Warrior\n");
			question4.setChoiceC("Cinderhulk\n");
			question4.setChoiceD("Hunter Machete");
			System.out.println(question4.getQuestion() + "A: " + question4.getChoiceA() + "B: " + question4.getChoiceB()
					+ "C: " + question4.getChoiceC() + "D: " + question4.getChoiceD());
			choice = scan.nextLine();
			if (choice.equals("A")) {
				score--;
			} else if (choice.equals("B")) {
				score--;
			} else if (choice.equals("C")) {
				score--;
			} else if (choice.equals("D")) {
				score++;
			} else {
				score--;
			}
			Question question5 = new Question();
			question5.setQuestion("5. Which champion got hotfixed for an undiscovered OP build in patch 9.5?\n");
			question5.setChoiceA("Akali\n");
			question5.setChoiceB("Graves\n");
			question5.setChoiceC("Neeko\n");
			question5.setChoiceD("Karthus");
			System.out.println(question5.getQuestion() + "A: " + question5.getChoiceA() + "B: " + question5.getChoiceB()
					+ "C: " + question5.getChoiceC() + "D: " + question5.getChoiceD());
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
			Question question6 = new Question();
			question6.setQuestion("6.\n");
			question6.setChoiceA("\n");
			question6.setChoiceB("\n");
			question6.setChoiceC("\n");
			question6.setChoiceD("");
			System.out.println(question6.getQuestion() + "A: " + question6.getChoiceA() + "B: " + question6.getChoiceB()
					+ "C: " + question6.getChoiceC() + "D: " + question6.getChoiceD());
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
			Question question7 = new Question();
			question7.setQuestion("7.\n");
			question7.setChoiceA("\n");
			question7.setChoiceB("\n");
			question7.setChoiceC("\n");
			question7.setChoiceD("");
			System.out.println(question7.getQuestion() + "A: " + question7.getChoiceA() + "B: " + question7.getChoiceB()
					+ "C: " + question7.getChoiceC() + "D: " + question7.getChoiceD());
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
			Question question8 = new Question();
			question8.setQuestion("8.\n");
			question8.setChoiceA("\n");
			question8.setChoiceB("\n");
			question8.setChoiceC("\n");
			question8.setChoiceD("");
			System.out.println(question8.getQuestion() + "A: " + question8.getChoiceA() + "B: " + question8.getChoiceB()
					+ "C: " + question8.getChoiceC() + "D: " + question8.getChoiceD());
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
			Question9 question9 = new Question9();
			question9.askQuestion();
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
			Question10 question10 = new Question10();
			question10.askQuestion();
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
			Rating ratingResult = new Rating();
			ratingResult.setScoreResult(score);
			// Math.ceil takes absolute value of score (prevents negative result)
			System.out.println("Score: " + Math.abs(ratingResult.getScoreResult()));
			super.displayScore();
			System.out.println("Type 0 to try again. Type 1 to return to main menu.");
			programCase1 = scan.nextInt();
		}
		System.out.println("Type 1 to take the quiz.\n" + "Type 2 to try the Random Champion Game.\n"
				+ "Type 3 enter a number for a champion output.\n" + "Type 4 to compare the Strings of two champions.\n"
				+ "Type 5 to view the list of champions.\n" + "Type 6 to end the program.");
	}
}