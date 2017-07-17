import java.util.Scanner;

public class LongestEvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		String words[] = text.split(" ");

		String longestWord = "";
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() % 2 == 0) {
				if (words[i].length() > longestWord.length()) {
					longestWord = words[i];
				}
			}
		}
		System.out.println(longestWord);
	}
}
