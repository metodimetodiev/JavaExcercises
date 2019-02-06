package simpleTasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter word: ");
		String word = sc.nextLine();
		System.out.print("Enter text: ");
		String text = sc.nextLine();
		mentions(word, text);
	}

	public static int mentions(String word, String text) {
		Pattern pattern = Pattern.compile(word);
		Matcher matcher = pattern.matcher(text);
		int count = 0;
		while (matcher.find()) {
			count++;
		}

		return count;

	}
}
