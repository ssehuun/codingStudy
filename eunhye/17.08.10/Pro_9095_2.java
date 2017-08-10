import java.util.*;
public class Pro_9095_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();				
		int dp[] = new int[12];
		
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		for(int i=3; i<=11; i++){
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
			
		while(t-- > 0){
			int n = sc.nextInt();
			System.out.println(dp[n]);
		}
		
		sc.close();

	}

}
