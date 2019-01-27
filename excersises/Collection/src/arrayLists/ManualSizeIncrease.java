package arrayLists;

import java.util.ArrayList;

public class ManualSizeIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();

		al.add("mercedes");
		al.add("audi");
		al.add("bmw");
		al.add("vw");
		al.add("toyota");
		
		System.out.println("Original array list " + al);
		
		al.ensureCapacity(8);
		
		al.add("lada");
		al.add("volga");
		al.add("maybach");
		
		System.out.println("After size increase" + al);
	}

}
