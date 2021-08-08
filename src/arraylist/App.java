package arraylist;

import java.util.ArrayList;
import java.util.List;

public class App {
public static void main(String[] args) {
	//Adding
	List<Integer> numbers=new ArrayList<>();
	numbers.add(10);
	numbers.add(100);
	numbers.add(40);
	
	
	//Retrieve
	System.out.println(numbers.get(0));
	System.out.println("Iteration #1:");
	//indexed for loop iteration
	for(int i=0;i<numbers.size();i++) {
		System.out.println(numbers.get(i));
	}
	
	System.out.println("Iteration #2: ");
	for(Integer value:numbers) {
		System.out.println(value);
	}
	
	
	//Remove items (careful!)
	numbers.remove(numbers.size()-1);
	
	//This very slow
	numbers.remove(0);
	
	System.out.println("\nIteration #2: ");
	
	// List interface...
	List<String> values=new ArrayList<>();
	
	
	
	
}
	
	
}
