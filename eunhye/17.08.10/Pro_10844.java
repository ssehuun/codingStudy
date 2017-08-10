import java.util.*;
public class Pro_10844 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0;
		long mod = 1000000000L;
		long dp[][] = new long[n+1][10];
		
		for(int i=1; i<=9; i++){
			dp[1][i] = 1;//n == 1 일때 1~9까지
		}
		dp[1][0] = 0;
		
		for(int i=2; i<=n; i++){
			for(int j=0; j<=9; j++){
				if(j-1 >= 0)
					dp[i][j] += dp[i-1][j-1];
				if(j+1 <= 9)
					dp[i][j] += dp[i-1][j+1];
				dp[i][j] %= mod;
			}
		}
		
		for(int i=0; i<=9; i++){
			ans += dp[n][i];
		}
		ans %= mod;
		System.out.println(ans);

	}

}
