package hashmap;

import java.util.Iterator;
import java.util.LinkedList;



public class Iterables {
public static void main(String[] args) {
	
	
	
LinkedList<String> animals=new LinkedList<>();
animals.add("fox");
animals.add("cat");
animals.add("dog");
animals.add("rabbit");
System.out.println(animals);

Iterator<String> it=animals.iterator();
String st=it.next();
System.out.println(st);
st=it.next();
System.out.println(st);
System.out.println("*********************************************************************");
while(it.hasNext()) {//Looping using iterator.
	String value=it.next();// You can use it to remove items. 
	System.out.println(value);
	if(value.equals("cat")) {
		it.remove();
	}
}

//Modern iteration
for(String animal:animals) {//forEach cannot remove
	System.out.println(animal);
	if(animal=="cat") {// uses iterator behind the scene.
		animals.remove(animal);
	}


	
	
}
System.out.println(animals);	
	
	
}
}
