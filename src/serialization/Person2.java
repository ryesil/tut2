package serialization;

import java.io.Serializable;
import java.time.LocalTime;

public class Person2 implements Serializable{

	private static final long serialVersionUID = 4958340483849321872L;
private int id;
private String name;
private LocalTime dateHired;

Person2(String name, int id){
	this.name=name;
	this.id=id;
	this.dateHired=LocalTime.now();
}

@Override
public String toString() {
	return "Person2 [id=" + id + ", name=" + name + ", dateHired=" + dateHired + "]";
}

}
