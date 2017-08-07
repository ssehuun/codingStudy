import java.util.*;
public class Pro_1987 {
	public static int dx[] = {0,0,1,-1};
	public static int dy[] = {1,-1,0,0};
	public static boolean chk[] = new boolean[26];//���ĺ�����
	public static int row;
	public static int col;
	
	public static int alpha(char arr[][], int x, int y){
		int ans = 0;
		
		for(int i=0; i<4; i++){
			int ax = x + dx[i];
			int ay = y + dy[i];
			
			if(ax >=0 && ax < row && ay >= 0 && ay < col){
				if(chk[arr[ax][ay] - 'A'] == false){ //�湮 ��������
					chk[arr[ax][ay] - 'A'] = true;
					int next = alpha(arr, ax, ay);
					if(ans < next)
						ans = next;
					chk[arr[ax][ay] - 'A'] = false; //��Ʈ��ŷ�� ��� �ٽ� �������
				}
			}
		}
		return ans+1;	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		row = sc.nextInt();
		col = sc.nextInt();
		char arr[][] = new char[row][col];
		
		sc.nextLine();
		
		for(int i=0; i<row; i++){
			String temp = sc.nextLine();
			for(int j=0; j<col; j++){
				arr[i][j] = temp.charAt(j);
			}
		}
		
		chk[arr[0][0] - 'A'] = true; //ù��° �湮���� ����		
		
		System.out.println(alpha(arr,0,0));
	}
}
