public class FeetAndMeters {
  public static void main(String[] args) {
    double i = 1.0;
    double j = 20.0;
    
    //print feet meters | meters feet
    System.out.println("Feet\t\tMeters\t\t|\t\tMeters\t\tFeet");
    
    //prints values while calling functions
    while(i <= 10 && j <= 65) {
      System.out.printf("%.1f\t\t%.3f\t\t|\t\t%.1f\t\t%.3f\n", i, footToMeter(i), j, meterToFoot(j));
      i++;
      j = j + 5.0;
    }
  }
 

  public static double footToMeter(double foot) {
    double meter = foot * 0.305;
    return meter;
  }
  
  public static double meterToFoot(double meter) {
    double foot = meter * 3.279;
    return foot;
  }
}