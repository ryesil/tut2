package tut2;

public class Run {
public static void main(String[] args) {
	
	System.out.println(eben("Zehra", "hr"));
	
	
	
}
public static boolean eben(String mother, String child) {
	
int babyLen=mother.length()-child.length();
if(mother.substring(babyLen).equals(child)) {
	return true;
}else {
return false;	
}
	
}
}
