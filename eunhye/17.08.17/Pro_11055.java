import java.util.Scanner;
public class Pro_11055 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int seq[] = new int[n+1];
		int dp[] = new int[n+1];
		for(int i=0; i<n; i++){
			seq[i] = sc.nextInt();			
		}
		
		int max = 0;		
		for(int i=0; i<n; i++){
			dp[i] = seq[i];
			for(int j=0; j<i; j++){
				if(seq[j] < seq[i] && dp[i] < (dp[j] + seq[i])){
					dp[i] = dp[j] + seq[i];
				}
			}
			if(max < dp[i])
				max = dp[i];
		}
		
		System.out.println(max);
		

	}

}
