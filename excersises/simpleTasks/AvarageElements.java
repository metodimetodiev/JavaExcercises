package simpleTasks;

public class AvarageElements {


	public  int getAvarage(int[] array) {
		int avr = 0;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return avr = sum / array.length;
	}
}
