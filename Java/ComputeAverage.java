import java.util.Scanner;

public class ComputeAverage {
  public static void main(String[] args) {
  // Create a Scanner Object
  Scanner input = new Scanner(System.in);
  
  //Prompt user for 3 numbers
  System.out.print("Enter three numbers: ");
  double number1 = input.nextDouble();
  double number2 = input.nextDouble();
  double number3 = input.nextDouble();
  
  //Compute average
  double average = (number1 + number2 + number3) / 3;
  
  //Display Results
  System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
  }
}