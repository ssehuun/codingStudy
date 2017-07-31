import java.util.Arrays;
import java.util.Scanner;

public class Pro_10819 {
	public static void swap(int arr[], int a, int b){
		int temp = 0;		
		temp = arr[b];
		arr[b] = arr[a];
		arr[a] = temp;
	}
	
	public static int calculate(int arr[]){
		int sum = 0;
		for(int i=0; i<arr.length-1; i++){
			sum += Math.abs(arr[i]-arr[i+1]);
		}
		return sum;
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
		int arr[] = new int[N];
		int result = 0;
		
		for(int i=0; i<N; i++){
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		do{
			int temp = calculate(arr);
			result = Math.max(temp, result);
		} while(next_permutation(arr));
		
		System.out.println(result);

	}
}
