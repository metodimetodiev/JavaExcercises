package arrayLists;

import java.util.ArrayList;

public class UpdateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();

		al.add("mercedes");
		al.add("audi");
		al.add("bmw");
		al.add("vw");
		al.add("toyota");

		System.out.println(al);

		al.set(0, "volga");
		al.set(2, "honda");

		System.out.println(al);
	}

}
