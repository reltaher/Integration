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

public class Quiz {
    public void quizStart(Scanner scan) {
        int programCase1 = 0;
        String choice = "";
        while (programCase1 == 0) {
            int quizScore = 0;
            choice = scan.nextLine();
            // Will add more questions later.
            Question question1 = new Question();
            question1.setQuestion(
                    "Which champion states this quote?: " + "\"Balance is weakness.\"\n");
            question1.setChoiceA("Vayne\n");
            question1.setChoiceB("Thresh\n");
            question1.setChoiceC("Zed\n");
            question1.setChoiceD("Jayce");
            System.out.println(question1.getQuestion() + "A: " + question1.getChoiceA() + "B: "
                    + question1.getChoiceB() + "C: " + question1.getChoiceC() + "D: "
                    + question1.getChoiceD());
            choice = scan.nextLine();
            if (choice.equals("A")) {
                quizScore--;
            } else if (choice.equals("B")) {
                quizScore--;
            } else if (choice.equals("C")) {
                quizScore++;
            } else if (choice.equals("D")) {
                quizScore--;
            } else {
                quizScore--;
            }
            Question question2 = new Question();
            question2.setQuestion("Which champion states this quote?: "
                    + "\"Am I the abyss? Or did I gaze into it?\"\n");
            question2.setChoiceA("Aatrox\n");
            question2.setChoiceB("Kaisa\n");
            question2.setChoiceC("Vel'Koz\n");
            question2.setChoiceD("Kayn (Rhaast)");
            System.out.println(question2.getQuestion() + "A: " + question2.getChoiceA() + "B: "
                    + question2.getChoiceB() + "C: " + question2.getChoiceC() + "D: "
                    + question2.getChoiceD());
            choice = scan.nextLine();
            if (choice.equals("A")) {
                quizScore++;
            } else if (choice.equals("B")) {
                quizScore--;
            } else if (choice.equals("C")) {
                quizScore--;
            } else if (choice.equals("D")) {
                quizScore--;
            } else {
                quizScore--;
            }
            Question question3 = new Question();
            question3.setQuestion("Which of the following champions are Marksmen?\n");
            question3.setChoiceA("Lucian\n");
            question3.setChoiceB("Graves\n");
            question3.setChoiceC("Braum\n");
            question3.setChoiceD("Swain");
            System.out.println(question3.getQuestion() + "A: " + question3.getChoiceA() + "B: "
                    + question3.getChoiceB() + "C: " + question3.getChoiceC() + "D: "
                    + question3.getChoiceD());
            choice = scan.nextLine();
            if (choice.equals("A")) {
                quizScore--;
            } else if (choice.equals("B")) {
                quizScore--;
            } else if (choice.equals("C")) {
                quizScore++;
            } else if (choice.equals("D")) {
                quizScore--;
            } else if (choice.equals("AB")) {
                quizScore += quizScore + 1;
            } else {
                quizScore--;
            }
            Rating ratingResult = new Rating();
            ratingResult.setScoreResult(quizScore);
            ratingResult.setBronzeRating("Bronze");
            ratingResult.setSilverRating("Silver");
            ratingResult.setGoldRating("Gold");
            ratingResult.setPlatinumRating("Platinum");
            ratingResult.setDiamondRating("Diamond");
            // Math.ceil rounds up score
            System.out.println("Score: " + Math.ceil(ratingResult.getScoreResult()));
            if (quizScore <= 0) {
                System.out.println("Here is your result: " + ratingResult.getBronzeRating());
            } else if (quizScore == 1) {
                System.out.println("Here is your result: " + ratingResult.getSilverRating());
            } else if (quizScore == 2) {
                System.out.println("Here is your result: " + ratingResult.getGoldRating());
            } else if (quizScore == 3) {
                System.out.println("Here is your result: " + ratingResult.getPlatinumRating());
            } else if (quizScore >= 4) {
                System.out.println("Here is your result: " + ratingResult.getDiamondRating());
            }
            System.out.println("Type 0 to try again. Type 1 to return to main menu.");
            programCase1 = scan.nextInt();
        }
        System.out.println(
                "Type 1 to re-take the quiz.\n" + "Type 2 to try the Random Champion Game.\n"
                        + "Type 3 enter a number for a champion output.\n"
                        + "Type 4 to compare the Strings of two champions.\n"
                        + "Type 5 to end the program.");
    }
}
