import java.util.*;
public class Pro_1699 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int dp[] = new int [n+1];		
		
		for(int i=1; i<=n; i++){
			dp[i] = i; //1로만 더한걸로 초기화
			for(int j=1; (j*j)<=i; j++){//j*j로 끝나는 항
				if(dp[i] > dp[i-(j*j)]+1){
					dp[i] = dp[i-(j*j)]+1;
				}
			}	
		
		}
		
		System.out.println(dp[n]);
	}

}
