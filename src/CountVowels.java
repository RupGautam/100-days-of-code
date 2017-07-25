/**
 * Created by RupGautam on 7/25/17.
 */

/**
 * Counts vowels from given string
 */
import java.util.Scanner;

public class CountVowels {

  public static void main(String[] args) {
    //String str = "abcdefg HIJKLMNOP qrstuvwxyz";
    Scanner kb = new Scanner(System.in);

    String str = kb.nextLine();

    int upperCase = 0; //init 0 for upper case letters
    int loweCase = 0; // init 0 for lower case letters
    int non = 0;

    String vowels = "aeiouAEIOU";
    char[] array = str.toCharArray();

    for (char c : array) {
      if (vowels.indexOf(c) != -1) {
        if (Character.isLowerCase(c)) {
          loweCase = loweCase + 1;
        } else if (Character.isUpperCase(c))
          upperCase = upperCase + 1;

      }


    }
    System.out.println("String: " + str);
    System.out.println("Upper case vowels: " + upperCase);
    System.out.println("Lower case vowels: " + loweCase);
    System.out.println("Non vowels: " + non);
  }
}

