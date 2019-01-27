package arrayLists;

import java.util.ArrayList;

public class PrintByIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();

		al.add("mercedes");
		al.add("audi");
		al.add("bmw");
		al.add("vw");
		al.add("toyota");

		System.out.println("Array: " + al);
		System.out.println("Print with indexes");

		int n = al.size();
		for (int i = 0; i < n; i++) {
			System.out.println(al.get(i));
		}

	}

}
