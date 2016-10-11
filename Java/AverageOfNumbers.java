/*										*/
/* Author: Brian Skinner							*/
/* ID: 2287327									*/
/*										*/
/* Program Description: Compute average and count numbers			*/
/*										*/


// prompt user for inputs
// loop the Scanner input
// nested if statements inside loop, one for data = 0, one to count the numbers etc.
// print results


import java.util.Scanner;

public class AverageOfNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // start variables at zero
    int data = 0;
    int count = 0; //counts how many numbers are in total
    int positive = 0; // counts positive numberes
    int negative = 0; // counts negative numbers
    double sum = 0.0; // sums all the numbers as a float
    boolean NonZeroExists = false;
    
    // prompt user for input
    System.out.print("Enter an interger, the input ends if it is 0: ");
    
    // use loops to grab input until user enters 0, all the logic is in here
    while(count >= 0) {
      data = input.nextInt();
      if(data > 0) {
	positive++; // counts positive numbers
	NonZeroExists = true; // checks if user entered non zero number
      }
      if(data < 0){
	negative++; // counts negative numbers
	NonZeroExists = true; // checks if user entered non zero number
      }
      if(data == 0) {
	if(NonZeroExists == false){ // if user only entered 0
	  System.out.println("No numbers are entered execpt 0");
	  break;
	  }
	else {
	  System.out.println("The number of positives is " + positive);
	  System.out.println("The number of negatives is " + negative);
	  System.out.println("The total is " + sum);
	  System.out.println("The average is " + sum / count);
	  break;
	}
      }
      // end of loop, increase count and sum data
      count++;
      sum += data;
    }
  }
}