/*										*/
/* Author: Brian Skinner							*/
/* ID: 2287327									*/
/*										*/
/* Program Description: Calculating taxable income				*/
/*										*/

// prompt user for taxable income
// have an execption for invalid input, negative numbers
// use nested if, with else if statements
// income from 0 to 9075 taxed at 10% or .10 times taxable income
// 9076 to 36900 taxed at .15 or 15%
// continue this pattern
// display the amount of tax
// prompt user for number between 1 and 10
// use switch statements to display result


import java.util.Scanner;

public class NewComputeTax {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // number used for second half of program
    int number = 0;
    
    //prompt for tax amount
    System.out.print("Enter the taxable income up to 405099: ");
    double income =  input.nextDouble();
    
    double tax = 0;
    
    //computations
    if(income > 0 && income < 405100) {
      if (income <= 9075) 
	tax = income * .10;
      else if (income <= 36900)
	tax = 9075 * .10 + (income - 9075) * 0.15;
      else if (income <= 89350)
	tax = 9075 * .10 + (36900  - 9075) * 0.15 + (income - 36900) * 0.25;
      else if (income <= 186350)
	tax = 9075 *.10 + (36900 - 9075) * 0.15 + (89350 - 36900) * 0.25 + (income - 89350) * 0.28;
      else if (income <= 405100)
	tax = 9075 *.10 + (36900 - 9075) * 0.15 + (89350 - 36900) * 0.25 + (186350 - 89350) * 0.28 + (income - 186350) * 0.33;
      }
    // execption for invalid input
    else {
    System.out.println("Error: invalid income");
    System.exit(1);
    }
    
    //display results
    System.out.printf("Tax is %.2f\n", tax);
  
    /*									*/
    /* second half of the progam to print ordinal form of a number	*/
    /*									*/
  
    // prompt user to enter number 1-10
    System.out.print("Please enter a number from 1 to 10: ");
    number = input.nextInt();
  
    switch(number) {
      case 1: System.out.println(number + "st"); break;
      case 2: System.out.println(number + "nd"); break;
      case 3: System.out.println(number + "rd"); break;
      case 4: System.out.println(number + "th"); break;
      case 5: System.out.println(number + "th"); break;
      case 6: System.out.println(number + "th"); break;
      case 7: System.out.println(number + "th"); break;
      case 8: System.out.println(number + "th"); break;
      case 9: System.out.println(number + "th"); break;
      case 10: System.out.println(number + "th"); break;
      default: System.out.println("Error: number is not between 1 and 10"); System.exit(1);
    }
  }
}