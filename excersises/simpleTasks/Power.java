package simpleTasks;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 4;
		System.out.println(pow(a, b));
	}

	public static long pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
		if (b == 1) {
			return a;
		}
		if (b % 2 == 0) {
			long c = pow(a, b / 2);
			return c * c;
		} else {
			long c = pow(a, (b - 1) / 2);
			return a * c * c;
		}
	}
}
