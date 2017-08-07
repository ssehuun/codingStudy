import java.util.Scanner;

public class A1476 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();

		int e = 1;
		int s = 1;
		int m = 1;

		for (int i = 1; i < 15 * 28 * 19; i++) {

			if (E == e && S == s && M == m) {
				System.out.println(i);
				return;
			}

			e++;
			s++;
			m++;

			if (e > 15) {
				e = 1;
			}
			if (s > 28) {
				s = 1;
			}
			if (m > 19) {
				m = 1;
			}
		}
	}
}
