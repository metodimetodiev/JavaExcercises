package linkedList;

import java.util.LinkedList;

public class PrintWithPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Bayern");
		ll.add("Chelsea");
		ll.add("Liverpool");
		ll.add("Roma");
		ll.add("Barcelona");
		ll.add("Milan");

		for (int i = 0; i < ll.size(); i++) {
			System.out.println("The position is of " + ll.get(i) + " is " + i);
		}
	}

}
