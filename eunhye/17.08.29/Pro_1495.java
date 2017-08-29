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
		dp[0][s] = 1; //처음 곡을 s로 연주 할 수 있으니 1을 넣어줌
		
		for(int i=0; i<n; i++){ //n개의 곡까지 검색하며
			for(int j=0; j<=m; j++){ //최대 볼륨 크기가 m이니까 m까지 탐색
				if(dp[i][j] == 1){ //i번째 곡을 j로 연주할 수 있을 때 다음 곡을 고려한다
					if(j+v[i+1] <= m) //현재 + 다음 볼륨
						dp[i+1][j+v[i+1]] = 1;
					if(j-v[i+1] >= 0) //현재 - 다음 볼륨
						dp[i+1][j-v[i+1]] = 1;					
				}
			
			}
		}
		int max = -1;
		for(int i=0; i<=m; i++){ //최대값 찾는 코드
			if(dp[n][i] == 1 && i > max)
				max = i;
		}
		System.out.println(max);

	}

}
