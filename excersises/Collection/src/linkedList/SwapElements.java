package linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class SwapElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Bayern");
		ll.add("Chelsea");
		ll.add("Liverpool");
		ll.add("Roma");

		System.out.println("Original l list " + ll);

		Collections.swap(ll, 0, 2);
		System.out.println("New l list " + ll);
	}

}
