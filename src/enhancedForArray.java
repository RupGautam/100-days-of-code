/**
 * Created by RupGautam on 7/26/17.
 */
import java.util.Scanner;
/**
 * Asks user for 7 different temperature and present them with average.
 * but using Array.
 */
public class enhancedForArray {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    double [] temperature = new double[7];
    System.out. println("Enter 7 temperature ");
    for (int i=0; i < 7; i++){
      temperature [i] = kb.nextDouble();
    }
    double sum = 0.0;
    for(double t:temperature) sum += t;
    System.out.println("average ="+sum/7.0);
  }

}