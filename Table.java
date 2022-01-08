package coding1;
    import java.util.Scanner;

 public class Table {

	public static void main(String[] args) {
	int i;
	Scanner input = new Scanner (System.in);
	System.out.print("Input a number: ");
	 int a = input.nextInt();
	 
	 for (i=1 ; i<=10; i++)  {
	 
	System.out.println(a +" * " +i+ " = " + a*i);	 
    	 
	 }  

	}

}
