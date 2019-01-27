package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArraySublist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();

		al.add("mercedes");
		al.add("audi");
		al.add("bmw");
		al.add("vw");
		al.add("toyota");
		
		System.out.println(al);
		List<String> al2 = al.subList(0, 2);
		
		System.out.println("Sublist of ArrayList" + al2);
		
	}

}
