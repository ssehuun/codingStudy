import java.util.Scanner;

public class Pro_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String quiz[] = new String[N];
		int cnt, sum;
		
		for(int i=0; i<N; i++){
			quiz[i] = sc.next();			
			sum = 0;
			cnt = 0;
			for(int j=0; j<quiz[i].length(); j++){
				if(quiz[i].charAt(j) == 'O'){
					++cnt;
					sum+=cnt;					
				}
				else cnt = 0;					
			}
			System.out.println(sum);
		}	
		sc.close();
	}
}
