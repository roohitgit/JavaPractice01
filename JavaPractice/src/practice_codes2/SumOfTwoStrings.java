package practice_codes2;

public class SumOfTwoStrings {

	public static void main(String[] args) {
		
		String s1 = "111";
		String s2 = "222";
		
		int sum = Integer.parseInt(s1)+Integer.parseInt(s2);
		
		System.out.println(sum);  //this is an integer
		System.out.println(String.valueOf(sum)); //this is a string
	}

}
