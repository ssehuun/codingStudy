import java.util.*;
public class Pro_7453 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		int a[] = new int[N];
		int b[] = new int[N];
		int c[] = new int[N];
		int d[] = new int[N];
		
		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		
		Vector<Integer> first = new Vector<Integer>();
		Vector<Integer> second = new Vector<Integer>();
		
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				first.add(a[i]+b[j]);
				second.add(c[i]+d[j]);
			}
		}
		
		int ans = 0;
		second.sort(null);
		/*for(int i =0; i < first.size(); i++){
			for(int j=0; j < second.size() ;j++){
				if(first.get(i) == -second.get(j)){
					ans++;	
					if(second.get(j) == second.get(j+1)){
						ans++;
						j += 1;
					}
				}
			}
		}*/
		for(int num : first){
			if(second.contains(-num))
				ans++;
		}
			
		
		System.out.println(ans);
	}

}
