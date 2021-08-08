package hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Persone implements Comparable<Persone> {
	private String name;
	
public Persone(String name) {
	this.name=name;
}

public String toString() {
	return name;
}




@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Persone other = (Persone) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

@Override
public int compareTo(Persone o) {
	int len1=name.length();
	int len2=o.name.length();
	if(len1>len2) {
		return 1;
	}else if(len1<len2) {
		return -1;
	}
	return name.compareTo(o.name);
}





	
}


public class App5NaturalOrdering {
	/**************************************************************main*/
public static void main(String[] args) {
	List<Persone> list=new ArrayList<>();
	
	SortedSet<Persone> set=new TreeSet<>();
addElements(list);
Collections.sort(list);
addElements(set);
showElements(list);
showElements(set);

}

private static void addElements(Collection<Persone> col) {
	col.add(new Persone("Joe"));
	col.add(new Persone("Sue"));
	col.add(new Persone("Juliet"));
	col.add(new Persone("Clare"));
	col.add(new Persone("Mike"));
	//col.add(new Persone("Mike"));
	
}
private static void showElements(Collection<Persone> col) {
	for(Persone w:col) {
		System.out.println(w);
	}
	
	
}
	
}
