
public class LearnString {

	public static void main(String[] args) {
		String s = "Learning String ------------";
		String str = "Rohit Avinash Badole";
		String str2 = "Rohit Avinash Badole";
		
		char ch = str.charAt(3);
		int i = str.length();
		String substring = str.substring(3);
		String substring2 = str.substring(3,5);
		Boolean boo = str.contains("hit");
		Boolean boo2 = str.equals(str2);
		Boolean boo3 = str.isEmpty();
		String cont = str.concat(s);
		String repl = str.replace("hit", "Hiit");
		String inter = str.intern();
		int ip = str.indexOf('t');
		String small = str.toLowerCase();
		String capital = str.toUpperCase();
	
		System.out.println(capital);
		
		

	}

}
