package practice_codes2;

import java.util.Scanner;

public class InsertElementIntoArrayAtSpecifitLocation {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50,70,80,0};
		
		System.out.println("On what location you want to add a element-");
		Scanner sc = new Scanner(System.in);
		int loc = sc.nextInt();
		System.out.println("Which number do you want to add-");
		int value = sc.nextInt();
		for(int i=a.length-1;i>loc;i--)
		{
			a[i]=a[i-1];
		}
		a[loc]=value;
		for(int n:a)
		{
			System.out.print(n+" ");
		}
	}

}
