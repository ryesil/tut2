package tut2;

class Ev {
	int room;
	String type;
	int size;
	
	public void helloWorld(String entry) {
		System.out.println("Hi, Welcome to your new home "+ entry);
	}
	public int roomCal(int size) {
		int rooms=Math.round(size/640);
		return rooms;
	}
	
}

public class Beb {
	public static void main(String[] args) {
		Ev myHouse = new Ev();
		myHouse.size=2400;
		myHouse.type="Town House";
		int roomss= myHouse.roomCal(5000);
		
		System.out.println(roomss);
		myHouse.helloWorld("Ahmet");
		
		
	}

}
