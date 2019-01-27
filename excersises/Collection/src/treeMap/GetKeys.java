package treeMap;

import java.util.Set;
import java.util.TreeMap;

public class GetKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> tm = new TreeMap<String, String>();
		
		tm.put("C1", "black");
		tm.put("C2", "white");
		tm.put("C3", "red");
		tm.put("C4", "green");
		tm.put("C5", "blue");
		
		Set<String> keys = tm.keySet();
		
		for (String string : keys) {
			System.out.println(string);
		}
	}

}
