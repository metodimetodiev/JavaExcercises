package simpleTasks;

public class OddTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 2, 3, 1, 3 };
		int n = array.length;
		System.out.println(getOddOccurrence(array, n));
	}

	public static int getOddOccurrence(int[] array, int n) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result = result ^ array[i];
		}
		return result;
	}
}
