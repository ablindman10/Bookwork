/*										*/
/* Author: Brian Skinner							*/
/* ID: 2287327									*/
/*										*/
/* Program Description: count vowels in a string				*/
/*										*/

// this program is similar to 5.14 in the book
// grab input using nextLine
// have a low
// have a high using length -1
// while (low <= high)
// inside the while have if statements for a e i o u, increasing vowel by 1
// have a if statement for spaces, tabs, will subtract 1 from consonants
// have an else to increase consonants
// ends with increasing low




import java.util.Scanner;

public class CountVowels {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // make the string variable, then prompt user for input
    String s;
    System.out.print("Enter a string: ");
    s = input.nextLine();
    
    
    int low = 0; // lowest index of array
    int high = s.length() - 1; // highest index of array, index starts at 0
    int vowel = 0; // number of vowels
    int consonants = 0; // number of consonants
    int foundVowel = 0; // 0 means character can be a vowel, or a consonant, 1 means it has ben matched
    
    
    //while loop
    while(low <= high) {
      //sets foundVowel to 0
      foundVowel = 0;
    
      //checks for a, e, i, o, u and for caps
      if((s.charAt(low) == 'a' || s.charAt(low) == 'A') && foundVowel == 0){
	vowel++;
	foundVowel = 1; // vowel found state = 1
      }
      if((s.charAt(low) == 'e' || s.charAt(low) == 'E') && foundVowel == 0){
	vowel++;
	foundVowel = 1;
      }
      if((s.charAt(low) == 'i' || s.charAt(low) == 'I') && foundVowel == 0){
	vowel++;
	foundVowel = 1;
      }
      if((s.charAt(low) == 'o' || s.charAt(low) == 'O') && foundVowel == 0){
	vowel++;
	foundVowel = 1;
      }
      if((s.charAt(low) == 'u' || s.charAt(low) == 'U') && foundVowel == 0){
	vowel++;
	foundVowel = 1;
      }
      // checks for spaces or tabs, does not add it to consonants
      if((s.charAt(low) == ' ' || s.charAt(low) == '\t') && foundVowel == 0) {
	foundVowel = 1; // vowel was not found, but at the same time, i dont spaces and tabs to be counted as consonants
      }
      //fall through, matches no condition, so it must be a consonant
      if(foundVowel == 0) {
	consonants++;
	foundVowel = 1;
      }
      //checks to see if its at the end of the array
      if(low == high) {
	System.out.println("The number of vowels is " + vowel);
	System.out.println("The number of consonants is " + consonants);
	System.exit(0);
      }
      
      //end of check, increase low and check again
      low++;
    }
  }
}