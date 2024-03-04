package practice_codes2;
import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string - ");
		String str = sc.nextLine();
		String result = " ";
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			result = ch+result;
		}
		System.out.println("reverse - "+result);
		if(result.equals(result))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not Palindrome");
		}
	}

}
