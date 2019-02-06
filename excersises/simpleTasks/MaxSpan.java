package simpleTasks;

import java.util.Scanner;

public class MaxSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {0,1,3,3,3,1};
		System.out.println("Max span is: " + maxSpan(numbers));
	}

	public static int maxSpan(int[] numbers) {
		int max = 0;
		int temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = numbers.length - 1; j > i - 1; j--) {
				if (numbers[i] == numbers[j]) {
					temp = j - i + 1;
					if (temp > max) {
						max = temp;
						break;
					}
				}
			}
		}
		return max;
	}
}
