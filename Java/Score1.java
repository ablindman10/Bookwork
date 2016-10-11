import java.util.Scanner;

public class Score1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //prompt the user for an input
    System.out.print("Please in put the score:");
    double score = input.nextDouble();
    
    //calculations
    if (score > 90 ){
      score = score * 1.03;
      }
    else{
    score = score * 1.01;
    }
   
   //display results
    System.out.println("The value is " + score);
    }
}