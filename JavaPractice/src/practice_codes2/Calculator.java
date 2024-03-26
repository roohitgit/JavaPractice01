package practice_codes2;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		System.out.println("Enter one operator from these: + or - or * or /");
		char ch = sc.next().charAt(0);
		double result = 0;
		
		switch (ch)
		{
			case '+': 
				result = num1+num2;
				System.out.println(num1+"+"+num2+"="+result);
				break;
			case '-': 
				result = num1-num2;
				System.out.println(num1+"-"+num2+"="+result);
				break;
			case '*': 
				result = num1*num2;
				System.out.println(num1+"*"+num2+"="+result);
				break;
			case '/': 
				result = num1/num2;
				System.out.println(num1+"/"+num2+"="+result);
				break;
				
			default: System.out.println("You Entered the wrong operator");
		}
		

	}

}
