package practice_codes2;

public class CountNumberOfDigitsInANumber {

	public static void main(String[] args) {
	
		
		int number = 2343;
		int count = 0;
		
		while(number!=0)
		{
			number = number/10;
			count++;
		}
		System.out.println(count);

	}

}
