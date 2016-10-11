import java.util.Scanner;

public class SubtractionQuizLoop {
  public static void main(String[] args) {
    final int NUMBER_OF_QUESTIONS = 5; //Number of questions
    int count = 0; //Count the number of questions
    int correctCount = 0; //Count the number of correct answers
    long startTime = System.currentTimeMillis();
    String output = " "; // output string is initially empty
    Scanner input = new Scanner(System.in);
    
    while (count < NUMBER_OF_QUESTIONS) {
      //1. Generate two randoms single-digits numbers
      int number1 = (int)(Math.random() * 10);
      int number2 = (int)(Math.random() * 10);
      
      //check and fix negative possibilities
      if (number1 < number2) {
	int temp = number1;
	number1 = number2;
	number2 = temp;
      }
      
      //prompt the student for answer
      System.out.print("What is " + number1 + " - " + number2 + "? ");
      int answer = input.nextInt();
      
      //grade the questions
      if (number1 - number2 ==  answer) {
	System.out.println("You are correct!");
	correctCount++; // increase the correct count
      }
      else
	System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
	
      //increase each time till u reach 5
      count++;
      
      //a string that is added each time with inital " " to grade each and print at //end.
      output += "\n" + number1 + "-" + number2 + "=" + answer + ((number1 - number2 == answer) ? " correct" : " Wrong");
    }
    
    long endTime = System.currentTimeMillis();
    long testTime = endTime - startTime;
    
    System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
  }
}