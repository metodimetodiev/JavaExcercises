package hashSet;

import java.util.HashSet;

public class ToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();

		hs.add("black");
		hs.add("green");
		hs.add("red");
		hs.add("blue");
		hs.add("yellow");

		System.out.println("HashSet " + hs);

		String[] array = new String[hs.size()];
		hs.toArray(array);

		System.out.println("Array elements ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
