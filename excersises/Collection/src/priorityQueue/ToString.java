package priorityQueue;

import java.util.PriorityQueue;

public class ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("black");
		pq.add("white");
		pq.add("red");
		pq.add("green");
		pq.add("brown");
		pq.add("yellow");
		
		System.out.println("Original PQ: " + pq);
		
		String str = pq.toString();
		System.out.println("String representation:  " + pq);
		
	}

}
