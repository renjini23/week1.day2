package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// To find the count of different data types in a String
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isLetter(charArray[i]))
				letter += 1;
			else if (Character.isSpaceChar(charArray[i]))
				space += 1;

			else if (Character.isDigit(charArray[i]))
				num += 1;

			else
				specialChar = specialChar + 1;

		}

		System.out.println("Number of letters in the String are:- " + letter);
		System.out.println("Number of space in the String are:- " + space);
		System.out.println("Number of numbers in the String are:- " + num);
		System.out.println("Number of special characters in the String are:- " + specialChar);

	}

}
