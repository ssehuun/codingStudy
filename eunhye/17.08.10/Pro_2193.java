import java.util.*;
public class Pro_2193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long dp[] = new long[n+1];
		
		
		dp[1] = 1; //1�� ����
		if(n >= 2)
			dp[2] = 1; //�迭ũ�⸦ n+1�� �����ϴµ� ���࿡ n=1 �̸� �迭�� ���־ ��Ÿ�ӿ���
		for(int i=3; i<=n; i++){
			dp[i] = dp[i-1] + dp[i-2];			
		}
		
		System.out.println(dp[n]);
		
	}

}
