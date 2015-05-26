//O(n2) runtime, O(1) space – Brute force

class Solution {
	public int[] twoSum(int[] nums, int target) {
		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (j != i && nums[i] + nums[j] == target) {
					index1 = i;
					index2 = j;
				}
			}
		}
		if (index1 > index2) {
			int temp = 0;
			temp = index1;
			index1 = index2;
			index2 = temp;
		}
		return new int[] { index1 + 1, index2 + 1 };
	}
}

public class Main {

	public static void main(String[] args) {
		int numbers[] = { 2, 3, 4 };
		int target = 6;
		Solution solution = new Solution();
		int a[] = solution.twoSum(numbers, target);
		System.out.println("index1=" + a[0] + ", " + "index2=" + a[1]);
	}
}
