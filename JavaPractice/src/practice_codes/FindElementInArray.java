package practice_codes;
import java.util.Scanner;

public class FindElementInArray {

	public static void main(String[] args) {
		Boolean status = false;
		System.out.println("Enter the size of the array-");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter "+size+" elements in the array-");
		int a[] = new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Please enter an element you want to find?");
		int find = sc.nextInt();
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==find)
			{
				System.out.println("Yes element "+find+" is present inside array at location- "+i);
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("Element "+find+" is not present inside array");
		}
		
			
		

	}

}
