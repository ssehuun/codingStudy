import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class A2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> primes = new HashMap<Integer, Integer>();
		int M = sc.nextInt();
		int N = sc.nextInt();

		// �迭�� ��� �־��ֱ�
		int index = 0;
		for (int i = M; i <= N; i++) {
			primes.put(i, 1);
			index++;
		}
		
		// 1�� ���ԵǾ� ���� �� 1�� ����
		if (primes.containsKey(1)) {
			primes.remove(1);
		}
		
		// ����� �����ϱ�
		for (int i = 2; i <= N; i++) {
			for (int j = i + i; j <= N; j += i) {
				if (primes.containsKey(j)) {
					primes.remove(j);
				}
			}
		}

		// �հ� min�� ���
		int sum = 0;
		int min = N;
		Iterator<Integer> iterator = primes.keySet().iterator();
		while (iterator.hasNext()) {
			int key = iterator.next();
			sum += key;
			if (key <= min) {
				min = key;
			}
		}

		if (sum == 0) {
			System.out.println("-1");
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
