package treeMap;

import java.util.TreeMap;

public class NavigableKeySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(15, "black");
		tm.put(20, "white");
		tm.put(35, "red");
		tm.put(44, "green");
		tm.put(80, "blue");
		
		System.out.println(tm);
		System.out.println(tm.navigableKeySet());
	}

}
