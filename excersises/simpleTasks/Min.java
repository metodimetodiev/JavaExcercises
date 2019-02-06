package simpleTasks;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 10, 3, 1, 5, 20, 18, 50, 60, 9, 80 };
		System.out.println(minimal(array));

	}

	public static int minimal(int[] array) {

		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}

		}
		return min;
	}
}
