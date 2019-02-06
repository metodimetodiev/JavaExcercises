package simpleTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ReverseEachWord {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter a string: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		reverseEveryWord(input);
	}

	public static String reverseEveryWord(String input) {
		String[] words = input.split(" ");
		StringBuilder rev = new StringBuilder();

		for (String temp : words) {

			for (int i = words.length; i >= 0; i--) {
				rev.append(temp.charAt(i));
			}
			rev.append(" ");
		}
		return rev.toString();
	}
}
