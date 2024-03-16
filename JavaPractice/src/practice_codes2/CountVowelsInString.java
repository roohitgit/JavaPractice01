package practice_codes2;

public class CountVowelsInString {

	public static void main(String[] args) {
		
		
//	String str = "aeioumzxbcvmbaeiou";
//	char ch[] = str.toCharArray();
//	int count = 0;
//	for(char c: ch)
//	{
//		switch (c) {
//		
//		
//		case 'a':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':
//			count++;
//			break;
//	}
//	
//	}
//System.out.println(count);
		
		
		
		
		String str = "aeioumzxbcvmbaeiou";
		char ch[] = str.toCharArray();
		int a = 0,e=0,i=0,o=0,u=0;
		
		for(char c:ch)
		{
			switch (c)
			{
			
			case 'a':
				a++;
				break;
			
			case 'e':
				e++;
				break;
				
			case 'i':
				i++;
				break;
				
			case 'o':
				o++;
				break;
				
			case 'u':
				u++;
				break;
			
			
			}
		}
		
		
		System.out.println("a= "+a);
		System.out.println("e= "+e);
		System.out.println("i= "+i);
		System.out.println("o= "+o);
		System.out.println("u= "+u);
		}
	
}
