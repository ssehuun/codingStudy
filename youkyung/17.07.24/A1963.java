import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A1963 {
	public static void main(String[] args) {
		new A1963().run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();

		for (int i = 0; i < testcases; i++) {
			int originPrime = sc.nextInt();
			int targetPrime = sc.nextInt();

			if (originPrime == targetPrime) {
				System.out.println("0");
			} else {
				Queue<Integer> queue = new LinkedList<Integer>();
				int results[] = new int[10000];

				// 초기화
				for (int j = 0; j < results.length; j++) {
					results[j] = 0;
				}

				queue.add(originPrime);
				bfs(queue, results, targetPrime);
			}
		}
	}

	public boolean isPrimeNumber(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void bfs(Queue<Integer> queue, int[] results, int targetPrime) {
		while (!queue.isEmpty()) {

			int num = queue.remove();
			// 조건

			int digit1000 = num / 1000;
			int digit100 = (num / 100) - digit1000 * 10;
			int digit10 = (num / 10) - digit1000 * 100 - digit100 * 10;
			int digit1 = (num % 10);

			// 천의자리수 교환
			for (int i = 1; i <= 9; i++) {
				if (i != digit1000) {
					int newnum = i*1000 + digit100*100 + digit10*10 + digit1;
					if (isPrimeNumber(newnum) && results[newnum] == 0) {
						queue.add(newnum);
						results[newnum] = results[num] + 1;
						if (newnum == targetPrime) {
							System.out.println(results[newnum]);
							return;
						}
					}
				}
			}

			// 백의자리수 교환
			for (int i = 0; i <= 9; i++) {
				if (i != digit100) {
					int newnum = digit1000*1000 + i*100 + digit10*10 + digit1;
					if (isPrimeNumber(newnum) && results[newnum] == 0) {
						queue.add(newnum);
						results[newnum] = results[num] + 1;

						if (newnum == targetPrime) {
							System.out.println(results[newnum]);
							return;
						}
					}
				}
			}

			// 십의자리수 교환
			for (int i = 0; i <= 9; i++) {
				if (i != digit10) {
					int newnum = digit1000*1000 + digit100*100 + i*10 + digit1;
					if (isPrimeNumber(newnum) && results[newnum] == 0) {
						queue.add(newnum);
						results[newnum] = results[num] + 1;

						if (newnum == targetPrime) {
							System.out.println(results[newnum]);
							return;
						}
					}
				}
			}

			// 일의자리수 교환
			for (int i = 0; i <= 9; i++) {
				if (i != digit1) {
					int newnum = digit1000*1000 + digit100*100 + digit10*10 + i;
					if (isPrimeNumber(newnum) && results[newnum] == 0) {
						queue.add(newnum);
						results[newnum] = results[num] + 1;

						if (newnum == targetPrime) {
							System.out.println(results[newnum]);
							return;
						}
					}
				}
			}
		}
	}
}
