import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A9019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			String result[] = new String[10001];

			Queue<Integer> queue = new LinkedList<Integer>();
			queue.add(A);
			result[A] = "";

			bfs(queue, result, B);
		}
	}

	public static void bfs(Queue<Integer> queue, String[] result, int B) {
		while (!queue.isEmpty()) {
			int current = queue.remove();
			int L = (current % 1000) * 10 + current / 1000;
			int R = current / 10 + (current % 10) * 1000;
			int nexts[] = { 2 * current, current - 1, L, R };
			for (int j = 0; j < nexts.length; j++) {
				int next = nexts[j];

				if (j == 0) {
					if (next > 9999) {
						next = next % 10000;
					}
				}
				if (j == 1) {
					if (current == 0) {
						next = 9999;
					}
				}

				if (result[next] == null || result[next].equals("")) {
					queue.add(next);
					if (j == 0) {
						result[next] = new String(result[current] + "D");
					}
					if (j == 1) {
						result[next] = new String(result[current] + "S");
					}
					if (j == 2) {
						result[next] = new String(result[current] + "L");
					}
					if (j == 3) {
						result[next] = new String(result[current] + "R");
					}
					if (next == B) {
						System.out.println(result[next]);
						return;
					}
				}

			}
		}
	}
}
