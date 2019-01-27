package arrayLists;

import java.util.ArrayList;

public class CompareArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();

		al.add("mercedes");
		al.add("audi");
		al.add("bmw");
		al.add("vw");
		al.add("toyota");
		System.out.println(al);

		ArrayList<String> al2 = new ArrayList<String>();

		al2.add("mercedes");
		al2.add("audi");
		al2.add("citroen");
		al2.add("vw");
		al2.add("volga");
		System.out.println(al2);

		ArrayList<String> al3 = new ArrayList<String>();
		for (String string : al) {
			al3.add(al2.contains(string) ? "Yes" : "No");

		}
		System.out.println(al3);
	}

}
