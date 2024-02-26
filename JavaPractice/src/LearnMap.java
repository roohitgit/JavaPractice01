import java.util.HashMap;
import java.util.Map;
public class LearnMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Hello");
		hm.put(2, "Helloo");
		hm.put(3, "Hellooo");
		hm.put(4, "Helloooo");
		hm.put(5, "Hellooooo");
		System.out.println(hm);
		    
		for(Map.Entry key: hm.entrySet())
		System.out.println(key.getKey()+" "+key.getValue());
		hm.remove(5);
		System.out.println(hm);	
		hm.replace(4, "Hiiii");
		System.out.println(hm);	
		Boolean isKey = hm.containsKey(1);
		Boolean isValue = hm.containsValue("Helloooo");
		
		System.out.println(isKey);	
		System.out.println(isValue);	
		hm.clear();
		System.out.println(hm);
		   
		
	}

}
