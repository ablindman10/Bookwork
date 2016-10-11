public class TestSum {
  public static void main(String[] args) {
    //initialize sum
    float sum = 0;
    
    //add 0.01 + 0.02 +..... to 1.0
    
    for (float i = 0.01f; i <= 1.0f; i = i + 0.01f) 
    sum += i;
    
    //display the results
    System.out.println("The sum is " + sum);
  }
}