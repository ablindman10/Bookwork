public class PrimeNumberTwo {
  public static void main(String[] args) {
    final int NUMBER_OF_PRIMES_PER_LINE = 8;
    int count = 0;
    int number = 2;
    
    System.out.println("Primes between 2 and 1000 are: \n");
    
    //loop for find the primes
    while (number <= 1000) {
      //asume number is prime then test
      boolean isPrime = true;
      
      //Test to prove false
      for (int divisor = 2; divisor <= number / 2; divisor++) {
	if (number % divisor == 0) {
	  isPrime = false;
	  break;
	}
      }
      
      //display prime and increase the count
      if (isPrime) {
	count++;
	if(count % NUMBER_OF_PRIMES_PER_LINE == 0) {
	  System.out.println(number);
	}
	else
	  System.out.print(number + " ");
      }
      
      number++;
    }
  }
}