package hashMap;

import java.util.HashMap;

public class PutAllToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hs = new HashMap<Integer, String>();

		hs.put(1, "black");
		hs.put(2, "green");
		hs.put(3, "red");
		hs.put(4, "brown");
		hs.put(5, "white");

		System.out.println("Values of first hash map " + hs);

		HashMap<Integer, String> hs2 = new HashMap<Integer, String>();

		hs2.put(6, "pink");
		hs2.put(7, "orange");
		hs2.put(8, "blue");

		System.out.println("Values of second hash map " + hs2);

		hs2.putAll(hs);

		System.out.println("After putAll method to second hash map " + hs2);
	}

}
