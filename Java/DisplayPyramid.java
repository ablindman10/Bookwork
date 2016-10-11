/*										*/
/* Author: Brian Skinner							*/
/* ID: 2287327									*/
/*										*/
/* Program Description: display pyramid given a number from 1-15		*/
/*										*/


// prompt user to input the amount of lines
// grabs input stores it as lines (the also can be used as the max number)
// checks if lines is to big (larger than 15)
// print new line for the pyramid
// one large for, starts with i = 1
// a nested for, starts at 1, and the amount of tabs is always line - index, where index is the line number
// for example the first line should have (line) - index,  7 - 1, 6 tabs
// a nested for, starts at index (line number), counts down
// a nested for, starts at 2 that counts up

// please note I spent 2 hours on this myself, before giving up and googleing for some help
// http://javaconceptoftheday.com/how-to-create-pyramid-of-numbers-in-java/
// I used some of pattern # 4 code, and modified it


import java.util.Scanner;

public class DisplayPyramid {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int lines = 0; // number of lines that user inputs
    int index = 1; //Start of the pyramid, the largest value
    
    // prompt user for input
    System.out.print("Enter the number of lines(must be between 1 and 15): ");
    lines = input.nextInt();
    
    // checks if lines is acceptable value
    if(lines >= 15 || lines < 1) {
      System.out.println("Error value must between 1 and 15");
      System.exit(1);
    }
    
    // prints new line for the pyramid
    System.out.printf("\n");
    
    for(int i = 1; i <= lines; i++) {
    
      //print the spacing
      for(int j = 1; j <= lines - index; j++) {
	System.out.print("\t");
      }
      
      //print the numbers decreasing
      for(int j = index; j >= 1; j--) {
	System.out.print(j + "\t");
      }
      
      //prints numbers to the right
      for(int j = 2; j <= index; j++) {
	System.out.print(j + "\t");
      }
      
      //print a new line
      System.out.println();
      
      //increase the index
      index++;
    }
  }
}