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

		// 배열에 모두 넣어주기
		int index = 0;
		for (int i = M; i <= N; i++) {
			primes.put(i, 1);
			index++;
		}
		
		// 1이 포함되어 있을 때 1은 제거
		if (primes.containsKey(1)) {
			primes.remove(1);
		}
		
		// 배수는 제외하기
		for (int i = 2; i <= N; i++) {
			for (int j = i + i; j <= N; j += i) {
				if (primes.containsKey(j)) {
					primes.remove(j);
				}
			}
		}

		// 합과 min값 얻기
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
