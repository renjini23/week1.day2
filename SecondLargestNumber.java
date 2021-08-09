package week1.day2;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// To find the 2nd largest number in the array

		int[] data = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(data);
		System.out.println("Second Largest number in the arry is:- " + (data[(data.length) - 2]));

	}

}
