package in.test.javaprogram.stringFind;

public class StringFind1 {

	public StringFind1() {
		// TODO Auto-generated constructor stub
	}

	public static int strStr(String haystack, String needle) {

		if (needle.isEmpty())
			return 0;

		int n = 0;

		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(n) && n <= needle.length()) {
				return (i+1);
			}

		}

		System.out.println("count:" + -1);
		return  -1 ;

	}

}
