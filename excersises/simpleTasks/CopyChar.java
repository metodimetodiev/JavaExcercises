package simpleTasks;

import java.util.Scanner;


public class CopyChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Test";
		int n = 5;

		copyChars(text, n);
	}

	public static String copyChars(String text, int n) {
		StringBuilder copy = new StringBuilder(text.length() * n);
		for (int i = 0; i < n; i++) {
			copy.append(text);
		}
		return copy.toString();
	}
}
