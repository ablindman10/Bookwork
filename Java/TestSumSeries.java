public class TestSumSeries {
  public static void main(String[] args) {
    double i = 1.0; //start value
    
    //print i then m(i) then a line
    System.out.println("i\t\tm(i)");
    System.out.print("__________________________________\n");
    
    while (i <= 20) {
      System.out.printf("%d\t\t%.4f\n", (int)i, SumSeries.sum(i));
      i++;
    }
  }
}