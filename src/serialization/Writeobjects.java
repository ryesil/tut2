package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Writeobjects {
public static void main(String[] args) {
	System.out.println("Writing objects...");
	
//	Person people[]= {new Person(1,"Sue"), new Person(99,"Mike"),new Person(7,"Bob")};
//	List<Person> peopleList=new ArrayList<>();
//	Collections.addAll(peopleList, people);
//	
	
	
	try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("test.sir"))){
		
		Person person=new Person(7,"Bob");
		os.writeObject(person);
		Person.setCount(88);
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		
	
	
}
