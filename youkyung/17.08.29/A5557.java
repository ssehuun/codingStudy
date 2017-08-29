import java.util.Scanner;

public class A5557 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n + 1];
		int d[][] = new int[n + 1][21];
		for (int i = 1; i <= n; i++) {
			nums[i] = sc.nextInt();
		}

		d[1][nums[1]] = 1;
		int result = nums[n - 1];

		for (int i = 2; i < n; i++) {
			for (int j = 0; j <= 20; j++) {
				if (j+nums[i] <= 20) {
					d[i][j] += d[i-1][j+nums[i]];
				}
				if (j-nums[i] >= 0) {
					d[i][j] += d[i-1][j-nums[i]];
				}
			}
		}	
//		for (int i = 2; i < n; i++) {
//			for (int j = 0; j <= 20; j++) {
//				if (d[i - 1][j] >= 1) {
//					int nextSum = j + nums[i];
//					if (nextSum <= 20) {
//						d[i][nextSum] = d[i - 1][j];
//					}
//
//					nextSum = j - nums[i];
//					if (nextSum >= 0) {
//						if (d[i][nextSum] == 0) {
//							d[i][nextSum] = d[i - 1][j];
//						} else {
//							d[i][nextSum]++;
//						}
//					}
//					if (i == 9) {
//						System.out.println(d[i][nextSum]);
//					}
//				}
//			}
//		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= 20; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(d[n - 1][result]);
	}
}
