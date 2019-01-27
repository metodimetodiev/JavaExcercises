package arrayLists;

import java.util.ArrayList;

public class CheckForContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();

		al.add("mercedes");
		al.add("audi");
		al.add("bmw");
		al.add("vw");
		al.add("toyota");
		
		if(al.contains("mercedes")){
			System.out.println("Mercedes found");
		}else{
			System.out.println("Mercedes not found");
		}
	}

}
