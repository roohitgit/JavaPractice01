package practice_codes;
import java.util.Scanner;
public class FahrenheitToCelsius {

	public static void main(String[] args) {
		int temperature;

		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a temperature in fahrenheit = ");
		temperature = in.nextInt();
		
		temperature = ((temperature-32)*5)/9;
		System.out.println("Temperature in celsius is = "+temperature);
		
		
		 
		 
		
		

	}

}
