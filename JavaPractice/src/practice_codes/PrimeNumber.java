package practice_codes;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n=3,m = 16/2,flag=0;

		
		if (n==0||n==1)
		{
			System.out.println(n+" is not a prime number");
		}
		else
		{
			for (int i=2;i<=m;i++)
			{
				if(n%2==0)
				{
					System.out.println(n+" is not a prime number");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{ System.out.println(n+" is prime number"); }  
				
		}
}
}
