import java.util.Scanner;

public class Lottery {
  public static void main(String[] args) {
    int lottery = (int)(Math.random() * 100);
    
    //prompt user for a guess
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your lottery pick (2 digits): ");
    int guess = input.nextInt();
    
    int lotteryDigit1 = lottery / 10;
    int lotteryDigit2 = lottery % 10;
    
    int guessDigit1 = guess / 10;
    int guessDigit2 = guess % 10;
    
    System.out.println("The lottery number is " + lottery);
    
    // check the guess
    if (guess == lottery)
      System.out.print("Exact match: you win $10,000");
    else if (guessDigit2 == guessDigit1 && guessDigit1 == guessDigit2)
      System.out.println("Match all digits: you win $3,000");
    else if (guessDigit1 == guessDigit1 || guessDigit1 == guessDigit2 || guessDigit2 == guessDigit1 || guessDigit2 == guessDigit2)
      System.out.println("Match one digit: you win $1,000");
    else
      System.out.println("Sorry, no matach");
      }
}