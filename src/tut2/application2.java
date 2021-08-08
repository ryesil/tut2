package tut2;

public class application2 {
	public static void main(String[] args) {
		int myInt= 24;
	if (myInt%2==1) {
		System.out.println("wierd");
	} else if(myInt%2==0 && myInt>1&& myInt<6 ) {
		System.out.println("Not wierd");
	} else if(myInt%2==0 && myInt>=6 && myInt<=20) {
		System.out.println("weird");
	} else if (myInt%2==0 && myInt>20) {
		System.out.println("Not weird");
	}

}
}
