package practice_codes2;

import java.util.Scanner;

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {
		
		
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum=0;
		for(int i=1;i<=number;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
