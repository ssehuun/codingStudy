import java.util.Arrays;
import java.util.Scanner;
public class Pro_10942 {
	public static int dp[][];
	public static int arr[];
	public static int go(int start, int end){
		if(start == end){
			return 1;
		} //길이 1
		else if(start+1 == end){
			if(arr[start] == arr[end])
				return 1;
			else 
				return 0;
		}// 길이 2
		
		if(dp[start][end] >= 0)
			return dp[start][end]; //memorization
		if(arr[start] != arr[end]) 
			return dp[start][end] = 0;
		else 
			return dp[start][end] = go(start+1, end-1);		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		arr = new int[n+1];
		dp = new int [n+1][n+1];
		
		for(int i=1; i<=n; i++){
			arr[i] = sc.nextInt();
			Arrays.fill(dp[i], -1);
		}
		
		int m = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<m; i++){
			int start = sc.nextInt();
			int end = sc.nextInt();
			sb.append(go(start, end));
			sb.append('\n');			
		}		
		System.out.println(sb);
		sc.close();
	}

}
