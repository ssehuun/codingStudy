import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result[] = new int[N + 1];
		if (N == 1) {
			System.out.println(0);
		} else {
			Queue<Integer> queue = new LinkedList<>();
			queue.add(N);
			dfs(queue, result);
		}
	}

	public static void dfs(Queue<Integer> queue, int result[]) {
		while (!queue.isEmpty()) {
			int n = queue.remove();
			if (n % 3 == 0 && result[n / 3] == 0) {
				result[n / 3] = result[n] + 1;
				queue.add(n / 3);
				if (n / 3 == 1) {
					System.out.println(result[n / 3]);
					return;
				}
			}
			if (n % 2 == 0 && result[n / 2] == 0) {
				result[n / 2] = result[n] + 1;
				queue.add(n / 2);
				if (n / 2 == 1) {
					System.out.println(result[n / 2]);
					return;
				}
			}
			if (n > 1 && result[n - 1] == 0) {
				result[n - 1] = result[n] + 1;
				queue.add(n - 1);
				if (n - 1 == 1) {
					System.out.println(result[n - 1]);
					return;
				}
			}
		}

	}
}
