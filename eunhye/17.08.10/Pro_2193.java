import java.util.*;
public class Pro_2193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long dp[] = new long[n+1];
		
		
		dp[1] = 1; //1로 시작
		if(n >= 2)
			dp[2] = 1; //배열크기를 n+1로 선언하는데 만약에 n=1 이면 배열에 못넣어서 런타임에러
		for(int i=3; i<=n; i++){
			dp[i] = dp[i-1] + dp[i-2];			
		}
		
		System.out.println(dp[n]);
		
	}

}
