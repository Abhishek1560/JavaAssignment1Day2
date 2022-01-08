package coding1;
import java.util.Scanner;

public class kelToFarh {

	public static void main(String[] args)  {
	Scanner input = new Scanner (System.in);
	System.out.print("Input the temperature in kelvin: " );
	double k = input.nextDouble();
	
	
	double f = (k-273.15)* 9/5 +32;
	System.out.println("Temperature in Kelvin: "+k);
	System.out.println("Temperature in Fahrenheit: " +f);
	
	}

}
