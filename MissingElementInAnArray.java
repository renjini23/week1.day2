package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// To find the missing element in an array

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if ((i + 1) != arr[i]) {
				System.out.println("Missing element in the array is:- " + (i + 1));
				break;
			}

		}

	}
}
