package hashSet;

import java.util.HashSet;

public class RemoveAllAndTestIsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();

		hs.add("black");
		hs.add("green");
		hs.add("red");
		hs.add("blue");
		hs.add("yellow");

		System.out.println("Original hash set " + hs + " Is empty? " + hs.isEmpty());
		hs.removeAll(hs);
		System.out.println("After removeAll" + hs + "Is empty? " + hs.isEmpty());
	}

}
