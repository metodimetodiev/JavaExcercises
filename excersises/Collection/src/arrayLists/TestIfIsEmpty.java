package arrayLists;

import java.util.ArrayList;

public class TestIfIsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();

		al.add("mercedes");
		al.add("audi");
		al.add("bmw");
		al.add("vw");
		al.add("toyota");
		System.out.println("Original Array list" + al);
		System.out.println("Check if is empty " + al.isEmpty());
		al.removeAll(al);
		System.out.println("Removing all files" + al);
		System.out.println("Check if is empty " + al.isEmpty());
	}

}
