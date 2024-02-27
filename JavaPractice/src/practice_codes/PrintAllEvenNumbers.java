package practice_codes;
import java.util.Scanner;
public class PrintAllEvenNumbers {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number till where you want to print the even number");
		try (Scanner sc = new Scanner(System.in)) {
			n=sc.nextInt();
		}
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			System.out.print(i+" ");
		}
	}

}
