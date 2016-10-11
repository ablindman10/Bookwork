import java.util.Scanner;

public class AdditionQuiz2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //generate 3 single digits
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
    int number3 = (int)(Math.random() * 10);
    
    //prompt user
    System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");
    int awnser = input.nextInt();
    
    //calculations
    if (awnser == number1 + number2 + number3)
      System.out.println("Correct!");
    else
      System.out.println("Sorry, thats incorrect. The awnser is :" +(number1 + number2 + number3));
    }
}