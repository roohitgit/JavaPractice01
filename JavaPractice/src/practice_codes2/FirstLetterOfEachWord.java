package practice_codes2;

import java.util.Arrays;

public class FirstLetterOfEachWord {

	public static void main(String[] args) {
		
		
		String str = "Happy Birthday Rohit Badole.";
		String sp[] = str.split(" ");
		
		for(int i=0;i<sp.length;i++)
		{
			System.out.print(sp[i].charAt(0)+" ");
		}
		

	}

}
