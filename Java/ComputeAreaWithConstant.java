import java.util.Scanner;

public class ComputeAreaWithConstant {
  public static void main(String[] args) {
    final double pi = 3.14159;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number for a Radius: ");
    double radius = input.nextDouble();
    
    double area = radius * radius * pi;
    
    System.out.println("The area for the cricle of radius " + radius + " is " + area);
    }
}