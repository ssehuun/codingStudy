import java.util.Scanner;

public class A1495 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int m = sc.nextInt();
		int v[] = new int[n+1];

		int d[][] = new int[n+1][m+1];
		// d[i][j] = i번째 곡을 j볼륨으로 연주할 수 있으면 1

		for (int i = 1; i <= n; i++) {
			v[i] = sc.nextInt();
		}

		d[0][s] = 1;

		for (int i = 1; i <= n; i++) {
			boolean isVolChanged = false;
			for (int j=0; j<=m; j++) {
				if (d[i-1][j] == 1) {
					int nextVol = j - v[i];
					if (nextVol >= 0) {
						d[i][nextVol] = 1;
						isVolChanged = true;
					}
					
					nextVol = j + v[i];
					if (nextVol <= m) {
						d[i][nextVol] = 1;
						isVolChanged = true;
					}
				}
			}
			if (isVolChanged == false) {
				System.out.println("-1");
				return;
			}
		}
		
		for (int i=m; i>=0; i--) {
			if(d[n][i] == 1) {
				System.out.println(i);
				return;
			}
		}
	}
}
