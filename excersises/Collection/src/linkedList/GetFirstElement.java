package linkedList;

import java.util.LinkedList;

public class GetFirstElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Bayern");
		ll.add("Chelsea");
		ll.add("Liverpool");
		ll.add("Roma");

		System.out.println("Original l list" + ll);

		// get first and remove
		System.out.println("First element " + ll.pop());
		// get first and not remove
		System.out.println("Now new first element is " + ll.peekFirst());

	}

}
