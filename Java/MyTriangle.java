/*										*/
/* Author: Brian Skinner							*/
/* ID: 2287327									*/
/*										*/
/* Program Description: Use methods to find area of triagle,if possible		*/
/*										*/


// display the sides of the triangles to the user
// inside main have 2 possible triangles, 1, 1, 1 and 4, 4.5, 6
// call the function isValid which checks that the sum of any two sides is > than the third
// call a funtiion that calculates the area of the tiangle (2.19)
// displays area, or if it cannot be found

public class MyTriangle {
  public static void main(String[] args) {
    
    //create 2 triangles
    double triangle1Side1 = 1;
    double triangle1Side2 = 1;
    double triangle1Side3 = 1;
    
    double triangle2Side1 = 4;
    double triangle2Side2 = 4.5;
    double triangle2Side3 = 6;
    
    //display to the user what the first triangle is
    System.out.println("The Frist triangle has sides: " + triangle1Side1 + " " + triangle1Side2 + " " + triangle1Side3);
    
    //call the funtion isValid, then if its true, call area and display area for frist triangle
    if(isValid(triangle1Side1, triangle1Side2, triangle1Side3) == true) {
      System.out.println("The area of the triangle is: " + area(triangle1Side1, triangle1Side2, triangle1Side3));
    }
    // check if its false print, error triangle not possible
    if(isValid(triangle1Side1, triangle1Side2, triangle1Side3) == false) {
      System.out.println("ERROR: First Triangle not possible");
    }
    
    //display to the user what the second triangle is
    System.out.println("The Frist triangle has sides: " + triangle2Side1 + " " + triangle2Side2 + " " + triangle2Side3);
    
    //second triangle
    if(isValid(triangle2Side1, triangle2Side2, triangle2Side3) == true) {
      System.out.println("The area of the triangle is: " + area(triangle2Side1, triangle2Side2, triangle2Side3));
    }
    if(isValid(triangle2Side1, triangle2Side2, triangle2Side3) == false) {
      System.out.println("ERROR: Second Triangle not possible");
    }
  }
  
  //isValid logic
  public static boolean isValid(double side1, double side2, double side3) {
    if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
      return true;
    }
    else {
      return false;
    }
  }
  // area logic
  public static double area(double side1, double side2, double side3) {
    double s;
    s = (side1 + side2 + side3) / 2;
    return Math.pow((s * (s - side1) * (s - side2) * (s - side3)), .5);
  }
}

