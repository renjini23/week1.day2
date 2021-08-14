package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// To reverse even words in a string
		
String str = "I am a software tester";
		
		String[] splitStr = str.split(" ");
		for(int i=0;i<splitStr.length;i++) {
			if(i%2==1) {
				int lengthStr=splitStr[i].length();
				for (int j= lengthStr-1;j>=0;j--) {
					System.out.print(splitStr[i].charAt(j));
				
			}
			System.out.print(" ");

	}
	else {
		System.out.print(splitStr[i]);
		System.out.print(" ");
	}

}
	}
}
