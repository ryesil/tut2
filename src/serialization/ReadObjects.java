package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.List;

public class ReadObjects {
public static void main(String[] args) {
	System.out.println("Reading objects...");
	
	try(ObjectInputStream os=new ObjectInputStream(new FileInputStream("test.sir"))){
		
		
		
		Person person =(Person) os.readObject();
//		Person[] people=(Person[])os.readObject();
		System.out.println(person);
//		List<Person> peopleList= (List<Person>) os.readObject();
//		
		
//		for(Person person:peopleList) {
//			System.out.println(person);
//		}
//		
//		int num=os.readInt();
//		for(int i=0;i<num;i++) {
//			Person person=(Person) os.readObject();
//			System.out.println(person);
//		}
		
		
		
	
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
