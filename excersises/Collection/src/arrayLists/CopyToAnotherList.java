package arrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class CopyToAnotherList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();

		al.add("mercedes");
		al.add("audi");
		al.add("bmw");
		al.add("vw");
		al.add("toyota");
		System.out.println("List 1 " + al);
		ArrayList<String> al2 = new ArrayList<>();

		al2.add("ONE");
		al2.add("TWO");
		al2.add("THREE");
		al2.add("FOUR");
		al2.add("FIVE");
		System.out.println("List 2 " + al2);
		Collections.copy(al2, al);
		System.out.println("List 2 after copying" + al2);
	}

}
