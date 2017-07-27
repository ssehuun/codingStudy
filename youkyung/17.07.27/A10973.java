import java.util.Scanner;

public class A10973 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int nums[] = new int[N];

		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}
		
		if (pre_permutation(nums)) {
			for (int num : nums) {
				System.out.print(num + " ");
			}
			System.out.println();
		} else {
			System.out.println("-1");
		}
	}
	
	public static boolean pre_permutation(int nums[]) {
		int i = nums.length - 1;
		while (i > 0 && nums[i-1] <= nums[i]) {
			i--;
		}
		
		if (i <= 0) {
			return false;
		}
		
		int j = nums.length - 1;
		while (j>=i && nums[i-1] <= nums[j]) {
			j--;
		}
		
		int temp = nums[j];
		nums[j] = nums[i-1];
		nums[i-1] = temp;
		
		j = nums.length - 1;
		while (i < j) {
			temp = nums[j];
			nums[j] = nums[i];
			nums[i] = temp;
			i++;
			j--;
		}
		
		return true;
	}
}
