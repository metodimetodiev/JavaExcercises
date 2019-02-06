package simpleTasks;

import java.util.Scanner;

public class KthFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n=");
		int n = sc.nextInt();
		System.out.print("Input k=");
		int k = sc.nextInt();
		System.out.println("Kth factorial: " + k + " of " + n + " is: " + kthFac(k, n));
	}

	public static long kthFac(int k, int n) {
		long fact = 1;
		for (int i = k; i > 0; i--) {
			fact *= i;
		}
		return fact;
	}

}
