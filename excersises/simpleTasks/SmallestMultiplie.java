package simpleTasks;

import java.util.Arrays;

public class SmallestMultiplie {
	public static void main(String[] args) {

		int N = 6;
		System.out.println("The smallest multiplie is: " + getSmallestMultiple(N));
	}

	public static long getSmallestMultiple(int N) {
		long sum = 1;

		for (int i = 2; i <= N; i++) {
			if (N % i != 0) {
				sum *= i;
			}

		}
		return sum;

	}
}