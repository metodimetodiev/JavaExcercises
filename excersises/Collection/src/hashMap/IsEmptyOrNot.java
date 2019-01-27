package hashMap;

import java.util.HashMap;

public class IsEmptyOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hs = new HashMap<Integer, String>();

		hs.put(1, "black");
		hs.put(2, "green");
		hs.put(3, "red");
		hs.put(4, "brown");
		hs.put(5, "white");

		System.out.println("Is empty?: " + hs.isEmpty());

		hs.clear();

		System.out.println("Now is empty?: " + hs.isEmpty());
	}

}
