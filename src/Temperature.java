/**
 * Created by RupGautam on 7/24/17.
 */

/**
 * Write Temperature class and hold the temp in F
 * and provide method to convert into Celsius and Kelvin.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperature{
  private static DecimalFormat df2 = new DecimalFormat(".##"); //2 places decimals.
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter temperature in Fahrenheit: ");
    double ftemp = kb.nextDouble(); //hold temperature for temp purpose.


    TemperatureTest temp = new TemperatureTest(ftemp);
    System.out.println("The temperature in Fahrenheit: " + df2.format(temp.getF())); // getting F with two place decimals
    System.out.println("The temperature in Celsius: " + df2.format(temp.getC())); // getting C -//-
    System.out.println("The temperature in Kelvin: " + df2.format(temp.getK())); // getting K -//-
  }
}


class TemperatureTest {
  double ftemp;
  TemperatureTest(double ftemp){
    this.ftemp = ftemp;
  }


  public double getF() {
    return ftemp;
  }

  public double getC(){
    return ((double) 5 / 9 * (ftemp - 32));

  }

  public double getK(){
    return (((double) 5 / 9 * (ftemp - 32)) + 273);
  }
}

