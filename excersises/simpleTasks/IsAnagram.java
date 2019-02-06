package simpleTasks;

import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter fist word: ");
		String A = sc.nextLine();
		System.out.print("Enter second word: ");
		String B = sc.nextLine();
		System.out.println("Is this anagram: " + anagram(A, B));
	}

	public static boolean anagram(String A, String B) {

		char[] newA = A.toCharArray();
		Arrays.sort(newA);
		char[] newB = B.toCharArray();
		Arrays.sort(newB);
		String sortA = String.valueOf(newA);
		String sortB = String.valueOf(newB);
		return (sortA.equals(sortB)?true:false);
			

	}
}
