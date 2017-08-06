import java.util.*;

public class Pro_2003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[N+1];
		
		sc.nextLine();
		
		for(int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		
		arr[N] = 0;
		
		int left = 0, right = 0, sum = arr[0], ans = 0;
		while(left <= right && right < N){
			if(sum < M){
				right += 1;
				sum += arr[right];				
			}
			else if(sum > M){				
				sum -= arr[left];
				left += 1;
			}
			else if(sum == M){
				right += 1;
				ans++;
				sum += arr[right];
			}
		}
		System.out.println(ans);
		sc.close();
	}

}
