public class Solution {
	public static void main(String[] args) {
		Solution sl = new Solution();
		System.out.println(sl.reverse(-123));
	}

	public int reverse(int x) {
		StringBuffer temp = new StringBuffer();
		temp.append(Math.abs(x));
		try {
			temp = temp.reverse();
			return x > 0 ? Integer.valueOf(temp.toString()) : Integer
					.valueOf("-" + temp.toString());
		} catch (Exception ex) {
			return 0;
		}
	}
}