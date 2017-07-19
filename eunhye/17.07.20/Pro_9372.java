import java.util.Scanner;

public class Pro_9372 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		while(T>0){
			int N = sc.nextInt();
			int M = sc.nextInt();
			int arr[][] = new int[M][2];
			for(int i=0; i<M; i++){
				arr[i][0] = sc.nextInt();
				arr[i][1] = sc.nextInt();
			}
			System.out.println(N-1);
			T--;
			}
			
		
		sc.close();
	}

}
