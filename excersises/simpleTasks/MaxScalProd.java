package simpleTasks;

import java.util.Scanner;

public class MaxScalProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers of two vectors: ");
		int n = sc.nextInt();
		System.out.print("Enter the numbers of first array: ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
		System.out.print("Enter the numbers of second array: ");
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();

		}
		System.out.println("Maximal scalar product is: " + maximalScalarSum(a, b, n));
	}

	public static long maximalScalarSum(int[] a, int[] b, int n) {
		long max = 1;
		for (int i = 0; i < n; i++) {
			max *= a[i] * b[i];
		}
		return max;
	}
}
