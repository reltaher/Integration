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
			Question1 question1 = new Question1();
			question1.askQuestion();
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
			Question2 question2 = new Question2();
			question2.askQuestion();
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
			Question3 question3 = new Question3();
			question3.askQuestion();
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
				score += 2;
			} else {
				score--;
			}
			Question4 question4 = new Question4();
			question4.askQuestion();
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
			Question5 question5 = new Question5();
			question5.askQuestion();
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
			Question6 question6 = new Question6();
			question6.askQuestion();
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
			Question7 question7 = new Question7();
			question7.askQuestion();
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
			Question8 question8 = new Question8();
			question8.askQuestion();
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
			// super takes the method of displayScore from the base class of Quiz, which is
			// Rating.
			super.displayScore();
			System.out.println("Type 0 to try again. Type 1 to return to main menu.");
			programCase1 = scan.nextInt();
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