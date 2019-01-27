package hashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ToTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();

		hs.add("black");
		hs.add("green");
		hs.add("red");
		hs.add("blue");
		hs.add("yellow");
		System.out.println("HashSet elements " + hs);
		
		Set<String> ts = new TreeSet<String>(hs);
		System.out.println("TreeSet elements");
		for(String el : ts){
			System.out.println(el);
		}
	}

}
