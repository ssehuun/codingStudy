import java.util.Scanner;

public class A2003 {
	public static int A[];
	public static int N;
	public static int M;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		A = new int[N];
		for (int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}
		
		int count = 0;
		for (int i=0; i<A.length; i++) {
			count += add(i, A[i]);
		}
		
		System.out.println(count);
		
	}
	
	public static int add(int index, int sum) {
		if (sum == M) {
			return 1;
		}
		if (sum > M || index+1 >= N) {
			return 0;
		}
		
		return add(index+1, sum+A[index+1]);
	}
}
