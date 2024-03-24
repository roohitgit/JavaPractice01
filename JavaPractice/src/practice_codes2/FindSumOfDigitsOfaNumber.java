package practice_codes2;

import java.util.Arrays;
import java.util.Scanner;

public class FindSumOfDigitsOfaNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		String numberString = String.valueOf(number);
		char c;
		int sum=0;
		for(int i=0;i<numberString.length();i++)
		{
			c = numberString.charAt(i);
			int n = Character.getNumericValue(c);
			sum=sum+n;
			
			
		}
System.out.println("sum is = "+sum);
				
		
		
		

	}

}
