package simpleTasks;

import java.util.ArrayList;

public class findFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][] { 
			{ 1, 1, 1, 2 }, 
			{ 5, 2, 3, 6 }, 
			{ 5, 3, 2, 3 },
			{ 55, 5, 39, 15 } };
		isFib(matrix);

	}

	public static void isFib(int[][] matrix) {
		checkHor(matrix);
		checkVert(matrix);
	}

	public static void checkHor(int[][] matrix) {
		ArrayList list = new ArrayList();
		int counter = 0;
		for (int row = 0; row <= matrix.length - 1; row++) {
			for (int col = 2; col <= matrix[0].length - 1; col++) {
				if (matrix[row][col] == matrix[row][col - 1] + matrix[row][col - 2]) {
					counter++;

					if (counter == 1) {

						list.add(matrix[row][col - 2]);
						list.add(matrix[row][col - 1]);
						list.add(matrix[row][col]);
					} else if (counter > 1) {
						list.add(matrix[row][col]);
					}
				} else {
					counter = 0;
					continue;
				}

			}
		}
		if (list.size() <= 1) {
			System.out.println("No fib sequence in rows");

		} else {
			System.out.println("Fib in rows " + list);
		}
	}

	public static void checkVert(int[][] matrix) {
		ArrayList list = new ArrayList();
		int counter = 0;
		for (int col = 0; col < matrix[0].length; col++) {
			for (int row = 2; row < matrix.length; row++) {
				if (matrix[row][col] == matrix[row - 1][col] + matrix[row - 2][col]) {
					counter++;

					if (counter == 1) {

						list.add(matrix[row - 2][col]);
						list.add(matrix[row - 1][col]);
						list.add(matrix[row][col]);
					} else if (counter > 1) {
						list.add(matrix[row][col]);
					}
				} else {
					counter = 0;
					continue;
				}

			}
		}
		if (list.size() <= 1) {
			System.out.println("No fib sequence in cols");
		} else {
			System.out.println("Fib in cols " + list);
		}

	}

}
