import java.util.Scanner;

public class Pro_1107 {
	
	static boolean broken[] = new boolean[10];
	static int possible(int c){
		if(c == 0){
			if(broken[0])
				return 0;
			else
				return 1;
		}
		int len = 0;
		while(c>0){
			if(broken[c % 10])
				return 0;
			len += 1;
			c /= 10;
		}		
		return len;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int m = sc.nextInt();
		
		
		for(int i=0; i<m; i++){
			int b = sc.nextInt();
			broken[b] = true;
		}
		
		int ans = N - 100;//+,-만 누르는 경우
		if(ans < 0) //채널이 100보다 작은경우
			ans = -ans;
		
		for(int i=0; i<=1000000; i++){ //숫자버튼 & +,- 누르는경우
			int c = i;
			int len = possible(c);
			if(len > 0){
				int press = c - N;
				if(press < 0)
					press = -press;
				if(ans > len + press)
					ans = len + press;
			}
		}
		System.out.println(ans);		
		
		sc.close();
	}
}
