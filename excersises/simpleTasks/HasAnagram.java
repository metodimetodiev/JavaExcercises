package simpleTasks;

public class HasAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "ma";
		String B = "am";
		System.out.println(hasAnagramOf(A, B));

	}

	public static boolean hasAnagramOf(String A, String B) {
		boolean flag = false;
		int count = 0;

		char[] a = A.toCharArray();
		char[] b = B.toCharArray();

		for (int i = 0; i < B.length(); i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					a[j] = '1';
					count++;
				}
			}
		}

		if (count == B.length()) {
			flag = true;
		}
		return flag;

	}

}
