package treeSet;

import java.util.TreeSet;

public class GetGreaterAndLessOrEqualElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> num = new TreeSet<Integer>();

		num.add(15);
		num.add(1);
		num.add(77);
		num.add(22);
		num.add(33);
		num.add(41);
		num.add(90);
		num.add(5);

		System.out.println("Greater or equal to  15: " + num.ceiling(15));
		System.out.println("Greater or equal to  75: " + num.ceiling(75));
		System.out.println("Less or equal to 90: " + num.floor(90));
		System.out.println("Less or equal to 35: " + num.floor(35));
		System.out.println("Strictly greater than 35: " + num.higher(35));
		System.out.println("Strictly greater than 1: " + num.higher(1));
		System.out.println("Strictly less than 77: " + num.lower(77));
		System.out.println("Strictly less than 30: " + num.lower(30));

	}

}
