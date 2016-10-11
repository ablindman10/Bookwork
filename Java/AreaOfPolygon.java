/*										*/
/* Author: Brian Skinner							*/
/* ID: 2287327									*/
/*										*/
/* Program Description: Calculating area of polygon				*/
/*										*/

// prompt the user for n number of sides (int)
// prompt user for length of side in double
// run the calculation by useing trig (tan) and pi constant
// display results

import java.util.Scanner;

public class AreaOfPolygon {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = 0; // number of sides
    double s = 0.0; // length of side
    double area = 0.0; // area of polygon
    
    // prompt user for some inputs
    System.out.print("Please enter the number of sides as an interger: ");
    n = input.nextInt();
    
    System.out.print("Please enter the length of the side: ");
    s = input.nextDouble();
    
    // calculate the area
    area = (n * s * s) / (4 * Math.tan(Math.PI / n));
    
    // print the result
    System.out.println("The area of the polygon is " + area);
  }
}