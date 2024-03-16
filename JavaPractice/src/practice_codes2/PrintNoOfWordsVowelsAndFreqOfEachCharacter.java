package practice_codes2;

import java.util.Map;
import java.util.TreeMap;

public class PrintNoOfWordsVowelsAndFreqOfEachCharacter {

	public static void main(String[] args) {
	
		String str = "Learn With Krishna Sandeep.";
		PrintNoOfWordsVowelsAndFreqOfEachCharacter p = new PrintNoOfWordsVowelsAndFreqOfEachCharacter();
				p.getWordVowelCount(str);
				p.frequency(str);

	}
	
	


	private static void getWordVowelCount(String str)
	{
		int wordCount=0;
		int vowelCount=0;
		int upperCaseCount=0;
		
		for(int i=0;i<str.length(); i++)
		{
			char c=str.charAt(i);
			
			switch (c)
			{
			case ' ':
			case '.':
			wordCount++;	
			}
			
			switch (c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			vowelCount++;
			}
			
			if(c>=65 && c<=90)
			{
				upperCaseCount++;
			}
			
		}
		
		System.out.println("wordCount="+wordCount);
		System.out.println("vowelCount="+vowelCount);
		System.out.println("upperCaseCount="+upperCaseCount);
		
		
		
	}
	
	private void frequency(String str) {
	
		TreeMap<Character, Integer> map = new TreeMap<>();
		for(int i=0; i<str.length();i++)
		{
			Integer c=map.get(str.charAt(i));
		
		if(map.get(str.charAt(i))==null)
		{
			map.put(str.charAt(i),1);
		}
		else
		{
			map.put(str.charAt(i), ++c);
		}
	
	}
		for(Map.Entry entry : map.entrySet())
		{
			System.out.print("Character="+entry.getKey()+" ");
			System.out.print("Frequency="+entry.getValue()+",");
		}
	}
	
}

