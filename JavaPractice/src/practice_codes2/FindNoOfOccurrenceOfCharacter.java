package practice_codes2;

import java.util.Scanner;

public class FindNoOfOccurrenceOfCharacter {
	
	public static void main(String args[]) {
		System.out.println("Enter a String - ");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		
		int stringLength = string.length();
		System.out.println("Enter a char which you want to find its occurrence-");
		Scanner scanner = new Scanner(System.in);
		String c = scanner.next();
		
		string = string.replace(c, "");
		int finalLength = string.length();
		
		System.out.println("Number of occurrence "+(stringLength-finalLength));
		
		
		
		
		
	}

}
