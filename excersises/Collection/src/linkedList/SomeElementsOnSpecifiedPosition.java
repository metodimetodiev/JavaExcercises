package linkedList;

import java.util.LinkedList;

public class SomeElementsOnSpecifiedPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Bayern");
		ll.add("Chelsea");
		ll.add("Liverpool");
		ll.add("Roma");
		
		System.out.println("Original l list " + ll);
		
		LinkedList<String > ll2 = new LinkedList<String>();
		
		ll2.add("Barcelona");
		ll2.add("Real Madrid");
		
		ll.addAll(2, ll2);
		
		System.out.println("New l list "+ ll);
	}

}
