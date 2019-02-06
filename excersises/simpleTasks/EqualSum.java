package simpleTasks;

public class EqualSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 2, 3, 5, 5, 3, 2 };
		System.out.println("Are they have equal sum sides: " + equalSumSides(numbers));
	}

	public static boolean equalSumSides(int[] numbers) {
		int k = numbers.length / 2;
		int left = 0;
		int right = 0;
		if (numbers.length % 2 == 0) {
			for (int i = 0; i <= k; i++) {
				left += numbers[i];
			}
			for (int i = numbers.length; i >= k; i--) {
				right += numbers[i - 1];
			}
		} else {
			for (int i = 0; i <= k; i++) {
				left += numbers[i];
			}
			for (int i = numbers.length; i > k; i--) {
				right += numbers[i - 1];
			}
		}
		if (left != right) {
			return false;
		} else {
			return true;
		}

	}
}
