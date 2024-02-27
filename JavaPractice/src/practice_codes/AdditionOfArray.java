package practice_codes;
import java.util.Scanner;

public class AdditionOfArray {

	public static void main(String[] args) {
		char reply;
		int sum = 0;
		int a[] = new int[5] ;
		
		System.out.println("Enter Five Numbers: ");
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=0; i<5; i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("Elements are stored successfully, Do you want to print addition of element Y/N");
			reply= sc.next().toLowerCase().charAt(0);
		}
		if (reply=='y')
		{
			for(int i=0; i<5; i++)
			{
				sum = sum+a[i];
			}
			System.out.println("Total Additon of all enterend number is "+sum);
		}
		else if (reply =='n')
		{
			System.out.println("Thank you for using our service. ");
		}
		else 
			System.out.println("Error Detected, Please try again ");
		
		

	}

}
