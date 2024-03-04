package practice_codes2;

import java.util.Scanner;

public class DeleteElementFromArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		System.out.println("Which element do you want to delete from below -");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		Scanner sc = new Scanner(System.in);	
		int element = sc.nextInt();
		int loc=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				loc=i;
				break;
			}
				
		}
		for(int i=loc; i<a.length-1; i++)
		{
			a[i]=a[i+1];
			
		}
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
