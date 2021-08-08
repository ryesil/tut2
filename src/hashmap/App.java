package hashmap;

import java.util.HashMap;
import java.util.Map;


public class App {
public static void main(String[] args) {
	

	
	HashMap<Integer, String> map= new HashMap<Integer,String>();

	map.put(5, "Five");
	map.put(8, "Eight");	
	map.put(6, "Six");
	map.put(4, "Four");
	map.put(2, "Two");
	map.put(6, "Hello");// Override the first;
	

	String text=map.get(1);
	System.out.println(text);
	
	for(Map.Entry<Integer, String> entry: map.entrySet()) {
		int key=entry.getKey();
		String value=entry.getValue();
		System.out.println(key+ ": "+value);
		
	}
	
}	
}
