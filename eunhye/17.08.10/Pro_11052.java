import java.util.Scanner;

public class Pro_11052 { //dp

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int p[] = new int[N+1];
		int dp[] = new int[N+1];
		
		dp[0] = 0;
		sc.nextLine();
		for(int i=1; i<=N; i++){
			p[i] = sc.nextInt();
		}
		
		for(int i=1; i<=N; i++){//전체 i개 중에서
			for(int j=1; j<=i; j++){//마지막 사람이 j개를 사간다
				dp[i] = Math.max(dp[i], dp[i-j]+p[j]); //전부 i개 사가는 거 vs j개 사가는것!
			}
		}		
		
		System.out.println(dp[N]);
		sc.close();
	}

}
