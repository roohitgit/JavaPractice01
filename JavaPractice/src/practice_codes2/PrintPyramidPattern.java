package practice_codes2;

import java.util.Scanner;

public class PrintPyramidPattern {

	public static void main(String[] args) {
		System.out.println("Enter how many row you want: ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int c, num=1;
		
		for(int i=row; i>=1; i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}

	}

}
