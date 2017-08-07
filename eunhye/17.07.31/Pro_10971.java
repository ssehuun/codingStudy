import java.util.Scanner;

public class Pro_10971 {
	
	public static void swap(int arr[], int a, int b){
		int temp = 0;		
		temp = arr[b];
		arr[b] = arr[a];
		arr[a] = temp;
	}
	
	public static boolean next_permutation(int arr[]){
		int i = arr.length-1;
		
		while(i > 0 && arr[i-1] >= arr[i]) i -= 1;
		
		if(i <= 0) return false;
		
		int j = arr.length-1;		
		while(arr[j] <= arr[i-1]) j -= 1;
		
		swap(arr, i-1, j);
		
		j = arr.length-1;		
		while(i < j){
			swap(arr, i, j);
			i += 1;
			j -= 1;
		}
			
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int w[][] = new int [N][N];
		int cost = Integer.MAX_VALUE;
		
		int d[] = new int[N-1];
		
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++)
				w[i][j] = sc.nextInt();
		}
		
		for(int n=0; n<N-1; n++)
			d[n] = n+1;

		do{
			boolean path = true;
			int sum = 0;
			for(int i=0; i<N-2; i++){
				if(w[d[i]][d[i+1]] == 0)
					path = false;
				else
					sum += w[d[i]][d[i+1]];
			}
			
			if(path && w[0][d[0]] != 0 && w[d[N-2]][0] != 0){
				sum += w[0][d[0]] + w[d[N-2]][0];
				
				if(cost > sum)
					cost = sum;
			}
			
		}while(next_permutation(d));
		
		System.out.println(cost);
	}

}
