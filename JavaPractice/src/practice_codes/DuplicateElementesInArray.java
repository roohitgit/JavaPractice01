package practice_codes;
import java.util.Scanner;
public class DuplicateElementesInArray {

	public static void main(String[] args) {
		int n;
		
		System.out.println("Enter size of the array:- ");
		try (Scanner sc = new Scanner(System.in)) {
			n=sc.nextInt();
			int[] a = new int[n];
			System.out.println("Enter "+n+" elements");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						System.out.println(a[i]);
					}
				}
			}
		}
	}

}
