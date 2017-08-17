import java.util.*;
public class Pro_1699 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int dp[] = new int [n+1];		
		
		for(int i=1; i<=n; i++){
			dp[i] = i; //1�θ� ���Ѱɷ� �ʱ�ȭ
			for(int j=1; (j*j)<=i; j++){//j*j�� ������ ��
				if(dp[i] > dp[i-(j*j)]+1){
					dp[i] = dp[i-(j*j)]+1;
				}
			}	
		
		}
		
		System.out.println(dp[n]);
	}

}
