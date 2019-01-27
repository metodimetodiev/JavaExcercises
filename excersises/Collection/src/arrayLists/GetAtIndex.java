package arrayLists;

import java.util.ArrayList;

public class GetAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();

		al.add("mercedes");
		al.add("audi");
		al.add("bmw");
		al.add("vw");
		al.add("toyota");

		String str = al.get(0);
		System.out.println(str);
		str = al.get(3);
		System.out.println(str);
	}

}
