import java.util.Scanner;

public class A1149 {
	public static final int R = 0;
	public static final int G = 1;
	public static final int B = 2;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result[][] = new int[3][N];
		
		int r, g, b;
		
		result[R][0] = sc.nextInt();
		result[G][0] = sc.nextInt();
		result[B][0] = sc.nextInt();
		
		for (int i=1; i<N; i++) {
			r = sc.nextInt();
			g = sc.nextInt();
			b = sc.nextInt();
			
			result[R][i] = r + Math.min(result[G][i-1], result[B][i-1]);
			result[G][i] = g + Math.min(result[R][i-1], result[B][i-1]);
			result[B][i] = b + Math.min(result[R][i-1], result[G][i-1]);
		}
		
		int min = Math.min(Math.min(result[R][N-1], result[G][N-1]), result[B][N-1]);
		
		System.out.println(min);
	}
}