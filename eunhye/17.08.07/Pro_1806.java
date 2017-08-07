import java.util.Scanner;

public class Pro_1806 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[N+1];
		
		sc.nextLine();
		
		for(int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		
		arr[N] = 0;
		
		int left = 0, right = 0, sum = arr[0], ans = Integer.MAX_VALUE, cur = 0;
		while(left <= right && right < N){
			if(sum < M){				
				right += 1;
				sum += arr[right];
				
			}
			else if(sum >= M){		
				cur = right - left + 1;
				if(cur < ans){
					ans = cur;
				}
				sum -= arr[left];
				left += 1;
			}			
		}
		if(ans == Integer.MAX_VALUE)
			System.out.println("0");
		else
			System.out.println(ans);
		sc.close();
	}

}
