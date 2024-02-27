package practice_codes;
import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		
		int n,a = 0,b = 1,c = 0;
		System.out.println("Enter a last number to print fibonacci series - ");
		try (Scanner sc = new Scanner(System.in)) {
			n=sc.nextInt();
		}
		System.out.print(a+" "+b+" ");
		while (c<n)
		{
			if((c=a+b)>n)
			{
				break;
			}
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
