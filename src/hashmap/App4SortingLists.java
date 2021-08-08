package hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//You want to sort your list in something other than natural order
//To do that, you need to make a class that implements "Comparator" interface.
// if you want to order the animals in animals list according to their String length...
class StringLengthComparator extends App2 implements Comparator<String> {

	
	
	@Override
	public int compare(String s1, String s2) {
	int len1=s1.length();
	int len2=s2.length();
	if(len1>len2) {
		return 1;
	}else if(len1<len2) {
		return -1;
	}
	return 0;
}	
}
class Persona{
	private int id;
	private String name;
	
	public Persona(int id, String name) {
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	public String toString() {
		return name;
	}
	
	
}



public class App4SortingLists {
	public static void main(String[] args) {
		////////////////////////////////Sorting strings////////////////////////////////////
	List<String> animals=new ArrayList<>();
		Collections.addAll(animals, new String[] {"cat","elephant","tiger","lion","snake","mongoose"});
		//Collections.sort(animals,new StringLengthComparator());		
		//Collections.sort(animals);
		//Collections.sort(animals,new App4SortingLists().new AlphabeticalComparator());
		Collections.sort(animals,new App4SortingLists().new ReverseAlphabeticalComparator());
		for(String w:animals) {
			System.out.println(w);
		}
		////////////////////////////////Sorting Integers////////////////////////////////////
		
		List<Integer> numbers=new ArrayList<>();
		Collections.addAll(numbers, new Integer[] {3,1,36,73,40});
		//Collections.sort(numbers);
		Collections.sort(numbers,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return -o1.compareTo(o2); //this is the easiest way to sort numbers.
			}
			
		});
		
		
		for(int i:numbers) {
			System.out.println(i);
		}
		
////////////////////////////////Sorting Integers////////////////////////////////////
List<Persona> people=new ArrayList<>();

people.add(new Persona(1,"Joe"));
people.add(new Persona(2,"Sue"));
people.add(new Persona(3,"Bob"));
people.add(new Persona(4,"Clare"));
////sort in order of id
Collections.sort(people,new Comparator<Persona>() {

	@Override
	public int compare(Persona o1, Persona o2) {
	if(o1.getId()>o2.getId()) {
		return 1;
	}else if( o1.getId()<o2.getId()) {
		return -1;
	}
		return 0;
	
	
}}); // sort doesn't work because Person class didn't implement Comparable interface.
		
////sort in order of Names
Collections.sort(people,new Comparator<Persona>() {

@Override
public int compare(Persona o1, Persona o2) {
	return o1.getName().compareTo(o2.getName());
}});
	for(Persona person:people) {
		System.out.println(person);
	}
		
		
	}
	class AlphabeticalComparator implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {
			
			return s1.compareTo(s2);
		}

	}
	class ReverseAlphabeticalComparator implements Comparator<String>{

		@Override
		public int compare(String s1, String s2) {
			// TODO Auto-generated method stub
			return -s1.compareTo(s2);
		}

	}
	
}
	
	
	


	
	
	
	
	


