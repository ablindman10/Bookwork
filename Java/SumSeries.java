public class SumSeries {
  public static double sum(double i) {
    double value = 0;
    while (i >= 0) {
      value += i / (i + 1);
      i--;
    }
    return value;
  }
}