import java.util.Scanner;

public class A1107 {
	public static boolean broken[] = new boolean[10];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		// ��� ä���� ��� �����ϴٰ� �ʱ�ȭ�ϱ�
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
				int press = channel - N; // +�� -�� �� �� ������ �ϴ��� ���
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
