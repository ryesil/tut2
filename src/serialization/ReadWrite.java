package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ReadWrite {

	public static void main(String[] args) {
		Person2 Ramazan=new Person2("Ramazan",12);
		Person2 Zuleyha=new Person2("Zuleyha",13);
		
		
		
		try(FileOutputStream fs=new FileOutputStream("Person2.bin")){
			ObjectOutputStream os=new ObjectOutputStream(fs);
			os.writeObject(Ramazan);
			os.writeObject(Zuleyha);
			
			
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
