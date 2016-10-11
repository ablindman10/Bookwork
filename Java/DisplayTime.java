import java.util.Scanner;

public class DisplayTime {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Prompt the user for input
    System.out.print("Enter an interger for seconds: ");
    int seconds = input.nextInt();
    
    int minutes = seconds / 60;
    int remainingseconds = seconds % 60;
    System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingseconds + " seconds");
    }
}