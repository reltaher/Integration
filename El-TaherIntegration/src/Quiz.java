import java.util.InputMismatchException;
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
public class Quiz {
	public void quizStart(Scanner scan) { // Method with constructor being passed down
		String programCase1 = "Y"; // Data type (int), name (programCase1), initialize (=), variable (0).
		while (programCase1.equals("Y")) {
			String choice = "";
			int score = 0;
			int incorrectAnswers = 0;
			MCQuestion question1 = new MCQuestion();
			question1.setQuestionText("Q1");
			question1.setChoiceA("A: ");
			question1.setChoiceB("B: ");
			question1.setChoiceC("C: ");
			question1.setChoiceD("D: ");
			question1.setCorrectAnswer("C");
			MCQuestion question2 = new MCQuestion();
			question2.setQuestionText("Q2");
			question2.setChoiceA("A: ");
			question2.setChoiceB("B: ");
			question2.setChoiceC("C: ");
			question2.setChoiceD("D: ");
			question2.setCorrectAnswer("A");
			MCQuestion question3 = new MCQuestion();
			question3.setQuestionText("Q3");
			question3.setChoiceA("A: ");
			question3.setChoiceB("B: ");
			question3.setChoiceC("C: ");
			question3.setChoiceD("D: ");
			question3.setCorrectAnswer("B");
			//Clears buffer (otherwise Q1 and Q2 prints at the same time)
			choice = scan.nextLine();
			//Creating an array of objects that were made from the previous lines
			Question[] askQuestions = {question1, question2, question3};
			//enhanced for loop to loop through each object
			for (Question que : askQuestions)  {
				//Calling the method from the object to loop through
				que.askQuestion();
				//Checks user input
				choice = scan.nextLine();
				//Checks to see if user has entered the correct input (A, B, C, D).
				while(!choice.matches("[A-D]"))  {
					//This prints out if user enters incorrect input.
					System.out.println("Please enter A, B, C, or D.");
					//Lets user try again to enter input.
					choice = scan.nextLine();
					}
				if (choice.compareTo(que.getCorrectAnswer())==0) {
					score++;
				} else {
					incorrectAnswers--;
				}
			}
			Result rating = new Result();
			rating.setScore(score);
			rating.setIncorrectAnswers(incorrectAnswers);
			rating.displayScore();
			System.out.println("Would you like to try again? Type Y to retry,"
					+ " or type N to return to the main menu. ");
			programCase1 = scan.next();
			/*boolean gotGoodInput = false;
			while (gotGoodInput == false) {
			try {
			programCase1 = scan.nextLine();
			gotGoodInput = true;
			} catch (InputMismatchException ex) {
				System.out.println("Try again");
				scan.nextLine();
			} catch (Exception ex) {
				System.out.println("Error");
			}*/
			//}
		}
	}
}