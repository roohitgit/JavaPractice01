package practice_codes2;
import java.util.Scanner;

public class FloydsTrianglePrint {

	public static void main(String[] args) {
		
	
		//floyds triangle
		
		System.out.println("Enter how many row you want: ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int c, num=1;
		System.out.println("Floyds Triangle: ");
		for(int i=num; i<=row; i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	
		

	}

}
