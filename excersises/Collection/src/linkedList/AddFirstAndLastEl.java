package linkedList;

import java.util.LinkedList;

public class AddFirstAndLastEl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Bayern");
		ll.add("Chelsea");
		ll.add("Liverpool");
		ll.add("Roma");

		System.out.println("Original l list " + ll);

		ll.addFirst("Barcelona");
		ll.addLast("Real Madrid");
		System.out.println("New l list " + ll);
	}

}
