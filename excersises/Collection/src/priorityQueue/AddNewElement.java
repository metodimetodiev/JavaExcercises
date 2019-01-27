package priorityQueue;

import java.util.PriorityQueue;

public class AddNewElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("black");
		pq.add("white");
		pq.add("red");
		
		System.out.println("Original PQ " + pq);
		
		pq.offer("green");
		System.out.println("After adding green " + pq);
	}

}
