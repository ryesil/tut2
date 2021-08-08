package serialization;

import java.io.Serializable;

public class Person implements Serializable {

private static final long serialVersionUID = 1613555224584004025L;

private transient int id;
private String name;
private static int count=6;

public Person(int id,String name) {
	this.id=id;
	this.name=name;
	System.out.println("Two-argument constructor");
}


public Person() {
	System.out.println("Default constructor");
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + "] Count is"+count;
	
}



public static void setCount(int count) {
	Person.count=count;
}
public static int getCount() {
	return Person.count;
}



}
