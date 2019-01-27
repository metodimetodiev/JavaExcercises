package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();

		ts.add("black");
		ts.add("green");
		ts.add("red");
		ts.add("blue");
		ts.add("yellow");

		System.out.println("In normal order " + ts);

		Iterator it = ts.descendingIterator();
		System.out.println("In reverse order ");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
