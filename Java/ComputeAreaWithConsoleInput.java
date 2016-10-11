import java.util.Scanner; // Scanner is in the java.until package

public class ComputeAreaWithConsoleInput {
  public static void main(String[] args) {
  // Create a Scanner Object
  Scanner input = new Scanner(System.in);
  
  //prompt the user to enter a radius
  System.out.print("Enter a number for radius: ");
  double radius = input.nextDouble();
  
  //Compute Area
  double area = radius * radius * 3.14159;
  
  //Display Results
  System.out.println("The area for the circle of radius " + radius + " is " + area);
  }
}