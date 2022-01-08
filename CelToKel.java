package coding1;
   import java.util.Scanner;

   public class CelToKel {

	public static void main(String[] args) {
	  Scanner input = new Scanner (System.in);
	      System.out.print("Input the temperature in Celcius: ");
	  double c = input.nextDouble();
	  
	  double k = 273.15+c;
	      System.out.println("Temperature in Celcius: " +c);
	      System.out.println("Temperature in Kelvin: " +k);
	  	
    }

}
