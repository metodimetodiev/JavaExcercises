package linkedList;

import java.util.LinkedList;

public class GetFirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Bayern");
		ll.add("Chelsea");
		ll.add("Liverpool");
		ll.add("Roma");

		System.out.println("Linked list " + ll);

		System.out.println("Fist element " + ll.getFirst());
		System.out.println("Last element " + ll.getLast());
	}

}
