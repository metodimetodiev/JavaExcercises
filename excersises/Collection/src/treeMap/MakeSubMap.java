package treeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class MakeSubMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		tm.put(15, "black");
		tm.put(20, "white");
		tm.put(35, "red");
		tm.put(44, "green");
		tm.put(80, "blue");
		
		System.out.println(tm);
		sm = tm.subMap(20, 44);
		System.out.println(sm);
		sm = tm.subMap(20, true, 44, true);
		System.out.println(sm);
	}

}
