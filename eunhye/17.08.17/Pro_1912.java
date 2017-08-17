import java.util.*;
public class Pro_1912 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		int arr[] = new int[n+1];
		int dp[] = new int[n+1];
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		dp[0] = arr[0];
		int max = dp[0];
		for(int i=1; i<n; i++){			
				dp[i] = (dp[i-1] + arr[i]) > arr[i] ? (dp[i-1] + arr[i]) : arr[i];		
				
				if(max < dp[i])
					max = dp[i];
		}
		
		System.out.println(max);		
	}

}
