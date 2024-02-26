import java.util.*;
public class LearnArrayList {

	public static void main(String[] args) {
		System.out.println("----------Start----------");
		ArrayList al = new ArrayList();
		al.add("3");
		al.add("2");							
		al.add("1");
		al.add("3");
		//al.add(null);
		System.out.println(al);
		Iterator itr = al.iterator();	
		String str = "2";
//		for(Object ll:al)
//		{
//			System.out.println(ll);
//		}
//		
	
		while(itr.hasNext())
		{
			Object item = itr.next();	
			System.out.println(item);
		}
		Collections.sort(al);
		System.out.println(al);
	}

}
