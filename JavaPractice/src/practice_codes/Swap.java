package practice_codes;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		int x,y;
//		//Style 1 with 3rd variable
//		System.out.println("Enter x and y values: ");
//		Scanner sc = new Scanner(System.in);
//		x = sc.nextInt();
//		y = sc.nextInt();
//		System.out.println("Before swap x="+x+" y is "+y);
//		z=x;
//		x=y;
//		y=z;
//		System.out.println("After swap x="+x+" y is "+y);
		
		
		
		//style 2 without 3rd variable
		
		System.out.println("Enter x and y values: ");
		try (Scanner sc = new Scanner(System.in)) {
			x = sc.nextInt();
			y = sc.nextInt();
		}
		System.out.println("Before swap x="+x+" y is "+y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After swap x="+x+" y is "+y);
		

	}

}
