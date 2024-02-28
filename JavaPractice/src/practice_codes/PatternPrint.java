package practice_codes;

public class PatternPrint {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=7;i++)
		{
			for(int space=7; space>i;space--)
			{
				System.out.print(" ");
			}
			for(int star=1;star<=i;star++)
			{
				System.out.print("*");
			}
			System.out.println();
	
		}

		

	}

}
