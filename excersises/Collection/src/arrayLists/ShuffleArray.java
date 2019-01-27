package arrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();

		al.add("mercedes");
		al.add("audi");
		al.add("bmw");
		al.add("vw");
		al.add("toyota");
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println("After shuffling: " + al);
	}

}
