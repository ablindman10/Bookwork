import java.util.Scanner;

public class FiveAndSix {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //prompt user for an input
    System.out.print("Enter a value to see if its divisible by 5 and 6: ");
    int number = input.nextInt();
    
    //calculations inside of print, using bolean cast
    System.out.println("Is " + number + " divisible by 5 and 6? " + (boolean)((number % 5 == 0) && (number % 6 == 0)));
    System.out.println("Is " + number + " divisible by 5 or 6? " + (boolean)((number % 5 == 0) || (number % 6 == 0)));
    System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + (boolean)((number % 5 == 0) ^ (number % 6 == 0)));
  }
}