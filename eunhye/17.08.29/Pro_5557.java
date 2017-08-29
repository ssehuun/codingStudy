import java.util.*;
public class Pro_5557 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		long dp[][] = new long[n][21];
		n-= 1; //������ ���� ���ֱ�
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
	
		int goal = sc.nextInt(); //������ ���� ����(����� ���)
	
		dp[0][arr[0]] = 1; //0��° ���ڱ��� �̿��Ͽ� arr[0] �� ���� ����� ��� = 1
		
		for(int i=1; i<n; i++){
			for(int j=0; j<=20; j++){ //0~20�� ���� �ȿ��� ���				
					if(j+arr[i] <= 20) //j�� ����� ���ؼ� ���� arr[i]�� ���ϰų� ���� �����ȿ� ������ dp�� �߰� 						
						dp[i][j] += dp[i-1][j+arr[i]];
					if(j-arr[i] >= 0)
						dp[i][j] += dp[i-1][j-arr[i]];
				}
			}
		
		
		System.out.println(dp[n-1][goal]);//n-1��° ���ڱ��� ����ؼ� goal ���� ����� ��� ���
	}

}
