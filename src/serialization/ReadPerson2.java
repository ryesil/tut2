package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadPerson2 {

	public static void main(String[] args) {
	try(FileInputStream fs=new FileInputStream("Person2.bin")){
		ObjectInputStream os=new ObjectInputStream(fs);
		
		Person2 person1= (Person2)os.readObject();
		Person2 person2=(Person2) os.readObject();
		os.close();
		System.out.println(person1);
		System.out.println(person2);
		
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
