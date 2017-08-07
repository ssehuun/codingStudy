import java.util.Scanner;

public class A9095 {
	public static int n;
	public static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		int nums[] = { 1, 2, 3 };

		for (int i = 0; i < T; i++) {
			n = sc.nextInt();
			count = 0;

			for (int j=1; j<=3; j++) {
				int sum = 0;
				sum += j;
				System.out.println("j 시작 : " + j);
//				count += recursion(sum);
			}
			
			System.out.println(count);
		}
	}
	
//	public static int recursion(int sum) {
//		for (int i=1; i<=3; i++) {
//			System.out.println("i : " + i + "이떄까지  sum : " + sum);
//			sum += i;
//			if (sum == n) {
//				count++;
//				System.out.println("result: sum =" + sum + "// count =" + count);
//				return count;
//			} else if (sum < n){
//				System.out.println("recursion: sum = " + sum);
//				count += recursion(sum);
//			}
//		}
//	}
}
