import java.util.*;
public class Pro_11057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ans = 0;
		long mod = 10007;
		int n = sc.nextInt();
		
		long dp[][] = new long[n+1][10];

		for(int i=0; i<=9; i++){
			dp[1][i] = 1;
		}
		
		for(int i=2; i<=n; i++){			
			for(int j=0; j<=9; j++){
				for(int k=0; k<=j; k++){
					dp[i][j] += dp[i-1][k];
					dp[i][j] %= mod;
				}
			}
		}
		
		for(int i=0; i<=9; i++){
			ans += dp[n][i];
		}
		ans %= mod;
		System.out.println(ans);
		
		sc.close();		
	}
}
