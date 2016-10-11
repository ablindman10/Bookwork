/*										*/
/* Author: Brian Skinner							*/
/* ID: 2287327									*/
/*										*/
/* Program Description: generate a random 7 digit tag				*/
/*										*/

// the goal is to get a tag that looks something like this 141-TAGA
// the first 3 must be a number each between 0 and 9
// the last 4 must be a capital letter
// 1. generate 3 random numbers by use Math.random() * 10 this gives 0 to 9
// 2. generate 4 random capital letters by using ancii, the value ranges from 65 to 90 so i will use Math.random() * 26 + 65
// 3. print the results

public class RandomPlate {
  public static void main(String[] args) {
    // initialize the 7 possible locations
    char spot1 = '\0';
    char spot2 = '\0';
    char spot3 = '\0';
    int spot4 = 0;
    int spot5 = 0;
    int spot6 = 0;
    int spot7 = 0;
    
    // randomly generate 3 random capital letters
    spot1 = (char)(Math.random() * 26 + 65);
    spot2 = (char)(Math.random() * 26 + 65);
    spot3 = (char)(Math.random() * 26 + 65);
    spot4 = (int)(Math.random() * 10);
    spot5 = (int)(Math.random() * 10);
    spot6 = (int)(Math.random() * 10);
    spot7 = (int)(Math.random() * 10);
    
    // print results
    System.out.print("Your random tag is: ");
    System.out.printf("%c%c%c-%d%d%d%d\n", spot1, spot2, spot3, spot4, spot5, spot6, spot7);
  }
}