package practice_codes2;
import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		
		
		System.out.println("Enter a year- ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println("This "+year+" year is a leap year");
		}
		else 
			System.out.println("This "+year+" year is not a leap year");
		
	}

}
