import java.util.*;
public class Pro_1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int dp[] = new int[n+1];
		
		dp[1] = 0;
		
		for(int i=2; i<=n; i++){
			dp[i] = dp[i-1] + 1;
			if(i%2 == 0 && dp[i] > (dp[i/2]+1)){ //n을 n/2로 만드는데 1번 연산 사용
				dp[i] = dp[i/2] + 1;
			}
			if(i%3 == 0 && dp[i] > (dp[i/3]+1)){
				dp[i] = dp[i/3] + 1;
			}
		}
		System.out.print(dp[n]);
	}
}
