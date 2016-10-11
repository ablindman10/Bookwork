import java.util.Scanner;

public class TestValues {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //prompt for TestValues
    System.out.print("Enter a value that is an interger: ");
    int value = input.nextInt();
    
    //if statements logic with output
    if ((value > 1 && value < 100) || value < 0)
      System.out.println("The number is negative or it is between 1 and 100");
    else
      System.out.println("The value is not negative or between 1 and 100");
  }
}