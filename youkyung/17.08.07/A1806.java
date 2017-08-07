import java.util.Scanner;

public class A1806 {
	public static int N;
	public static int S;
	public static int nums[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.nextInt();
		
		nums = new int[N];
		for (int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		int min = N;
		for (int i=0; i<nums.length; i++) {
			int length = add(i, nums[i], 1);
			if (length > 0 && min > length) {
				min = length;
			}
		}
		
		System.out.println(min);
	}
	
	public static int add(int index, int sum, int length) {
		if (sum == S)
			return length;
		if (sum > S || index+1 >= N)
			return 0;
		
		return add(index+1, sum+nums[index+1], length+1);
	}
}
