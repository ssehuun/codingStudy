import java.util.Scanner;

public class A11726 {
	public static int d[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		d = new int[n + 1];
		System.out.println(dp(n));
	}

	public static int dp(int n) {
		if (n == 1 || n == 2) {
			d[n] = n;
			return d[n];
		}
		if (d[n] == 0) {
			d[n] = dp(n - 1) + dp(n - 2);
			d[n] = d[n] % 10007;
		}
		return d[n];
	}
}
