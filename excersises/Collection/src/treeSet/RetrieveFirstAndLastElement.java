package treeSet;

import java.util.TreeSet;

public class RetrieveFirstAndLastElement {

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
		
		System.out.println("Original treeSet " + num);
		System.out.println("Remove the lowest(first) element: " + num.pollFirst());
		System.out.println("Remove the highest(last) element:  " + num.pollLast());
		System.out.println("TreeSet after removing first and last element" + num);
	}

}
