import java.util.Scanner;

public class Pro_9663 {
	
	static int colPath[];
	static int N;
	static int result = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();		
		colPath = new int[N];
		
		
		
		for(int i=0; i<N; i++){
			colPath[0] = i;
			queen(i,0);
		} //첫째 줄 첫째 칸 부터 하나씩 놓고 검사
		
		System.out.println(result);
		
		sc.close();
	}
	
	public static void queen(int row, int col){
		for(int j=0; j<col; j++){
			if(colPath[j] == row || Math.abs(row-colPath[j]) == col-j)
				return;
		}
		
		if(col == N-1){
			result++;
			return;
		}
		
		for(int n=0; n<N; n++){
			colPath[col+1] = n;
			queen(n,col+1);
		}
	}

}
