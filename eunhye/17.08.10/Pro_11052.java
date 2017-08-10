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
		
		for(int i=1; i<=N; i++){//��ü i�� �߿���
			for(int j=1; j<=i; j++){//������ ����� j���� �簣��
				dp[i] = Math.max(dp[i], dp[i-j]+p[j]); //���� i�� �簡�� �� vs j�� �簡�°�!
			}
		}		
		
		System.out.println(dp[N]);
		sc.close();
	}

}
