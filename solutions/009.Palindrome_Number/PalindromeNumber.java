public class Solution {
	public static void main(String[] args) {
		Solution sl = new Solution();
		System.out.println(sl.isPalindrome(12321));
	}

	public boolean isPalindrome(int x) {
		int sum = 0;
		int temp = x;
		while (temp > 0) {
			sum = sum * 10 + temp % 10;
			temp = temp / 10;
		}
		return sum == x;
	}
}