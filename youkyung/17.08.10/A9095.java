import java.util.Scanner;

public class A9095 {
	public static int d[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();

		for (int i = 0; i < testcase; i++) {
			int n = sc.nextInt();
			d = new int[12];
			d[1] = 1;
			d[2] = 2;
			d[3] = 4;
			System.out.println(dp(n));
		}
	}

	public static int dp(int n) {
		if(n == 1 || n == 2 || n == 3) {
			return d[n];
		} else if (d[n] == 0) {
			d[n] = dp(n-3) + dp(n-2) + dp(n-1);
		}
		return d[n];
	}
}
