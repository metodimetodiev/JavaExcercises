package linkedList;

import java.util.LinkedList;

public class RemoveFirstLastSpecifiedElRemAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Bayern");
		ll.add("Chelsea");
		ll.add("Liverpool");
		ll.add("Roma");
		ll.add("Milan");
		ll.add("Barcelona");
		ll.add("Lazio");
		
		System.out.println("Original l list" + ll);
		
		ll.removeFirst();
		ll.removeLast();
		ll.remove(3);
		
		System.out.println("New l list " + ll);
		
		ll.removeAll(ll);
		
		System.out.println("After removeAll " + ll + " Checking if is it empty - true or false: " +ll.isEmpty());
	} 

}
