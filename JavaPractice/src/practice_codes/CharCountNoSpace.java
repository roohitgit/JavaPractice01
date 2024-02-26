package practice_codes;
import java.util.Scanner;
public class CharCountNoSpace {

	public static void main(String[] args) {
		int c=0;
		String in;
		System.out.println("Enter string-");
		Scanner sc = new Scanner(System.in);
		in = sc.nextLine();
		System.out.println("String count is "+in.length() );
		for (int i=0;i<in.length();i++)
		{
			if (in.charAt(i) ==' ')
			{
				c++;
			}
		}
		c = in.length()-c;
		System.out.println("String count is without space "+c );
		
		
		
		
		
	}

}
