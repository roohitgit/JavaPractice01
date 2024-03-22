package practice_codes2;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class FindMaxDifferenceBetweenArray {

	public static void main(String[] args) {
		
		int a[] = {2,100,5,120};
		int result= 0,max=a[0],min=a[0] ;
		
		for(int i=0;i<a.length;i++)
		{
				if(a[i]>max)
				{
					max=a[i];
				}
		}
		
		for(int i=0;i<a.length;i++)
		{
				if(a[i]<min)
				{
					min=a[i];
				}
		}
	
	System.out.println("maximum number is: "+max);
	System.out.println("minimum number is: "+min);
	System.out.println("Maximum difference is: "+(result=max-min));
		
	
		
	}

}
