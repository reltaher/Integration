import java.util.Scanner;

/**
 * Represents the author of this program, who is a student currently enrolled at
 * FGCU.
 * 
 * @author reltaher
 *
 */

/*
 * This program is primarily a quiz based on the game "League of Legends". Some
 * of the other modes in this program, such as the Random Champion game,
 * Champion Number game, and Champion List, contain information that gives the
 * user an answer to one of the quiz questions.
 * 
 * What this code accomplishes is a friendly user interface throughout the whole
 * program, with a menu selection for each different mode, such as the quiz or
 * the Random Champion game. For each game mode, the code will prompt the user
 * if they wish to continue or not, if they do not wish to continue, then it
 * will prompt them back to the main menu. If the user wishes to quit out of the
 * program, then case 6 will terminate the program for them, giving them a
 * friendly exiting message.
 */
public class Quiz {
  /**
   * Method with constructor being passed down.
   * 
   * @param scan passes down the Scanner object named "scan".
   */
  public void quizStart(Scanner scan) {
    // Assigning a string variable named "programCase1" to the string "Y".
    String programCase1 = "Y";
    // Code within the while block continuously runs as long as programCase1 is "Y".
    // When comparing strings, use .equals, not ==. Using == w/ Strings will result
    // as False.
    while (programCase1.equalsIgnoreCase("Y")) {
      int score = 0;
      int incorrectAnswers = 0;
      // Creating a new object from the MCquestion class named question1.
      MCquestion question1 = new MCquestion();
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
      question1.setQuestionText(
          "1: " + "\nWhich champion states the following quote:" + "\n\"Balance is weakness\"");
      question1.setChoiceA("A: Rengar");
      question1.setChoiceB("B: Talon");
      question1.setChoiceC("C: Zed");
      question1.setChoiceD("D: Yasuo");
      question1.setCorrectAnswer("C");
      // Creating a new object from the MCquestion class named question2.
      MCquestion question2 = new MCquestion();
      // \n is used to make a new line in strings. It is called an escape sequence.
      // the + operator can be used to concatenate strings. It helps create sentences
      // from Strings, and it also helps the String's readability.
      question2.setQuestionText("2: " + "\nWhich of these champions are considered Marksmen?");
      question2.setChoiceA("A: Teemo");
      question2.setChoiceB("B: Urgot");
      question2.setChoiceC("C: Neeko");
      question2.setChoiceD("D: Jayce");
      question2.setCorrectAnswer("A");
      // Creating a new object from the MCquestion class named question3.
      MCquestion question3 = new MCquestion();
      question3.setQuestionText("3: " + "\nWhat item do junglers NOT buy first?");
      question3.setChoiceA("A: Hunter's Machete");
      question3.setChoiceB("B: Boots of Speed");
      question3.setChoiceC("C: Hunter's Talisman");
      question3.setChoiceD("D: Refillable Potion");
      question3.setCorrectAnswer("B");
      MCquestion question4 = new MCquestion();
      question4.setQuestionText("4: " + "\nWhich champion states the following quote: "
          + "\"Am I the abyss? Or did I gaze into it?\"");
      question4.setChoiceA("A: Aatrox");
      question4.setChoiceB("B: Malzahar");
      question4.setChoiceC("C: Kayn (Rhaast)");
      question4.setChoiceD("D: Kai'sa");
      question4.setCorrectAnswer("A");
      MCquestion question5 = new MCquestion();
      question5
          .setQuestionText("5: " + "\nAt what time does Rift Herald despawn at the " + "latest?");
      question5.setChoiceA("A: 19:30");
      question5.setChoiceB("B: 19:45");
      question5.setChoiceC("C: 19:00");
      question5.setChoiceD("D: 19:55");
      question5.setCorrectAnswer("D");
      MCquestion question6 = new MCquestion();
      question6.setQuestionText("6: " + "\nHow much gold does each turret plating give when"
          + " only one champion is obtaining the gold?");
      question6.setChoiceA("A: 120");
      question6.setChoiceB("B: 80");
      question6.setChoiceC("C: 160");
      question6.setChoiceD("D: 300");
      question6.setCorrectAnswer("C");
      MCquestion question7 = new MCquestion();
      question7.setQuestionText("7: " + "\nWhich champion states the following quote: "
          + "\"Better times there were, and will be again.\"");
      question7.setChoiceA("A: Karma");
      question7.setChoiceB("B: Irelia");
      question7.setChoiceC("C: Akali");
      question7.setChoiceD("D: Rakan");
      question7.setCorrectAnswer("B");
      MCquestion question8 = new MCquestion();
      question8.setQuestionText("8: " + "\nWho were the world champions in the Season 4"
          + " World championship for League of Legends?");
      question8.setChoiceA("A: SKT");
      question8.setChoiceB("B: SSW");
      question8.setChoiceC("C: SSG");
      question8.setChoiceD("D: IG");
      question8.setCorrectAnswer("B");
      MCquestion question9 = new MCquestion();
      question9.setQuestionText("9: " + "\nWhat do you normally do to freeze a minion wave?");
      question9.setChoiceA(
          "A: Have your minions and the enemy minions sit in the middle" + "of the lane.");
      question9.setChoiceB("B: Push your minion wave into the enemy's tower.");
      question9.setChoiceC("C: Have the minions crash into your tower, last hit while minions"
          + "are taking turret damage");
      question9.setChoiceD("D: Have the enemy's minions by your tower but not taking turret "
          + "damage, wait until minions get low health to last hit.");
      question9.setCorrectAnswer("D");
      MCquestion question10 = new MCquestion();
      question10.setQuestionText("10: " + "\nWhere does Kindred's mark first spawn at?");
      question10.setChoiceA("A: Top Scuttle Crab");
      question10.setChoiceB("B: Bot Scuttle Crab");
      question10.setChoiceC("C: Either Top or Bot Scuttle Crab");
      question10.setChoiceD("D: Enemy Raptors");
      question10.setCorrectAnswer("C");
      MCquestion question11 = new MCquestion();
      question11.setQuestionText("11: " + "\nWhich champion appears when you get 100 in the"
          + " Random Champion Game? (Hint: Answer is within this program)");
      question11.setChoiceA("A: Ashe");
      question11.setChoiceB("B: Hecarim");
      question11.setChoiceC("C: Kha'Zix");
      question11.setChoiceD("D: Elise");
      question11.setCorrectAnswer("C");
      MCquestion question12 = new MCquestion();
      question12.setQuestionText("12: " + "\nIn order to get Teemo when you are entering a"
          + " number for champion output, what number do you enter? "
          + "(Hint: Answer is within this program)");
      question12.setChoiceA("A: 1");
      question12.setChoiceB("B: -147");
      question12.setChoiceC("C: 147");
      question12.setChoiceD("D: 99");
      question12.setCorrectAnswer("B");
      MCquestion question13 = new MCquestion();
      question13.setQuestionText("13: " + "\nWhich champion in the champion list is found"
          + " at the coordinates (4, 1)? (Hint: Answer is within this program)");
      question13.setChoiceA("A: Sona");
      question13.setChoiceB("B: Lux");
      question13.setChoiceC("C: Azir");
      question13.setChoiceD("D: Volibear");
      question13.setCorrectAnswer("C");
      MCquestion question14 = new MCquestion();
      question14.setQuestionText(
          "14: " + "\nHow old is Orianna? " + "(Hint: Answer is within this program)");
      question14.setChoiceA("A: 22");
      question14.setChoiceB("B: 30");
      question14.setChoiceC("C: 28");
      question14.setChoiceD("D: Orianna does not have an age since she is a robot.");
      question14.setCorrectAnswer("A");
      MCquestion question15 = new MCquestion();
      question15.setQuestionText("15: " + "\nWhich four champions have a combined age of"
          + " 127? (Hint: Answer is within this program)");
      question15.setChoiceA("A: Trundle, Ezreal, Darius, Urgot");
      question15.setChoiceB("B: Fiora, Draven, Caitlyn, Pyke");
      question15.setChoiceC("C: Graves, Orianna, Lucian, Olaf");
      question15.setChoiceD("D: Sejuani, Ryze, Udyr, Sivir");
      question15.setCorrectAnswer("C");
      // Clears buffer (otherwise Q1 and Q2 prints at the same time)
      String choice = "";
      choice = scan.nextLine();
      // Creating an array of objects
      Question[] quizQuestions = { question1, question2, question3, question4, question5, question6,
          question7, question8, question9, question10, question11, question12, question13,
          question14, question15 };
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
      // it has any (this is also applied with the other methods in the MCquestion
      // class).
      rating.setScore(score);
      rating.setIncorrectAnswers(incorrectAnswers);
      rating.displayScore();
      System.out.println("Would you like to try again? Type Y to retry,"
          + " or type any other character to return to the main menu. ");
      programCase1 = scan.next();
    }
  }
}