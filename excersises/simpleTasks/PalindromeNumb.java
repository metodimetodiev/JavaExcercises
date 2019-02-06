package simpleTasks;

import java.util.Scanner;

public class PalindromeNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("Is the number palindrome?: " + isPalindrome(n));
	}

	public static boolean isPalindrome(int n) {
		boolean flag = false;
		String test = String.valueOf(n);
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
