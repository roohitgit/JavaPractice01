package practice_codes;
import java.util.Scanner;
public class CommonFromTwoArray {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the size of the both arrays- ");
		try (Scanner sc = new Scanner(System.in)) {
			int n =sc.nextInt();
			int a1[] = new int[n];
			int a2[] = new int[n];

			
			System.out.println("Enter "+n+" elements for 1st array- ");
			for(int i=0;i<n;i++)
			{
				a1[i]= sc.nextInt();
			}
			
			System.out.println("Enter "+n+" elements for 2st array- ");
			for(int i=0;i<n;i++)
			{
				a2[i]= sc.nextInt();
			}
			

			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(a1[i]==a2[j])
					{
						
						System.out.println(a1[i]);
					
					}
				}
			}
		}
		
	
		
		
		
	}

}
