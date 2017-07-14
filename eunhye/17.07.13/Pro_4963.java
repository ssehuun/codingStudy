import java.util.Scanner;

public class Pro_4963 {
	public static int island[][];
	public static int w;
	public static int h;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {		
		
		w = sc.nextInt();
		h = sc.nextInt();

		while(w != 0 && h != 0) {
			islandCount();		
		}
		
		sc.close();
	}
	
	public static void islandCount(){
		
		island = new int[h][w];
		int result = 0;
		
		
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				island[i][j] = sc.nextInt();
			}			
		}
		
		for(int n=0; n<h; n++){
			for(int m=0; m<w; m++){
				if(island[n][m] == 1){
					result++;
					search(n,m);
				}
			}
		}		
		
		System.out.println(result);
		
		w = sc.nextInt();
		h = sc.nextInt();
	}
	
	public static void search(int x, int y){
		
		island[x][y] = 0;	
		int dx[] = {0,1,1,1,0,-1,-1,-1}, dy[] = {1,1,0,-1,-1,-1,0,1};
		int ax=0, ay=0;
		
		for(int i=0; i<8; i++){
			ax = x+dx[i];
			ay = y+dy[i];
		
			if((0 <= ax && ax < h ) && (0 <= ay && ay < w ) && (island[ax][ay] == 1))
				search(ax,ay);				
		}
	}

}
