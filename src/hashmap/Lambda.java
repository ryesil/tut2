package hashmap;

import java.lang.reflect.Executable;

interface Exacutable{
	int execute(int a, int b);
}
interface StringExecutable{
	int execute(String a);
}

class Runner{
	public void run(Exacutable e) {
		System.out.println("Executing code block...");
		int value =e.execute(12,13);
		System.out.println("Return value is: "+ value);
	}
	public void run(StringExecutable e){
		System.out.println("Executing code block...");
		int value= e.execute("Hello");
		System.out.println("Return value is: "+value);
	}
}
/*Valid lambda Expressions
 * (int a)->{
 * System.out.println("Hello there");
 * return 7+a;
 */
/*
 * (a)-> {
 * System.out.println("Hello there");
 * return 7+a;
 */
/*
 * a-> {
 * System.out.println("Hello there");
 * return 7+a;
 * }
 */
/*
 * (a,b)->{
 * System.out.println("Hello there");
 * return 7+a;
 * }
 * Functional interface=> interface with only one method
 * Anonymous classes
 * We can use local variables in lambda expression as long as they are effectively finalor actually final.
 * lambda expression doesn't have any scope;
 * lambda expression is an object.
 * 
 */
public class Lambda {

	public static void main(String[] args) {
		int c=100;// effectively final
		// mustn't do this c=8;
		int d=77;
		Runner runner=new Runner();
		
//		runner.run(new Executable() {
//			public void execute() {
//				System.out.println("Hello there...");
//			}
//		});
		
System.out.println("===================================");
runner.run((a,b)->{

	System.out.println("Hello there");
	// cannot do this; no new scope. int d=99;
	return a+b+c;

}
	);

//Executable ex=(a,b)-> {
//System.out.println("hello there.");
//return a+b+c;
//};




	}

}
