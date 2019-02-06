package simpleTasks;

public class DoubleFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println("Double factorial of " + n + " is: " + doubleFac(n));
	}

	public static long doubleFac(int n) {
		n *= 2;
		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
}
