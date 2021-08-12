package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// To check if the given two strings are anagram
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length() == text2.length()) {
			char[] text1Array = text1.toCharArray();
			char[] text2Array = text2.toCharArray();
			Arrays.sort(text1Array);
			Arrays.sort(text2Array);
			if (Arrays.equals(text1Array, text2Array))
				System.out.println("Given texts are anagram");
			else
				System.out.println("Given texts are not anagram");

		} else
			System.out.println("Given texts are not anagram as the length of Strings are different");
		;

	}

}
