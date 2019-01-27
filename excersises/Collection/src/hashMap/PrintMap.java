package hashMap;

import java.util.HashMap;
import java.util.Map;

public class PrintMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hs = new HashMap<Integer, String>();

		hs.put(1, "black");
		hs.put(2, "green");
		hs.put(3, "red");
		hs.put(4, "brown");
		hs.put(5, "white");

		for (Map.Entry x : hs.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
		System.out.println("The size of the hash map is:  " + hs.size());
	}

}
