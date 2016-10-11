import java.util.Scanner;

public class ComputeFC {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //prompt user for input
    System.out.print("Enter a degree in Celsius:");
    double cels = input.nextDouble();
    
    //calculation
    double fahr = 9.0 / 5.0 * cels + 32;
    
    //output
    System.out.println(cels + " Celsius is " + fahr + " Fahrenheit");
    }
}