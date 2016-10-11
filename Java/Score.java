import java.util.Scanner;

public class Score {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter a score:");
    double score = input.nextDouble();
    
    if (score > 90) {
      score = score * 1.03;
      }
      
    System.out.println("The value is " + score);
    }
}