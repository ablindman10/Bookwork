import java.util.Scanner;

public class ComputeLoan {
public static void main(String[] args) {
  //make the scanner
  Scanner input = new Scanner(System.in);
  
  //Prompt user for interest
  System.out.print("Enter annual interest rate, e.g., 7.25%: ");
  double annualInterestRate = input.nextDouble();
  
  //calculate monthly interest rate
  double monthlyInterestRate = annualInterestRate / 1200;
  
  //prompt user for years
  System.out.print("Enter number of years as an interget, e.g., 5: ");
  int numberOfYears = input.nextInt();
  
  //prompt user for loan amount
  System.out.print("Enter the loan amount, e.g., 120000.95: ");
  double loanAmount = input.nextDouble();
  
  //Calculate payment
  double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
  
  double totalPayment = monthlyPayment * numberOfYears * 12;
  
  //Results
  System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100);
  System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100);
  }
}