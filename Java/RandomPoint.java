import java.util.Scanner;

public class RandomPoint {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //generate a random x between 0 and 100 not including 100
    //generate a random y between 0 and 200 not including 200
    int x = (int)(Math.random() * 100);
    int y = (int)(Math.random() * 200);
    
    System.out.println("the point is (" + x + "," +y + ")" );
    }
}