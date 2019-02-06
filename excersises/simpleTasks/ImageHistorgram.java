package simpleTasks;

import java.util.ArrayList;

public class ImageHistorgram {

	public static void main(String[] args) {
		short[][] image = { { 0, 0, 1, 0, 0 }, { 0, 0, 0, 3, 4 }, { 15, 1, 0, 0, 0 }, { 3, 0, 5, 0, 0 },
				{ 10, 0, 2, 0, 4 } };
		histogram(image);
	}

	public static void histogram(short[][] image) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				list.add((int) image[i][j]);
			}
		}

		int[] vector = new int[list.size()];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = list.get(i);
		}

		for (int i = 0; i < vector.length; i++) {
			int count = 0;
			for (int j = 0; j < vector.length; j++) {
				if (vector[i] == vector[j])
					count++;
			}
			System.out.println(vector[i] + "\toccures\t" + count + " times");
		}
	}
}
