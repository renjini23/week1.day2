package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// To convert the odd index letters in String to upper case

		String test = "changeme";
		String modified = "";
		char[] letter = test.toCharArray();
		for (int i = 0; i < letter.length; i++) {

			if (i % 2 == 1) {
				System.out.print(Character.toUpperCase(letter[i]));
				} else
				System.out.print(letter[i]);

		}

	}
}
