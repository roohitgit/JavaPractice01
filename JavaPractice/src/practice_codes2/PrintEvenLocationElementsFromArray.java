package practice_codes2;

public class PrintEvenLocationElementsFromArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			System.out.println("Index is "+i+" & Value is "+a[i]);
		
		}
		
	}

}
