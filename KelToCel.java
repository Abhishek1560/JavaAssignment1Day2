package coding1;
   import java.util.Scanner;
   
 public class KelToCel {

	public static void main(String[] args) {
	  Scanner input = new Scanner (System.in);
	  System.out.print("Input the temperature in Kelvin: ");
	  double k = input.nextDouble();
	  
	  double c = k-273.15 ;
	  System.out.println("The temperature in Kelvin: " +k);
	  System.out.println("The temperature in Celsius: " +c);

	}

}
