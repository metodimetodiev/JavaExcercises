package priorityQueue;

import java.util.PriorityQueue;

public class GetFirstElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(15);
		pq.add(10);
		pq.add(45);
		pq.add(74);
		pq.add(18);
		pq.add(63);
		pq.add(19);
		pq.add(33);

		System.out.println("Original PQ" + pq);
		System.out.println("First element in PQ " + pq.peek());
		System.out.println("First element in PQ and removing it " + pq.poll());
		System.out.println("After removing first element: " + pq);

	}

}
