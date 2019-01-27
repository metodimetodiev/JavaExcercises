package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class IterateOverHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();

		hs.add("black");
		hs.add("green");
		hs.add("red");
		hs.add("blue");
		hs.add("yellow");

		Iterator<String> it = hs.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
