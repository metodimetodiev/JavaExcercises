package simpleTasks;

public class KthMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 15, 5, 10, 14, 2, 7, 4, 3 };
		bubbleSort(array);
		int k = 2;
		System.out.println("The smallest on " + k + " position is:" + kthMinimum(k, array));
	}

	public static int[] bubbleSort(int[] numArray) {

		int n = numArray.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {

				if (numArray[j - 1] > numArray[j]) {
					temp = numArray[j - 1];
					numArray[j - 1] = numArray[j];
					numArray[j] = temp;
				}

			}
		}
		return numArray;
	}

	public static int kthMinimum(int k, int[] array) {
		k = array[k - 1];
		return k;
	}
}
