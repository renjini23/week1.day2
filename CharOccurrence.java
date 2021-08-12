package week1.day2;

public class CharOccurrence {

	public static void main(String[] args) {
		// To check the number of occurrences of a character

		String str = "welcome to chennai";
		int count = 0;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'e')
				count = count + 1;
		}
		System.out.println("Character 'e' is occurring " + count + " times in this string");
	}

}
