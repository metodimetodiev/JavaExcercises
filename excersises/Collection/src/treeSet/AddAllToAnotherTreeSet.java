package treeSet;

import java.util.TreeSet;

public class AddAllToAnotherTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();

		ts.add("black");
		ts.add("green");
		ts.add("red");
		ts.add("blue");
		ts.add("yellow");

		System.out.println("TreeSet1: " + ts);

		TreeSet<String> ts2 = new TreeSet<String>();

		ts2.add("black");
		ts2.add("pink");
		ts2.add("white");
		ts2.add("yellow");

		System.out.println("TreeSet2: " + ts2);

		ts.addAll(ts2);
		System.out.println("TreeSet1 now: " + ts);
	}

}
