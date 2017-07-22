import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A12761 {
	public static final int MAXNUM = 100000;
	public static final int MINNUM = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<Integer>();
		int results[] = new int[100001];
		int A = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		int M = sc.nextInt();

		for (int i = 0; i < results.length; i++) {
			results[i] = 0;
		}

		queue.add(N);

		if (N == M) {
			System.out.println("0");
		} else {
			while (!queue.isEmpty()) {
				int num = queue.remove();
				int next[] = {1, -1, A, -A, B, -B, num*(A-1), num*(B-1)};
				
				for (int i = 0; i < next.length; i++) {
					int nextnum = num + next[i];
					
					if (nextnum <= MAXNUM && nextnum >= MINNUM) {
						if (results[nextnum] == 0) {
							queue.add(nextnum);
							results[nextnum] = results[num] + 1;
							
							if (nextnum == M) {
								System.out.println(results[M]);
								return;
							}
						}
					}
				}
			}
		}
	}
}