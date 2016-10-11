import java.util.Scanner;

public class FutureDate {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //prompt user for a day for the week
    System.out.print("Enter a day for the week (0 - 6): ");
    int dayValue = input.nextInt();
    
    System.out.print("Enter how many days have past: ");
    int nextDayValue = input.nextInt();
    
    //switch statements for calculate days
    String day1 = " ";
    switch (dayValue) {
    case 0: day1 = "Monday"; break;
    case 1: day1 = "Tuesday"; break;
    case 2: day1 = "Wednesday"; break;
    case 3: day1 = "Thursday"; break;
    case 4: day1 = "Friday"; break;
    case 5: day1 = "Saturday"; break;
    case 6: day1 = "Sunday"; break;
    default: System.out.println("Error, value not acceptable!"); 
	     System.exit(1);
    }
    
    nextDayValue = (dayValue + nextDayValue) % 7;
    String day2 = " ";
    switch (nextDayValue) {
    case 0: day2 = "Monday"; break;
    case 1: day2 = "Tuesday"; break;
    case 2: day2 = "Wednesday"; break;
    case 3: day2 = "Thursday"; break;
    case 4: day2 = "Friday"; break;
    case 5: day2 = "Saturday"; break;
    case 6: day2 = "Sunday"; break;
    default: System.out.println("Error, value not acceptable!"); 
	     System.exit(1);
    }
    
    //print the days
    System.out.println("The day is " + day1 + "	the future day is " + day2);
    }
}