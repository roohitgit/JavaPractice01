package practice_codes2;

public class PrintEvenLengthOfWordFromString {

	public static void main(String[] args) {
		
		String string = "Hello Rohi Badole what are you doingg";
	
		for(String str:string.split(" "))
		{
			if(str.length()%2==0)
			{
				System.out.println(str);
			}
		}

	}

}
