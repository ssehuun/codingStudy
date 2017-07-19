import java.util.Scanner;

public class Pro_1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int n = 64;
		int cnt = 0;
		int sum = 0;
		
		while(X > 0){
			if(X == n){
				cnt++;
				break;
			}
			
			if(n > X){
				n = n/2;
			}
			else{
				X = X - n;
				cnt++;
			}
		}
		
		System.out.print(cnt);
		
		
		sc.close();
	}

}
