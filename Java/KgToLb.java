public class KgToLb {
  public static void main(String[] args) {
    final int LAST_NUMBER = 200; //final number to calc
    int number = 1; // first number
    double lb;
    
    System.out.println("Kilograms\tPounds");
    while (number < LAST_NUMBER) {
      lb = number * 2.2;
      System.out.printf("%d\t\t%.1f\n", number, lb);
      number++;
    }
  }
}