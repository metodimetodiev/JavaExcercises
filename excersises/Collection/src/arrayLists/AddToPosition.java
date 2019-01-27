package arrayLists;

import java.util.ArrayList;

public class AddToPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> as = new ArrayList<String>();
		as.add("audi");
		as.add("bmw");
		as.add("mercedes");
		System.out.println(as);

		as.add(0, "opel");
		as.add(2, "vw");
		System.out.println(as);
	}

}
