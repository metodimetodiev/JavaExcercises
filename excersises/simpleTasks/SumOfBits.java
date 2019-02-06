package simpleTasks;

import java.util.ArrayList;
import java.util.List;

public class SumOfBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 6,8, 10, 16 };
		toBinary(arr);
	}

	public static void toBinary(int[] arr) {
		 boolean swapped = true;
	      int j = 0;
	      int tmp;
	      while (swapped) {
	            swapped = false;
	            j++;
	            for (int i = 0; i < arr.length - j; i++) {                                       
	                  if (Integer.bitCount(arr[i]) > Integer.bitCount(arr[i+1])) {                          
	                        tmp = arr[i];
	                        arr[i] = arr[i + 1];
	                        arr[i + 1] = tmp;
	                        swapped = true;
	                  }
	            }                
	      }
	
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
