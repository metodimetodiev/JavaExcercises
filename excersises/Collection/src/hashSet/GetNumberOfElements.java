package hashSet;

import java.util.HashSet;

public class GetNumberOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();

		hs.add("black");
		hs.add("green");
		hs.add("red");
		hs.add("blue");
		hs.add("yellow");

		System.out.println("HashSet: " + hs + " And the size is " + hs.size());

	}

}
