import java.util.*;
public class Pro_1495 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int s = sc.nextInt();
		int m = sc.nextInt();
		int v[] = new int[n+1];
		int dp[][] = new int[n+1][m+1];
		
		for(int i=1; i<=n; i++){
			v[i] = sc.nextInt();
		}
		dp[0][s] = 1; //ó�� ���� s�� ���� �� �� ������ 1�� �־���
		
		for(int i=0; i<n; i++){ //n���� ����� �˻��ϸ�
			for(int j=0; j<=m; j++){ //�ִ� ���� ũ�Ⱑ m�̴ϱ� m���� Ž��
				if(dp[i][j] == 1){ //i��° ���� j�� ������ �� ���� �� ���� ���� ����Ѵ�
					if(j+v[i+1] <= m) //���� + ���� ����
						dp[i+1][j+v[i+1]] = 1;
					if(j-v[i+1] >= 0) //���� - ���� ����
						dp[i+1][j-v[i+1]] = 1;					
				}
			
			}
		}
		int max = -1;
		for(int i=0; i<=m; i++){ //�ִ밪 ã�� �ڵ�
			if(dp[n][i] == 1 && i > max)
				max = i;
		}
		System.out.println(max);

	}

}
