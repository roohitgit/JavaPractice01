package practice_codes2;
import java.util.Scanner;

public class FloydsTrianglePrint {

	public static void main(String[] args) {
		
		int n,c,d,num=1; //n is for how many rows, c is for row, d for each elements in a row and num is number which is increment
		System.out.println("Enter number of rows");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Floyds Triangle");
		
		for(c=1; c<=n;c++)
		{
			for(d=1;d<=c;d++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println(" ");
		}
		

	}

}
