package arrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();

		al.add("mercedes");
		al.add("audi");
		al.add("bmw");
		al.add("vw");
		al.add("toyota");
		System.out.println("Array before swap");
		for (String string : al) {
			System.out.println(string);
		}
		
		Collections.swap(al, 0, 3);
		System.out.println("Array after swap");
		for (String string : al) {
			System.out.println(string);
		}
	}

}
