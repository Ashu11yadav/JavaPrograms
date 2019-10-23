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

		while (left < right ) {

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
	
	
	 public boolean canConstruct(String ransomNote, String magazine) {
	        
	        if((ransomNote.isEmpty() && magazine.isEmpty())|| ransomNote.isEmpty() && !magazine.isEmpty())
	            return true;        
	        else if(ransomNote.isEmpty())
	            return false;        
	        else if(magazine.isEmpty())
	            return  false;
	        
	        int f=0;
	        for(int i=0;i <magazine.length();i++){
	            if( f<=ransomNote.length()-1 && magazine.charAt(i)==ransomNote.charAt(f) )
	                f++;
	        }
	        
	        if(f>0 && f==ransomNote.length())
	            return true;
	            else
	            return false;
	        
	    }
}
