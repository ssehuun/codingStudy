import java.util.Scanner;

public class A2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		String reversedNum1 = new StringBuffer(String.valueOf(num1)).reverse().toString();
		String reversedNum2 = new StringBuffer(String.valueOf(num2)).reverse().toString();
		
		if (Integer.parseInt(reversedNum1) > Integer.parseInt(reversedNum2)) {
			System.out.println(reversedNum1);
		} else {
			System.out.println(reversedNum2);
		}
	}
}