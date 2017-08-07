import java.util.Scanner;

public class A6603 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();

		int S[] = new int[k+1];
		for (int i = 1; i <= k; i++) {
			S[i] = sc.nextInt();
		}

		int check[] = new int[k+1];
		for (int i = 1; i <= k; i++) {
			check[i] = 0;
		}

		int cases = k * k - 1 * k - 2 * k - 3 * k - 4 * k - 5 / (6 * 5 * 4 * 3 * 2 * 1);
		for (int i = 0; i < cases; i++) {
			for (int j = 1; j <= k; j++) {
				if (check[j] < cases) {
					check[j]++;
					System.out.println(S[j] + " ");
				}
			}
		}
	}
}
