import java.util.*;
public class Pro_1644 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		List<Integer> prime = new ArrayList<Integer>();
		boolean chk[] = new boolean[N+1];
		
		for(int i=2; i<=N; i++){
			if(!chk[i]){
				prime.add(i);
				for(int j=2*i; j<=N; j+=i){ //j+=i는 i의 배수에 true를 넣기위해서
					chk[j] = true;// 소수가 아니면 true
				}
			}//소수면 리스트에 저장			
		}
		
		
		int left = 0, right = 0, ans = 0, sum = prime.size() == 0? 0 : prime.get(0);
		while(left <= right && right < prime.size()){
			if(sum == N){
				ans++;
				right += 1;
				if(right < prime.size())
					sum += prime.get(right);

			}
			else if(sum < N){
				right += 1;
				if(right < prime.size())
					sum += prime.get(right);
			}
			else if(sum > N){
				sum -= prime.get(left);
				left += 1;
			}
		}
		
		System.out.println(ans);
	}

}
