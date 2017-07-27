import java.util.Scanner;

public class A10974 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int nums[] = new int[N];

		for (int i = 0; i < N; i++) {
			nums[i] = i + 1;
		}
		do {
			for (int num : nums) {
				System.out.print(num + " ");
			}
			System.out.println();
		} while (next_permutation(nums));

	}

	public static boolean next_permutation(int nums[]) {
		int i = nums.length - 1;
		while (i > 0 && nums[i - 1] >= nums[i]) {
			i--;
		}

		if (i <= 0) {
			return false;
		}

		int j = nums.length - 1;
		while (nums[j] <= nums[i - 1]) {
			j--;
		}

		int temp = nums[j];
		nums[j] = nums[i - 1];
		nums[i - 1] = temp;

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
