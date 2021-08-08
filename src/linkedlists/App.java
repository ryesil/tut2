package linkedlists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
public static void main(String[] args) {
	
	
	
	
	
	/*ArrayLists manage arrays internally
	 * [0],[1],[2],[3]........
	 */
	ArrayList<Integer> arrayList=new ArrayList<>();
	
	/*
	 * LinkedLists consist of elements where each element has a reference to the previous and next element.
	 * [0]->[1]->[2]->.......
	 * [0]<-.......<-...
	 */
	LinkedList<Integer> linkedList=new LinkedList<>();
	
	
	doTimings("arrayList", arrayList);
	//doTimings("linkedList", linkedList);
	
}
private static void doTimings(String type, List<Integer> list) {

	for(int i=0;i<1E5;i++) {
		list.add(i);
	}
	
    long start=System.currentTimeMillis();
    //add Items at end of list
//	for(int i=0;i<1E5;i++) {
//		list.add(i);
//	}
    //add items elswere in list
    for(int i=0;i<1E5;i++) {
    	list.add(list.size()-100,i);
    }
	long end=System.currentTimeMillis();
	
	System.out.println("Time taken: "+(end-start)+"ms for "+ type);
	
}


}
