package practice_codes;

import java.util.Scanner;

public class DeleteArrayByItemName {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the size of the array- ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int c,loc=0;
		int a1[] = new int[n];
		char ch;


		
		System.out.println("Enter "+n+" elements for array- ");
		for(int i=0;i<n;i++)
		{
			a1[i]= sc.nextInt();
		}
		
		System.out.println("Enter the element which you want to delete from array-");
		c=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(a1[i]==c)
			{
				loc = i;
				break;
			}
		}
		
		for(int i=loc;i<n-1;i++)
		{
			a1[i]=a1[i+1];
		}
		
		
		System.out.println("Item delete successfuly Do You want to Print array y/n? ");
		ch=sc.next().charAt(0);
		if(ch=='y' || ch== 'Y')
		{
		for(int i=0;i<a1.length-1;i++)
		{
		System.out.print(a1[i]+" ");
		}
		}

	}
	

}
