package Practice;

public class TwoSums {

	public static void main(String[] args) {
		int sum[] = new int[2];
		sum[0] = 3;
		sum[1] = 3;
		sum = twoSum(sum, 6);
		for (int i = 0; i < 2; i++) {
			System.out.println(sum[i]);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		int len = nums.length;
		int arr[] = new int[2];
		int result = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				result = nums[i] + nums[j];
				if (result == target) {
					arr[0] = i;
					arr[1] = j;
					break;
				}
			}
			if (result == target) {
				break;
			}
		}
		return arr;
	}
}
