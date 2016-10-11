import java.util.Scanner;

public class SubtractionQuiz {
  public static void main(String[] args) {
    // generate 2 random single digits numbers via casting
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
    
    if (number1 < number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
      }
      
    // primpt for awnser
    System.out.print("What is " + number1 + " - " + number2 + "? ");
    Scanner input = new Scanner(System.in);
    int awnser = input.nextInt();
    
    //grade the awnser
    if (number1 - number2 == awnser) {
      System.out.println("You are corrent!");
      }
    else {
      System.out.println("Your awnser is wrong.");
      System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
      }
    }
 }