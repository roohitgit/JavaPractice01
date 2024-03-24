package practice_codes2;

import java.util.Scanner;

public class CheckGivenNoIsPerfectSquareOrNot {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int i=0;i<number/2;i++)
		{
			if(i*i==number)
			{
				System.out.println("Given number is a perfect square number.");
				break;
			}
				
		}
		

	}

}
