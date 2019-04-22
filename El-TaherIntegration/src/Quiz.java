import java.util.Scanner;

//This Project has been created by Ramzy El-Taher.
public class Quiz {
    // Method with constructor being passed down
    public void quizStart(Scanner scan) {
        // Assigning a string variable named "programCase1" to the string "Y".
        String programCase1 = "Y";
        // Code within the while block continuously runs as long as programCase1 is "Y".
        // When comparing strings, use .equals, not ==. Using == w/ Strings will result as False.
        while (programCase1.equalsIgnoreCase("Y")) {
            String choice = "";
            int score = 0;
            int incorrectAnswers = 0;
            // Creating a new object from the MCQuestion class named question1.
            MCQuestion question1 = new MCQuestion();
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
             * example, question1.setChoiceA() would be considered the call. within its
             * parentheses is the argument. In the code below, the argument would be
             * ("A: Rengar").
             */
            question1.setQuestionText("1: " + "\nWhich champion states the following quote:"
                    + "\n\"Balance is weakness\"");
            question1.setChoiceA("A: Rengar");
            question1.setChoiceB("B: Talon");
            question1.setChoiceC("C: Zed");
            question1.setChoiceD("D: Yasuo");
            question1.setCorrectAnswer("C");
            // Creating a new object from the MCQuestion class named question2.
            MCQuestion question2 = new MCQuestion();
            // \n is used to make a new line in strings. It is called an escape sequence.
            // the + operator can be used to concatenate strings. It helps create sentences
            // from Strings, and it also helps the String's readability.
            question2
                    .setQuestionText("2: " + "\nWhich of these champions are considered Marksmen?");
            question2.setChoiceA("A: Teemo");
            question2.setChoiceB("B: Urgot");
            question2.setChoiceC("C: Neeko");
            question2.setChoiceD("D: Jayce");
            question2.setCorrectAnswer("A");
            // Creating a new object from the MCQuestion class named question3.
            MCQuestion question3 = new MCQuestion();
            question3.setQuestionText("3: " + "\nWhat item do junglers NOT buy first?");
            question3.setChoiceA("A: Hunter's Machete");
            question3.setChoiceB("B: Boots of Speed");
            question3.setChoiceC("C: Hunter's Talisman");
            question3.setChoiceD("D: Refillable Potion");
            question3.setCorrectAnswer("B");
            MCQuestion question4 = new MCQuestion();
            question4.setQuestionText("4: " + "\n");
            question4.setChoiceA("A: ");
            question4.setChoiceB("B: ");
            question4.setChoiceC("C: ");
            question4.setChoiceD("D: ");
            question4.setCorrectAnswer("");
            MCQuestion question5 = new MCQuestion();
            question5.setQuestionText("5: " + "\n");
            question5.setChoiceA("A: ");
            question5.setChoiceB("B: ");
            question5.setChoiceC("C: ");
            question5.setChoiceD("D: ");
            question5.setCorrectAnswer("");
            MCQuestion question6 = new MCQuestion();
            question6.setQuestionText("6: " + "\n");
            question6.setChoiceA("A: ");
            question6.setChoiceB("B: ");
            question6.setChoiceC("C: ");
            question6.setChoiceD("D: ");
            question6.setCorrectAnswer("");
            MCQuestion question7 = new MCQuestion();
            question7.setQuestionText("7: " + "\n");
            question7.setChoiceA("A: ");
            question7.setChoiceB("B: ");
            question7.setChoiceC("C: ");
            question7.setChoiceD("D: ");
            question7.setCorrectAnswer("");
            MCQuestion question8 = new MCQuestion();
            question8.setQuestionText("8: " + "\n");
            question8.setChoiceA("A: ");
            question8.setChoiceB("B: ");
            question8.setChoiceC("C: ");
            question8.setChoiceD("D: ");
            question8.setCorrectAnswer("");
            MCQuestion question9 = new MCQuestion();
            question9.setQuestionText("9: " + "\n");
            question9.setChoiceA("A: ");
            question9.setChoiceB("B: ");
            question9.setChoiceC("C: ");
            question9.setChoiceD("D: ");
            question9.setCorrectAnswer("");
            MCQuestion question10 = new MCQuestion();
            question10.setQuestionText("10: " + "\n");
            question10.setChoiceA("A: ");
            question10.setChoiceB("B: ");
            question10.setChoiceC("C: ");
            question10.setChoiceD("D: ");
            question10.setCorrectAnswer("");
            MCQuestion question11 = new MCQuestion();
            question11.setQuestionText("11: " + "\n");
            question11.setChoiceA("A: ");
            question11.setChoiceB("B: ");
            question11.setChoiceC("C: ");
            question11.setChoiceD("D: ");
            question11.setCorrectAnswer("");
            MCQuestion question12 = new MCQuestion();
            question12.setQuestionText("12: " + "\n");
            question12.setChoiceA("A: ");
            question12.setChoiceB("B: ");
            question12.setChoiceC("C: ");
            question12.setChoiceD("D: ");
            question12.setCorrectAnswer("");
            MCQuestion question13 = new MCQuestion();
            question13.setQuestionText("13: " + "\n");
            question13.setChoiceA("A: ");
            question13.setChoiceB("B: ");
            question13.setChoiceC("C: ");
            question13.setChoiceD("D: ");
            question13.setCorrectAnswer("");
            MCQuestion question14 = new MCQuestion();
            question14.setQuestionText("14: " + "\n");
            question14.setChoiceA("A: ");
            question14.setChoiceB("B: ");
            question14.setChoiceC("C: ");
            question14.setChoiceD("D: ");
            question14.setCorrectAnswer("");
            MCQuestion question15 = new MCQuestion();
            question15.setQuestionText("15: " + "\n");
            question15.setChoiceA("A: ");
            question15.setChoiceB("B: ");
            question15.setChoiceC("C: ");
            question15.setChoiceD("D: ");
            question15.setCorrectAnswer("");
            // Clears buffer (otherwise Q1 and Q2 prints at the same time)
            choice = scan.nextLine();
            // Creating an array of objects
            Question[] quizQuestions = { question1, question2, question3, question4, question5,
                    question6, question7, question8, question9, question10, question11, question12,
                    question13, question14, question15 };
            // enhanced for loop to loop through each object
            for (Question que : quizQuestions) {
                // Calling the method from the object to loop through
                que.askQuestion();
                // Checks user input
                choice = scan.nextLine();
                // Checks to see if user has entered the correct input (A, B, C, D).
                while (!choice.matches("[A-D]")) {
                    // This prints out if user enters incorrect input.
                    System.out.println("Please enter A, B, C, or D. It cannot be lowercase.");
                    // Lets user try again to enter input.
                    choice = scan.nextLine();
                }
                // Compares user input to the correctAnswer string
                if (choice.compareTo(que.getCorrectAnswer()) == 0) {
                    score++;
                } else if (choice.isEmpty()) {
                    continue; // skips this part of the loop to the end.
                } else {
                    /*
                     * incorrectAnswers is decrementing, but in Result.java, it is within the
                     * Math.abs class method, so it will give a positive number.
                     */
                    incorrectAnswers--;
                }
            }
            // Creating a new object from the Result class named rating.
            Result rating = new Result();
            // Retrieving methods from the Result class, and passing down its parameters if
            // it has any (this is also applied with the other methods in the MCQuestion
            // class).
            rating.setScore(score);
            rating.setIncorrectAnswers(incorrectAnswers);
            rating.displayScore();
            System.out.println("Would you like to try again? Type Y to retry,"
                    + " or type N to return to the main menu. ");
            programCase1 = scan.next();
        }
    }
}