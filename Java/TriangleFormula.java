/*										*/
/* Author: Brian Skinner							*/
/* ID: 2287327									*/
/*										*/
/* Program Description: Calculating area of triangle given 3 points		*/
/*										*/

// Interestingly enough, I derived this formula in high school by myself, and it take a lot of effort to do so, it’s called herons formula
// prompt user for 3 points (as a double)
// grab x1, y1, x2, y2 ..... and so on
// since i cant use functions yet, i have to calculate each one
// side is sqrt( x2 - x1 + y2 - y1), for each side. I will use power(( x2 - x1 + y2 - y1), .5)
// calculate s
// calculate area using s
// print area

import java.util.Scanner;
public class TriangleFormula {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //define variables
    double x1, x2, x3, y1, y2, y3 = 0.0;
    double side1, side2, side3 = 0.0;
    double s = 0.0;
    double area = 0.0;
    
    //prompt user for an input
    System.out.println("Enter three points for a triangle, for example (2, 3) you would enter 2 3 : ");
    x1 = input.nextDouble();
    y1 = input.nextDouble();
    x2 = input.nextDouble();
    y2 = input.nextDouble();
    x3 = input.nextDouble();
    y3 = input.nextDouble();
    
    //calculate length of the sides
    side1 = Math.pow(((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)), .5);
    side2 = Math.pow(((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2)), .5);
    side3 = Math.pow(((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3)), .5);
    
    //calculate s
    s = (side1 + side2 + side3) / 2;
    
    // calculate area
    area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), .5);
    
    //print useing the printf function to round off the double value;
    System.out.printf("The area of the triangle is %.1f\n", area);
  }
}