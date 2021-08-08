package hashmap;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App3Sets {
public static void main(String[] args) {
	
	
	//HashSet doesn't retain order.
	//Set<String> set1=new HashSet<>();
	//LinkedHashSet remembers the order you addded items in
	//Set<String> set1=new LinkedHashSet<>();
	// TreeSet retains the natural order.
	Set<String> set1=new TreeSet<>();
	if(set1.isEmpty()) {
		System.out.println("Set is empty at start");
	}
	set1.add("dog");
	set1.add("cat");
	set1.add("mouse");
	set1.add("snake");
	set1.add("bear");
	//Adding duplicate items does nothing
	set1.add("mouse");
	System.out.println(set1);
	////////////////Iteration//////////////////////
	
	for(String element:set1) {
		System.out.println(element);
	}
	
	///////Does set contain given item?//////////
	if(set1.contains("aadvark"));
	System.out.println("Contains aardvark");
	if(set1.contains("cat"));
	System.out.println("contains cat");
	Set<String> set2=new TreeSet<>();
	set2.add("dog");
	set2.add("cat");
	set2.add("giraffe");
	set2.add("monkey");
	set2.add("ant");
///////////////////Intersection/////////////
	Set<String> intersection=new HashSet<>(set1);
	System.out.println(intersection);
	
	intersection.retainAll(set2);
	System.out.println(intersection);
/////////Difference/////////////
	Set<String> difference=new HashSet<>(set2);
	
	difference.removeAll(set1);
	
	
	System.out.println(difference);
	
	
}
	
	




	
}
