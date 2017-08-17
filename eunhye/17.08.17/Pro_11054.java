import java.util.Scanner;
public class Pro_11054 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int seq[] = new int[n+1];
		int dp[] = new int[n+1];
		int dp2[] = new int[n+1];
		for(int i=0; i<n; i++){
			seq[i] = sc.nextInt();			
		}
		
		
		for(int i=0; i<n; i++){ //증가수열
			dp[i] = 1;
			for(int j=0; j<i; j++){
				if(seq[j] < seq[i] && dp[i] < (dp[j]+1)){
					dp[i] = dp[j] + 1;
				}
			}			
		}
		
		for(int i=n-1; i >= 0; i--){ //감소수열
			dp2[i] = 1;
			for(int j=i+1; j<n; j++){
				if(seq[j] < seq[i] && dp2[i] < (dp2[j]+1)){
					dp2[i] = dp2[j] + 1;
				}
			}			
		}
		
		
		int max = dp[0] + dp2[0] - 1;
		for(int k=0; k<n; k++){
			if(max < dp[k] + dp2[k] -1)
				max = dp[k] + dp2[k] -1;
		}
		System.out.println(max);
	}

}
