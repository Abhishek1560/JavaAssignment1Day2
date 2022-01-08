package coding1;
import java.util.Scanner;

public class FarhToKel {

	public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        System.out.print("Input the temperature in Fahrenheit: ");
    double f = input.nextDouble();
     
    double k = (f-32)*5/9 +273.15;
        System.out.println("Temperature in Fahrenheit is: " +f);
        System.out.println("Temperature in Kelvin is: " +k);
    
   }

}
