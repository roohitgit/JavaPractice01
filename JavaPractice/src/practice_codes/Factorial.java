package practice_codes;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args)
	{
		int n, fact=1;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			n = sc.nextInt();
		}
		for(int c=1; c<=n; c++)
		{
			fact = fact * c;
		}
		System.out.println("Factorial of entered number is: "+fact);
	}
}
