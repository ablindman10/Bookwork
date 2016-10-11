public class FindingN {
  public static void main(String[] args) {
    final int LARGEST_NUMBER = 12000;
    int number = 0;
    
    while(number * number <= 12000)
      number++;
      
    System.out.println("The smallest interger that when squared is bigger than 12000 is " + number);
  }
}