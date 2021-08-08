package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class AppDecidingWhichCollectionToUse {
public static void main(String[] args) {
	/*
	 * Consider:
	 * what you need the collection to do
	 * are you using the fastest collection for your purposes
	 * (think about insetion/deletion, retrieval and traversal
	 * 
	 */
	//////Lists//////
	/*
	 * Store lists of objects
	 * Duplicates are allowed
	 * objects remain in order
	 * elements are indexed via an integer
	 * cf. shopping list
	 * checking for particular item in list is slow
	 * looking an item up by index is fast
	 * Iterating through lists is relatively fast
	 * Note: you can sort lists if you want to
	 * If you only add or remove items at end of list, use ArrayList.
	 */
		List<String> list1=new ArrayList<>();
		//Remove or add items elsewhere in the list?
		List<String> list2=new LinkedList<String>();
		//////Sets////////
		/*
		 * Only store unique values
		 * great for removing duplicates
		 * Not indexed, unlike lists
		 * very fast to check if a particular object exists
		 * If you want to use your own projects, you must implement hasCode() and equals().
		 * Order is unimportant and OK if it changes?
		 * HashSet is not ordered.
		 */
		Set<String> set1=new HashSet<String>();
		//Sorted in natural order? use TreeSet.
		//(1,2,3,,,,,,,a,b,c,,,,,,etc)
		Set<String> set2=new TreeSet<>();
		//ELements remain in order they were added
		Set<String> set3=new LinkedHashSet<String>();
		/////////////////////////////Maps////////
		//(Key, value) pairs.
		//Like lookup tables.
		// Retrieving a value by key is fast
		//Iterating over maps is slow
		// If you want to use your own object as keys, you must implement hasCode() and equals();
		
		//Keys not in any particular order, and order liable to change.
		Map<String, String> map1=new HashMap<>();
		
		//Keys sorted in natural order
		Map<String, String> map2=new TreeMap<>();
		//There are also the sortedSet and SortedMap interfaces.
		
		
		
		
	
	
}
}
