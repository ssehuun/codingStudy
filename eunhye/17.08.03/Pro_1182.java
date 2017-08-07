import java.util.*;

public class Pro_1182 {
	public static int arr[];
	public static int n;
	public static int s;
	public static int ans=0;
	
	public static void selfcall(int index, int sum){		
		if(arr.length == index){ //끝까지 다 봤다면
			if(sum == s){
				ans++;
				}		
			else 
				return;
		}
		
		if(arr.length <= index) return;
		selfcall(index+1, (sum+arr[index]));//index번째 포함
		selfcall(index+1, sum);//미포함		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		s = sc.nextInt();
		
		arr = new int[n];
		
		sc.nextLine();
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();			
		}
		
		selfcall(0,0);
		
		if(s == 0)
			ans -= 1;
		
		System.out.println(ans);

	}

}
