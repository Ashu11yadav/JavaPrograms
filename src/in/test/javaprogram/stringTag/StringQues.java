package in.test.javaprogram.stringTag;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import com.sun.xml.internal.ws.util.StringUtils;

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

	/**
	 * 125. Valid Palindrome
	 * 
	 * Given a string, determine if it is a palindrome, considering only
	 * alphanumeric characters and ignoring cases.
	 * 
	 * Note: For the purpose of this problem, we define empty string as valid
	 * palindrome.
	 * 
	 * Example 1:
	 * 
	 * Input: "A man, a plan, a canal: Panama" Output: true Example 2:
	 * 
	 * Input: "race a car" Output: false
	 **/
	public static boolean isPalindrome(String s) {

		s = s.replaceAll(" ", "");
		s = s.replaceAll("[^a-zA-Z0-9]", "");

		if (s.isEmpty())
			return true;

		int maxI = (s.length() - 1);
		boolean is = false;
		int i = 0;

		while (i <= maxI) {
			if ((s.charAt(i) + "").equalsIgnoreCase(s.charAt(maxI) + "")) {
				i++;
				maxI--;
				is = true;
			} else {
				is = false;
				break;
			}
		}

		System.out.println(is);

		return is;
	}

	/*
	 * 344. Reverse String Write a function that reverses a string. The input string
	 * is given as an array of characters char[].
	 * 
	 * Do not allocate extra space for another array, you must do this by modifying
	 * the input array in-place with O(1) extra memory.
	 * 
	 * You may assume all the characters consist of printable ascii characters.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: ["h","e","l","l","o"] Output: ["o","l","l","e","h"] Example 2:
	 * 
	 * Input: ["H","a","n","n","a","h"] Output: ["h","a","n","n","a","H"]
	 */
	public void reverseString(char[] s) {

		int l = (s.length - 1);
		int i = 0;

		while (i <= l && l >= 0) {
			char t = s[i];
			s[i] = s[l];
			s[l] = t;

			i++;
			l--;
		}

	}

	/**
	 * 345. Reverse Vowels of a String Write a function that takes a string as input
	 * and reverse only the vowels of a string.
	 * 
	 * Example 1:
	 * 
	 * Input: "hello" Output: "holle" Example 2:
	 * 
	 * Input: "leetcode" Output: "leotcede" Note: The vowels does not include the
	 * letter "y".
	 **/
	public static String reverseVowels(String s) {

		int left = 0;
		int right = (s.length() - 1);
		String vowels = "aeiouAEIOU";
		char[] c = s.toCharArray();

		while (left < right) {

			while (left < right && !vowels.contains(c[left] + ""))
				left++;

			while (left < right && !vowels.contains(c[right] + ""))
				right--;

			char temp = c[left];
			c[left] = c[right];
			c[right] = temp;

			left++;
			right--;
		}

		System.out.print(c);
		return String.valueOf(c);

	}

	/*
	 * 383. Ransom Note Given an arbitrary ransom note string and another string
	 * containing letters from all the magazines, write a function that will return
	 * true if the ransom note can be constructed from the magazines ; otherwise, it
	 * will return false.
	 * 
	 * Each letter in the magazine string can only be used once in your ransom note.
	 * 
	 * Note: You may assume that both strings contain only lowercase letters.
	 * 
	 * canConstruct("a", "b") -> false canConstruct("aa", "ab") -> false
	 * canConstruct("aa", "aab") -> true
	 */
	public static boolean canConstruct(String ransomNote, String magazine) {

		int[] arr = new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			System.out.println("magazine.charAt(i):" + magazine.charAt(i) + ", 'a': " + 'a'
					+ ", magazine.charAt(i) - 'a'" + (magazine.charAt(i) - 'a') + ", arr[magazine.charAt(i) - 'a']++: "
					+ arr[magazine.charAt(i) - 'a']++);

			arr[magazine.charAt(i) - 'a']++;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("i:" + i + ", arr[" + i + "]: " + arr[i]);
		}

		for (int i = 0; i < ransomNote.length(); i++) {

			System.out.println("ransomNote.charAt(i): " + ransomNote.charAt(i) + "-" + 'a'
					+ ", ransomNote.charAt(i) - 'a': " + (ransomNote.charAt(i) - 'a'));
			if (--arr[ransomNote.charAt(i) - 'a'] < 0) {
				return false;
			}
		}
		return true;

	}

	/*
	 * 387. First Unique Character in a String Given a string, find the first
	 * non-repeating character in it and return it's index. If it doesn't exist,
	 * return -1.
	 * 
	 * Examples:
	 * 
	 * s = "leetcode" return 0.
	 * 
	 * s = "loveleetcode", return 2. Note: You may assume the string contain only
	 * lowercase letters.
	 */
	public static int firstUniqChar(String s) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), (map.getOrDefault(s.charAt(i), 0) + 1));
		}

		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == 1)
				return i;
		}

		return -1;
	}

	/*
	 * 415. Add Strings Given two non-negative integers num1 and num2 represented as
	 * string, return the sum of num1 and num2.
	 * 
	 * Note:
	 * 
	 * The length of both num1 and num2 is < 5100. Both num1 and num2 contains only
	 * digits 0-9. Both num1 and num2 does not contain any leading zero. You must
	 * not use any built-in BigInteger library or convert the inputs to integer
	 * directly.
	 */
	public static String addStrings(String num1, String num2) {

		int l1 = (num1.length() - 1);
		int l2 = (num2.length() - 1);

		char[] n1 = num1.toCharArray();
		char[] n2 = num2.toCharArray();

		String sum = "";
		boolean carry = false;

		for (int i = l1, j = l2; i >= 0 || j >= 0 || carry; i--, j--) {

			int n1Int = 0;
			int n2Int = 0;

			if (i >= 0)
				n1Int = Integer.parseInt(n1[i] + "");

			if (j >= 0)
				n2Int = Integer.parseInt(n2[j] + "");

			if (carry) {

				if (n1Int + n2Int + 1 > 9) {
					sum = ((n1Int + n2Int + 1) % 10) + sum;
					carry = true;
				} else {
					sum = (n1Int + n2Int+1) + sum;
					carry = false;
				}
			} else if (n1Int + n2Int > 9) {
				sum = ((n1Int + n2Int) % 10) + sum;
				carry = true;
			} else {
				sum = (n1Int + n2Int) + sum;
				carry = false;
			}

		}

		return sum;

	}

}
