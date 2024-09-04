package practice_codes2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class FiveDifferentWaysToIteratorHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> fruitMap = new HashMap<>();
		fruitMap.put(1, "Mango");
		fruitMap.put(2, "Apple");
		fruitMap.put(3, "Banana");
		fruitMap.put(4, "Orange");
		fruitMap.put(5, "Grapes");
		keySetIteration(fruitMap);  //Using KeySet()
		IteratorMap(fruitMap);      //Using Iterator
		entrySet(fruitMap);			//Using EntrySet()
		streams(fruitMap);			//Using streams (java 8)
		//foreachLoop(fruitMap);	//Using foreach method (java 8)
		
	}

//	private static void foreachLoop(Map<Integer, String> fruitMap) {
//		fruitMap.forEach((key,value)->
//		(
//			System.out.print("key=",key);
//			System.out.print("Value=",+value);
//		);
//		
//	}

	private static void streams(HashMap<Integer, String> fruitMap) {				//Using streams (java 8)s
		fruitMap.entrySet().stream().forEach(e->
		System.out.println("key is "+e.getKey()+" and value is "+e.getValue())
				);
		System.out.println("--------------------------------------------");
	}

	private static void entrySet(HashMap<Integer, String> fruitMap) {   			//entry set
		
		for (HashMap.Entry<Integer, String> entry :fruitMap.entrySet())
		{
			System.out.println("key is "+entry.getKey()+" and value is "+entry.getValue());
		}
		System.out.println("--------------------------------------------");
	}

	private static void keySetIteration(HashMap<Integer, String> fruitMap) {        //Using KeySet
	
		
		for (Integer fruitId : fruitMap.keySet())
		{
			System.out.print("Key is "+fruitId+" and");
			System.out.print(" Value is "+fruitMap.get(fruitId));
			System.out.println("");
		}
		System.out.println("--------------------------------------------");
	}
	
	private static void IteratorMap(HashMap<Integer, String> fruitMap)              //Using Iterator
	{
		
		Iterator<HashMap.Entry<Integer,String>> iterator = fruitMap.entrySet().iterator();
		while (iterator.hasNext())
		{
			HashMap.Entry<Integer,String> entry = iterator.next();
			System.out.println("key is "+entry.getKey()+" and value is "+entry.getValue());
		}
		System.out.println("--------------------------------------------");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
