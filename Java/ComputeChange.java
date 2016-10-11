import java.util.Scanner;

public class ComputeChange {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter an amount in double, for example 11.56: ");
  double amount = input.nextDouble();
  
  int remaningAmount = (int)(amount * 100);
  
  int numberOfOneDollars = remaningAmount / 100;
  remaningAmount = remaningAmount % 100;
  
  int numberOfQuarters = remaningAmount / 25;
  remaningAmount = remaningAmount % 25;
  
  int numberOfDimes = remaningAmount / 10;
  remaningAmount = remaningAmount % 10;
  
  int numberOfNickles = remaningAmount / 5;
  remaningAmount = remaningAmount % 5;
  
  int numberOfPennies = remaningAmount;
  
  //display results
  System.out.println("Your amount of " + amount + " consists of");
  System.out.println("    " + numberOfOneDollars + " dollars");
  System.out.println("    " + numberOfQuarters + " quarters");
  System.out.println("    " + numberOfDimes + " dimes");
  System.out.println("    " + numberOfNickles + " nickles");
  System.out.println("    " + numberOfPennies + " pennies");
  }
}