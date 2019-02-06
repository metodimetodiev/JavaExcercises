package simpleTasks;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word to test: ");
		String test = sc.nextLine();
		System.out.println("Is this a palindrome? : " + isPalindrome(test));
	}

	public static boolean isPalindrome(String test) {
		boolean flag = false;
		char[] rev = test.toCharArray();
		int i = 0;
		int j = rev.length - 1;
		while (i < j) {
			char temp = rev[i];
			rev[i] = rev[j];
			rev[j] = temp;
			i++;
			j--;
		}
		String reversed = new String(rev);
		if (test.equals(reversed)) {
			flag = true;

		}
		return flag;
	}
}
