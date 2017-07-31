import java.util.Scanner;

public class A1107 {
	public static boolean broken[] = new boolean[10];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		// 모든 채널이 사용 가능하다고 초기화하기
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();
			broken[x] = true;
		}
		
		int result = N - 100; // n >= 100
		if (result < 0) {
			result = -result; // n < 100
		}
		
		for (int i = 0; i <= 1000000; i++) {
			int channel = i;
			int length = possible(channel);
			if (length > 0) {
				int press = channel - N; // +나 -를 몇 번 눌러야 하는지 계산
				if (press < 0) {
					press = -press;
				}
				
				if (result > length + press) {
					result = length + press;
				}
			}
		}
		
		System.out.println(result);
	}
	
	public static int possible (int c) {
		if (c == 0) {
			if (broken[0] == true) {
				return 0;
			} else {
				return 1;
			}
		}
		
		int length = 0;
		while (c > 0) {
			if (broken[c % 10]) {
				return 0;
			}
			length++;
			c /= 10;
		}
		return length;
	}
}
