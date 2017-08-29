import java.util.*;
public class Pro_5557 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		long dp[][] = new long[n][21];
		n-= 1; //마지막 숫자 빼주기
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
	
		int goal = sc.nextInt(); //마지막 숫자 저장(등식의 결과)
	
		dp[0][arr[0]] = 1; //0번째 숫자까지 이용하여 arr[0] 의 값을 만드는 방법 = 1
		
		for(int i=1; i<n; i++){
			for(int j=0; j<=20; j++){ //0~20의 범위 안에서 계산				
					if(j+arr[i] <= 20) //j를 만들기 위해서 현재 arr[i]을 더하거나 빼서 범위안에 있으면 dp에 추가 						
						dp[i][j] += dp[i-1][j+arr[i]];
					if(j-arr[i] >= 0)
						dp[i][j] += dp[i-1][j-arr[i]];
				}
			}
		
		
		System.out.println(dp[n-1][goal]);//n-1번째 숫자까지 사용해서 goal 값을 만드는 방법 출력
	}

}
