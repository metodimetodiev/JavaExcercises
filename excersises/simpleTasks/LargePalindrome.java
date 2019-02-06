package simpleTasks;

import java.util.Scanner;

public class LargePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a long number: ");
		long N = sc.nextLong();
		getLargestPalindrome(N);
	}

	public static long getLargestPalindrome(long N) {
		String test = null;

		boolean k = false;
		while (k != true) {
			test = String.valueOf(N);
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
				k = true;
			} else {
				N--;
			}
		}
		long L = Long.parseLong(test);
		return L;
	}
}
