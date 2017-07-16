import java.util.Scanner;

public class Pro_1149 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r,g,b;
		int N = sc.nextInt();
		int cost[][] = new int[3][N];
		
		cost[0][0] = sc.nextInt();
		cost[1][0] = sc.nextInt();
		cost[2][0] = sc.nextInt();
		
		for(int i=1; i<N; i++){
			r = sc.nextInt();
			g = sc.nextInt();
			b = sc.nextInt();
			
			cost[0][i] = r + Math.min(cost[1][i-1], cost[2][i-1]);  
			cost[1][i] = g + Math.min(cost[0][i-1], cost[2][i-1]);  
			cost[2][i] = b + Math.min(cost[0][i-1], cost[1][i-1]);  			
		}
		
		System.out.println(Math.min(cost[0][N-1], Math.min(cost[1][N-1], cost[2][N-1])));
		
		sc.close();
	}
}
