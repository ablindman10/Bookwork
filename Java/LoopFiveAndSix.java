public class LoopFiveAndSix {
  public static void main(String[] args) {
    final int LAST_NUMBER = 1000; // final number to check
    int number = 100; // first number to check
    int count = 0; //counts the amount of found number
    
    System.out.println("Number from 100 to 1000 that are divisible by 5 and 6");
    
    // loop, makes sure number between 100 and 1000
    while (number <= 1000) {
      //checks to see if its divisible
      if (number % 5 == 0 && number % 6 == 0){
	count++; //found one increase count
	//check if their are 10, prints new line
	if (count % 10 == 0){
	  System.out.println(number);
	}
	else {
	  System.out.print(number + " ");
	}
      }
      number++; //increase number then repeat loop
    }
  }
}