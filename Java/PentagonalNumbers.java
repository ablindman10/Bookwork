public class PentagonalNumbers {
  public static void main(String[] args) {
   int i = 0;
   
    //loop and get petagonal values
    while (i <= 100) {
      if (i % 10 == 0)
	System.out.println(getPentagonalNumber(i));
      else
	System.out.print(getPentagonalNumber(i) + " ");
      i++;
    }
  }
      
  public static int getPentagonalNumber(int n) {
    n = (n * (3 * n - 1)) / 2;
    return n;
  }
}