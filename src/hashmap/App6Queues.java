package hashmap;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App6Queues {

	public static void main(String[] args) {
	//front(head) <-oooooooooooooooooooooooooooooooo<-End(tail) queue of people FIFO( first in, first out)
		
	Queue<Integer> q1=new ArrayBlockingQueue<>(3);
	q1.add(10);
	q1.add(20);
	q1.add(30);
	System.out.println("Head of the queue is: "+ q1.element());
	
	try {
		q1.add(40);
		
	} catch(IllegalStateException e) {
		System.out.println("You cannot add more than "+ q1.size()+" items");
	}
	
	for(Integer value: q1) {
		System.out.println("Queue value: "+ value);
	}
	
	// removes the head of the queue and returns it
System.out.println("Removed from the queue: "+ q1.remove());
System.out.println("Removed from the queue: "+ q1.remove());
System.out.println("Removed from the queue: "+ q1.remove());
try {
System.out.println("Removed from the queue: "+ q1.remove());
} catch(Exception e) {
	System.out.println("There is no element to be removed in the queue...");
}
///////////////////////////////////////////////////////////////////////////////////////
Queue<Integer> q2=new ArrayBlockingQueue<>(2);

q2.offer(10);
q2.offer(20);
q2.offer(30);// returns false 
if(q2.offer(30)==false) {
	System.out.println("Offer failed to add third item.");
}

for(Integer value:q2) {
	System.out.println("Queue value: "+value);
}
System.out.println("queue 2 poll: "+q2.poll());
System.out.println("queue 2 poll: "+q2.poll());
System.out.println("queue 2 poll: "+q2.poll()); //returns nall
System.out.println("Q2 peek: "+q2.peek());// since there is no head of the queue so returns null.

}

}
