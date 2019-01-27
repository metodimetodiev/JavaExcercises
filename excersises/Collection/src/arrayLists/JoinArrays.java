package arrayLists;

import java.util.ArrayList;

public class JoinArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();

		al.add("mercedes");
		al.add("audi");
		al.add("bmw");
		al.add("vw");
		al.add("toyota");
		System.out.println("First array " + al);
		ArrayList<String> al2 = new ArrayList<String>();

		al2.add("opel");
		al2.add("ford");
		al2.add("lada");
		al2.add("volga");
		System.out.println("Second array " + al2);

		ArrayList<String> al3 = new ArrayList<String>();
		al3.addAll(al);
		al3.addAll(al2);
		System.out.println("New array "+ al3);

	}

}
