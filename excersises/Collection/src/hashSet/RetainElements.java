package hashSet;

import java.util.HashSet;

public class RetainElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();

		hs.add("black");
		hs.add("green");
		hs.add("red");
		hs.add("blue");
		hs.add("yellow");

		System.out.println("HashSet one " + hs);

		HashSet<String> hs2 = new HashSet<String>();

		hs2.add("black");
		hs2.add("white");
		hs2.add("red");
		hs2.add("pink");
		hs2.add("yellow");

		System.out.println("HashSet two " + hs2);
		hs.retainAll(hs2);
		System.out.println("Both HashSets " + hs);
	}

}
