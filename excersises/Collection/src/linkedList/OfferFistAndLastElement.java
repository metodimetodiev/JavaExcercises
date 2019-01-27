package linkedList;

import java.util.LinkedList;

public class OfferFistAndLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Bayern");
		ll.add("Chelsea");
		ll.add("Liverpool");
		ll.add("Roma");
		
		System.out.println("Original linked list " + ll);
		
		ll.offerFirst("Lazio");
		ll.offerLast("Milan");
		
		System.out.println("New linked list" + ll);
	}

}
