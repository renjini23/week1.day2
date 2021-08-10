package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// Find out if the given string is palindrome or not

		String word = "madam";
		String rev = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			char letter = word.charAt(i);
			rev = rev + letter;
		}
		if (word.equals(rev))
			System.out.println("Given string is a Palindrome");
		else
			System.out.println("Given string is not a Palindrome");
	}

}
