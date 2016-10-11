/*							*/
/* Author: Brian Skinner				*/
/* ID: 2287327						*/
/*							*/
/* Program Description: Calculating U.S Populations	*/
/*							*/


// use a population variable with intial value, and use variable sum as total of in and out (born, moved, died)
// calculate this over 5 years, start with population = 312032486
// use a loop to calculate population, for i = 1 i < 6, print those values repeatedly

public class WorldPoP {
  public static void main(String[] args) {
    // initial population, how many seconds in a year (asuming non leapyear)
    int population = 312032486;
    final int SECONDS = 31536000; //60 sec * 60 mins * 24 hours * 365 days
    
    // initial sumation, (total in - out)
    double sum = 0.0;
    
    //calculations, print statements
    for(int i = 1; i < 6; i++) {
      //find out how many more people are in U.S at end of the i number of years
      sum = ((SECONDS / 7) + (SECONDS / 45) - (SECONDS / 13)) * i;
      //print sum + population using int casting (can only have a whole person)
      System.out.println("The United States poplation in " + (2016 + i) + " is: " + (int)(population + sum));
    }
  }
}