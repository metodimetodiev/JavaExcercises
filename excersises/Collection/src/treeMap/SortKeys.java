package treeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class SortKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> tm = new TreeMap<String, String>(new sort_key());
		
		tm.put("C3", "red");
		tm.put("C2", "white");
		tm.put("C1", "black");
		tm.put("C5", "blue");
		tm.put("C4", "green");
		
		System.out.println(tm);
	}

}

class sort_key implements Comparator<String>{
    @Override
   public int compare(String str1, String str2) {
       return str1.compareTo(str2);
   }
    
}