import java.util.Scanner;

public class A11727 {
	public static int d[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		d = new int[n+1];
		d[1] = 1;
		d[2] = 3;
		System.out.println(dp(n));
	}

	public static int dp(int n) {
		if (d[n] == 0) {
			d[n] = dp(n - 1) + (2 * dp(n - 2));
			d[n] %= 1007;
		}
		return d[n];
	}
}
