/*										*/
/* Author: Brian Skinner							*/
/* ID: 2287327									*/
/*										*/
/* Program Description: Calculating days and years with given amount of minutes	*/
/*										*/
 

// prompt user for amount of minutes
// minutes / 525600 = years
// minutes % 525600 = number of left over days in that year
// previous lines value / number of minutes in a day = days
// print values


import java.util.Scanner;

public class SecondsToYearsAndDays {
  public static void main(String[] args) {
    //initialize minutes, years, days
    int minutes = 0;
    int years = 0;
    int days = 0;
    Scanner input = new Scanner(System.in);
    
    //prompt user for input
    System.out.print("Please enter an INTERGER amount of minutes: ");
    minutes = input.nextInt();
    
    //calculations
    years = minutes / 525600;
    days = (minutes % 525600) / 1440; //minutes in day = 60 minutes * 24 hours
    
    //print results
    System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
  }
}