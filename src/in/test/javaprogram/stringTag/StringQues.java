package in.test.javaprogram.stringTag;

public class StringQues {

	public StringQues() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * 58. Length of Last Word
	 * 
	 * Given a string s consists of upper/lower-case alphabets and empty space
	 * characters ' ', return the length of last word in the string.
	 * 
	 * If the last word does not exist, return 0.
	 * 
	 * Note: A word is defined as a character sequence consists of non-space
	 * characters only.
	 * 
	 * Example:
	 * 
	 * Input: "Hello World" Output: 5
	 * 
	 */
	public static int lengthOfLastWord(String s) {

		if (s.length() == 0)
			return 0;

		String[] strs = s.split(" ");

		if (strs.length > 0) {
			String lastWord = strs[strs.length - 1];
			return lastWord.length();
		}

		return 0;
	}


	/*
	 * 67. Add Binary
	 * 
	 * Given two binary strings, return their sum (also a binary string).
	 * 
	 * The input strings are both non-empty and contains only characters 1 or 0.
	 * 
	 * Example 1:
	 * 
	 * Input: a = "11", b = "1" Output: "100" Example 2:
	 * 
	 * Input: a = "1010", b = "1011" Output: "10101"
	 */
	public static String addBinary_accepted(String a, String b) {

		StringBuilder sb = new StringBuilder();
		int i = a.length() - 1, j = b.length() - 1, carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (j >= 0)
				sum += b.charAt(j--) - '0';
			if (i >= 0)
				sum += a.charAt(i--) - '0';
			sb.append(sum % 2);
			carry = sum / 2;
		}
		if (carry != 0)
			sb.append(carry);
		return sb.reverse().toString();

	}

}
