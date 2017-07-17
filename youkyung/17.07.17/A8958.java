import java.util.Scanner;

public class A8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			String testcase = sc.nextLine();
			int prescore = 0;
			int score = 0;
			
			for (int j = 0; j < testcase.length(); j++) {
				if (testcase.charAt(j) == 'O') {
						prescore++;
						score += prescore;
				} else {
					prescore = 0;
				}
			}
			System.out.println(score);
		}
	}
}
