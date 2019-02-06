	package simpleTasks;

import java.util.Scanner;

public class SumStrNumbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text: ");
		String text = sc.nextLine();
		sumOfNumbers(text);
	}

	public static int sumOfNumbers(String text) {
		int sum = 0;

		for (int i = 0; i < text.length(); i++) {
			if (Character.isDigit(text.charAt(i))) {
				sum = sum + Character.getNumericValue(text.charAt(i));
			}
		}
		return sum;

	}
}
