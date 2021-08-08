package passbyvalue;

public class App {

	public static void main(String[] args) {
		App app=new App();
					//Pass by value
		//==============================================

		int value=7;
		System.out.println("1. value is: "+value);
		
		app.show(value);
		
		System.out.println("4. value is: "+ value);
					//Pass by object
		//==============================================
		System.out.println();
		Person person=new Person("Bob");
		System.out.println("1. person is: "+ person);
		app.show(person);
		System.out.println("4. person is: "+person);
		
	}
	public void show(int value) {
		System.out.println(" 2. value is "+value);
		value =8;
		
		System.out.println("3. value is: "+ value);
	}
	
	public void show( Person person) {//this is not a primitive, but class type
		System.out.println("2. person is "+person);
		
		person= new Person("Mike");
		person.setName("Sue");
		System.out.println("3 person: "+person);
	}

}
