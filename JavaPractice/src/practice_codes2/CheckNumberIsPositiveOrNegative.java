package practice_codes2;
import java.util.Scanner;
public class CheckNumberIsPositiveOrNegative {

	public static void main(String[] args) {
		
		
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number>0)
			System.out.println("Entered number is positive");
		else if (number<0)
			System.out.println("Entered number is negative");
		else
			System.out.println("Entered number is neither positive nor negative");
		

	}

}
