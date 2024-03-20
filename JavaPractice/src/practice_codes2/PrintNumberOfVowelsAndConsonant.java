package practice_codes2;

public class PrintNumberOfVowelsAndConsonant {

	public static void main(String[] args) {
		
		String str = "Happy Birthday Rohit Badole";
		int consonant=0;
		int vowels=0;
		for(int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			if (c == ' '|| c=='.' )
			{
				
			}
			else if (c == 'a'|| c=='e'||c=='i'||c=='o'||c=='u')
			{
				vowels++;
			}
			else {
			
				consonant++;
			}
		}
		System.out.println("vowels are "+vowels+" and consonants are "+consonant);
		

	}

}
