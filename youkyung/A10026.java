import java.util.Scanner;

public class A10026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[][] colors = new String[n][n];

		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			for (int j = 0; j < n; j++) {
				colors[i][j] = String.valueOf(line.charAt(j));
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(colors[i][j]);
			}
			System.out.println();
		}
	}
}
