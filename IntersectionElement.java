package week1.day2;

public class IntersectionElement {

	public static void main(String[] args) {
		// To find the intersection of two arrays
		int[] firstArray = { 3, 2, 11, 4, 6, 7 };
		int secondArray[] = { 1, 2, 8, 4, 9, 7 };
		System.out.println("Intersection elements of these two arrays are:- ");
		for (int i = 0; i < firstArray.length; i++) {
			for (int j = 0; j < secondArray.length; j++) {
				if (firstArray[i] == secondArray[j])
					System.out.print(" " + firstArray[i]);

			}
		}

	}

}
