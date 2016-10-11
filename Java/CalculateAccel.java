import java.util.Scanner;

public class CalculateAccel {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //prompt user for values
    System.out.print("Please enter values for v0, v1, and t:");
    double v0 = input.nextDouble();
    double v1 = input.nextDouble();
    double t = input.nextDouble();
    
    //calculations
    double accel = (v1 - v0) / t;
    
    //print the value
    System.out.println("The average acceleration is " + accel);
    }
}