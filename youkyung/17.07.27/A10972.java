import java.util.Scanner;

public class A10972 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int nums[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}

		if (next_permutation(nums)) {
			for (int i=0; i<N; i++) {
                System.out.print(nums[i] + " ");
            }
			System.out.println();
		} else {
			System.out.println("-1");
		}
	}
	
	public static boolean next_permutation(int nums[]) {
		int i = nums.length - 1;
		
		// 뒤에서부터 판별
		while(i > 0 && nums[i-1] >= nums[i]) {
			i--;
		}
		
		// 마지막 순열
		if (i <= 0) {
			return false;
		}
		
		// 뒤에서부터 다음 큰 애(큰 애중 젤 작은애)를 찾는다
		int j = nums.length - 1;
		while (nums[j] <= nums[i-1]) {
			j--;
		}
		
		int temp = nums[i-1];
		nums[i-1] = nums[j];
		nums[j] = temp;
		
		
		j = nums.length - 1;
		while (i < j) {
			temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
		
		return true;
	}
}