package practice_codes2;

import java.util.Scanner;
import java.util.PrimitiveIterator.OfDouble;

public class TakeFirstAndLastDigitAndMakeSumOfIt {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int number;
		number=scanner.nextInt();
		int lastDigit = number%10;
		
		int firstDigit = number;
		while(firstDigit>=10)
		{
			firstDigit=firstDigit/10;
		}
		
		int sum = firstDigit+lastDigit;
		
		
		System.out.println("FirstDigit- "+firstDigit);
		System.out.println("LastDigit- "+lastDigit);
		System.out.println("sum of first and last digit is "+sum);

	}

}
