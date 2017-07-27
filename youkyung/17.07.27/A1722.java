import java.util.Scanner;

public class A1722 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int number = sc.nextInt();

		int[] nums = new int[N];

		for (int i = 0; i < N; i++) {
			nums[i] = i + 1;
		}
		
		if (number == 1) {
			int k = sc.nextInt();

			// k-1인 이유는 처음 수열이 이미 1이므로
			for (int i = 0; i < k-1; i++) {
				next_permutation(nums);
			}
			
			for (int num : nums) {
				System.out.print(num + " ");
			}
			System.out.println();
			
		} else {
			int targetNums[] = new int[N];
			int count = 1; // 첫번째 수열이 주어졌을 때
			
			for (int i = 0; i < N; i++) {
				targetNums[i] = sc.nextInt();
			}
			
			while (!isArraysEqual(nums, targetNums)) {
				next_permutation(nums);
				count++;
			}
			System.out.println(count);
		}
	}
	
	public static boolean isArraysEqual(int[] array, int[] array2) {
		int i = array.length - 1;
		while (i > 0) {
			if (array[i] != array2[i]) {
				return false;
			}
			i--;
		}
		return true;
	}

	public static void next_permutation(int nums[]) {
		int i = nums.length - 1;
		while (i > 0 && nums[i - 1] >= nums[i]) {
			i--;
		}

		// boolean값 판별 생략

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
	}
}
