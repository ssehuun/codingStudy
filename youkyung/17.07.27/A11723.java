import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A11723 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < M; i++) {
			String operation = sc.next();

			int num = 0;
			if (sc.hasNextInt()) {
				// all, empty ¾Æ´Ò ¶§
				num = sc.nextInt();
			}

			switch (operation) {
			case "add":
				if (!list.contains(num)) {
					list.add(num);
				}
				break;
			case "remove":
				if (list.contains(num)) {
					list.remove(new Integer(num));
				}
				break;
			case "check":
				if (list.contains(num)) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
				break;
			case "toggle":
				if (list.contains(num)) {
					list.remove(new Integer(num));
				} else {
					list.add(num);
				}
				break;
			case "all":
				list.removeAll(list);
				for (int j = 1; j <= 20; j++) {
					list.add(j);
				}
				break;
			case "empty":
				list.removeAll(list);
				break;
			}
		}
		sc.close();
	}
}
