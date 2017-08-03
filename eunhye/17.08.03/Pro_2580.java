import java.util.*;

public class Pro_2580 {
	public static int arr[][] = new int [9][9];		
	
	public static boolean hor[][] = new boolean[9][10];//����		
	public static boolean ver[][] = new boolean[9][10];//����
	public static boolean squ[][] = new boolean[9][10];//���� ���簢��
	
	public static int cal_squ(int x, int y){
		return (x/3)*3 + (y/3);
	}
	
	public static boolean check(int n){
		if(n == 81){
			for(int i=0; i<9; i++){				
				for(int j=0; j<9; j++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			return true;
		}		
		
		int row = n/9; //row
		int col = n%9; //col
		
		if(arr[row][col] != 0){
			return check(n+1);
		}
		else{
			for(int k=1; k<=9; k++){
				if(!hor[row][k] && !ver[col][k] && !squ[cal_squ(row,col)][k]){
					hor[row][k] = true;
					ver[col][k] = true;
					squ[cal_squ(row,col)][k] = true;
					arr[row][col] = k;
					
					if(check(n+1)){
						return true; 
					}//����ϸ� chk�Լ��� true�� �����ϴϱ� �Ϸ�Ǽ� ��
					
					arr[row][col] = 0;//��Ʈ��ŷ
					hor[row][k] = false;
					ver[col][k] = false;
					squ[cal_squ(row,col)][k] = false;
				}
			}
		}		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				arr[i][j] = sc.nextInt();
				
				hor[i][arr[i][j]] = true; //i��°���� ���ڰ� �ֳľ���
				ver[j][arr[i][j]] = true;
				squ[cal_squ(i,j)][arr[i][j]] = true;					
			}
		}
		
		check(0);		

	}

}
