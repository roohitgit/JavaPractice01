package practice_codes2;

public class ReverseWordFromString {

	public static void main(String[] args) {
		
		String str = "Hello Rohit, Congratulations for your selection in TCS";
		String s[] = str.split(" ");
		for(int i=s.length-1; i>=0; i--)
		{
			System.out.print(s[i]+" ");
		}

	}

}
