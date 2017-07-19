import java.util.Scanner;

public class Pro_1932 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int dp[][] = new int[n][n];
		int max = 0;
		
		for(int i=0; i<n; i++){
			for(int j=0; j<=i; j++)
			arr[i][j] = sc.nextInt();
		}//¸Ç À­ÃþÀÌ 0Ãþ
		
		dp[0][0] = arr[0][0];
				
		for(int k=1; k<n; k++){
			for(int m=0; m<=k; m++){
				if(m == 0){
					dp[k][m] = arr[k][m] + dp[k-1][m];
				} // ¿ÞÂÊ °æ°è
				else if(m == k){
					dp[k][m] = arr[k][m] + dp[k-1][m-1];
				}// ¿À¸¥ÂÊ °æ°è
				else //Áß°£
					dp[k][m] = Math.max(arr[k][m] +dp[k-1][m-1], arr[k][m] +dp[k-1][m]);
			}
		}
		
		for(int i=0; i<n; i++){
			if(dp[n-1][i] > max)
				max = dp[n-1][i];
		}
		
		System.out.println(max);
		sc.close();
	}
}
