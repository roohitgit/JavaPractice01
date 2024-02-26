package practice_codes;

import java.util.Scanner;

public class DeletingFromArray {

	public static void main(String[] args) {
		int loc;
		int a[] = {1,2,3,4,5};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("enter element you want to delete- ");
		Scanner sc = new Scanner(System.in);
		loc=sc.nextInt();
		for(int i=loc;i<a.length-1;i++) 
		{
		a[i]=a[i+1];
		}
		System.out.println("New Element of array");
		for(int i=0;i<a.length-1;i++)
		{
		System.out.print(a[i]+ " ");
		}

	}

}
