package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class FindNumLessThan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> num = new TreeSet<Integer>();
		TreeSet<Integer> head = new TreeSet<Integer>();
		
		num.add(1);
		num.add(2);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(9);
		num.add(12);
		
		head = (TreeSet<Integer>) num.headSet(7);
		
		Iterator it;
		it = head.iterator();
		
		System.out.println("Tree set data less than 7");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
