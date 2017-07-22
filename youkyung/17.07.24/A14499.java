import java.util.Scanner;

public class A14499 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int K = sc.nextInt();
		
		int map[][] = new int[N][M];
		int dice[] = {0, 0, 0, 0, 0, 0, 0};
		int dy[] = {1, -1, 0, 0};
		int dx[] = {0, 0, -1, 1};
		// map입력받기
		for (int i=0; i<N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		while(sc.hasNextInt()){
//		for (int i =0 ; i<8; i++) {
			
			int direction = sc.nextInt();
			int curX = dx[direction-1];
			int curY = dy[direction-1];
			if (x + curX <= N-1 && x + curX >= 0 && y + curY >= 0 && y + curY <= M-1) {
				x += curX;
				y += curY;
				
				if (direction == 1) {
					int temp = dice[3];
					dice[3] = dice[1];
					dice[1] = dice[4];
					dice[4] = dice[6];
					dice[6] = temp;
				} else if (direction == 2) {
					int temp = dice[4];
					dice[4] = dice[1];
					dice[1] = dice[3];
					dice[3] = dice[6];
					dice[6] = temp;
				} else if (direction == 3) {
					int temp = dice[2];
					dice[2] = dice[1];
					dice[1] = dice[5];
					dice[5] = dice[6];
					dice[6] = temp;
				} else {
					int temp = dice[5];
					dice[5] = dice[1];
					dice[1] = dice[2];
					dice[2] = dice[6];
					dice[6] = temp;
				}
				
				if (map[x][y] == 0) {
					map[x][y] = dice[6];
				} else {
					dice[6] = map[x][y];
					map[x][y] = 0;
				}
				System.out.println(dice[1]);
			}
		}
		sc.close();
	}

}
