import java.util.*;
public class Pro_1476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		
		int e=1,s=1,m=1;
		
		for(int i=0;; i++){
			e = (i % 15) +1;
			s = (i % 28) +1;
			m = (i % 19) +1;
			if(e == E && s == S && m == M){
				System.out.println(i+1);//0부터 시작해서
				break;
			}
		}
		
		
			
	}

}
