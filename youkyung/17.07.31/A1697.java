import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class A1697 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int results[] = new int[100001];
		for (int i = 0; i < results.length; i++) {
			results[i] = 0;
		}

		if (N == K) {
			System.out.println("0");
		} else {

			Queue<Integer> queue = new LinkedList<Integer>();
			queue.add(N);
			results[N] = 0;

			while (!queue.isEmpty()) {
				int current = queue.remove();
				if (current + 1 <= 100000 && results[current + 1] == 0) {
					queue.add(current + 1);
					results[current + 1] = results[current] + 1;
					if (current + 1 == K) {
						System.out.println(results[current + 1]);
						return;
					}
				}
				if (current - 1 >= 0 && results[current - 1] == 0) {
					queue.add(current - 1);
					results[current - 1] = results[current] + 1;
					if (current - 1 == K) {
						System.out.println(results[current - 1]);
						return;
					}
				}
				if (current * 2 <= 100000 && results[current * 2] == 0) {
					queue.add(current * 2);
					results[current * 2] = results[current] + 1;
					if (current * 2 == K) {
						System.out.println(results[current * 2]);
						return;
					}
				}
			}
		}
	}
}
