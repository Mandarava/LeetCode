import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	public static void main(String[] args) {
		Solution sl = new Solution();
		System.out.println(sl.myAtoi("-2"));
	}

	public int myAtoi(String str) {
		String ret = "";
		try {
			ret = str.trim();
			Pattern p = Pattern.compile("^[-+]?\\d+");
			Matcher m = p.matcher(ret);
			while (m.find()) {
				ret = m.group();
			}
			BigDecimal num = new BigDecimal(ret);
			if (num.compareTo(new BigDecimal(Integer.MAX_VALUE)) == 1) {
				return Integer.MAX_VALUE;
			} else if (num.compareTo(new BigDecimal(Integer.MIN_VALUE)) == -1) {
				return Integer.MIN_VALUE;
			}
			return Integer.valueOf(ret);
		} catch (Exception ex) {
			return 0;
		}
	}
}
