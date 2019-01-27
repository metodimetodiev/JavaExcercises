package arrayLists;

import java.util.ArrayList;

public class CloneArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();

		al.add("mercedes");
		al.add("audi");
		al.add("bmw");
		al.add("vw");
		al.add("toyota");
		System.out.println("Original list" + al);
		ArrayList<String> al2 = (ArrayList<String>) al.clone();
		System.out.println("Cloned list " + al2);
	}

}
