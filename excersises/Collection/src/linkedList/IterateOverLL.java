package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateOverLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Bayern");
		ll.add("Chelsea");
		ll.add("Liverpool");
		ll.add("Roma");

		Iterator it = ll.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
