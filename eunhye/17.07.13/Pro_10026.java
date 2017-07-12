import java.util.Scanner;

public class Pro_10026 {
	
	public static int arr[][];
	public static int arr2[][];
	public static int N;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		String temp;
		char color;
		int normal = 0;
		int blind = 0;
		int col;
		
		arr = new int[N][N];
		arr2 = new int[N][N];
		
		for(int i=0; i<N; i++){
			temp = sc.next();
			for(int j=0; j<N; j++){
				color = temp.charAt(j);
				//System.out.println(color);
				
				switch(color){
					case 'R' :	arr[i][j] = 1; arr2[i][j] = 1; break;
					case 'G' :	arr[i][j] = 2; arr2[i][j] = 1; break;
					case 'B' :	arr[i][j] = 3; arr2[i][j] = 2; break;
				}
			}
		}
		
		for(int n=0; n<N; n++){
			for(int m=0; m<N; m++){
				if(arr[n][m] > 0){
					col = arr[n][m];
					normal++;
					search(n,m,col,1);
				}
			}
		}
		
		for(int n=0; n<N; n++){
			for(int m=0; m<N; m++){
				if(arr2[n][m] > 0){
					col = arr2[n][m];
					blind++;
					search(n,m,col,2);
				}
			}
		}
		
		System.out.println(normal+" "+blind);
		
		sc.close();

	}
	
	public static void search(int x, int y, int col, int flag){
		
		if(flag == 1)arr[x][y] = 0;	
		else if(flag == 2)arr2[x][y] = 0;
		
		int dx[] = {0,1,0,-1}, dy[] = {1,0,-1,0};
		int ax=0, ay=0;
		
		for(int i=0; i<4; i++){
			ax = x+dx[i];
			ay = y+dy[i];
		
			if(flag == 1){
				if((0 <= ax && ax < N ) && (0 <= ay && ay < N ) && (arr[ax][ay] == col))				
					search(ax,ay,col,1);	
			}
			else if(flag == 2){
				if((0 <= ax && ax < N ) && (0 <= ay && ay < N ) && (arr2[ax][ay] == col))
					search(ax,ay,col,2);		
			}
		}
	}

}
