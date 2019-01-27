import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Avtomate {
	static List<String> lang = new ArrayList<String>();

	public static void firstDecl() {
		lang.add("a");
		lang.add("c");
	}

	public static void findNext() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: 'a' or 'b':  ");
		char c = sc.next().charAt(0);
		if (c == 'a') {
			lang.add("a");
		} else {
			lang.add("b");
		}

	}

	public static void endOfAutomate() {
		while (lang.size() < 8) {
			int random = (int) (Math.random() * 2 + 1);
			if (random == 1) {
				lang.add("a");
			} else {
				lang.add("c");
			}
		}
	}

	public static void printLang() {
		for (int i = 0; i < lang.size(); i++) {
			System.out.print(lang.get(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstDecl();
		findNext();
		endOfAutomate();
		printLang();
	}
}
