import java.util.*;
public class Pro_2579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n+1];
		int dp[] = new int[n+1];
		for(int i=1; i<=n; i++){
			sc.nextLine();
			arr[i] = sc.nextInt();
			
		}
		//arr[0] is start point
		
		dp[1] = arr[1];
		dp[2] = arr[1]+arr[2];
		
		for(int j=3; j<=n; j++){
			dp[j] = Math.max((dp[j-2]+arr[j]), (dp[j-3]+arr[j-1]+arr[j]));
		}
		
		System.out.println(dp[n]);
	}

}
