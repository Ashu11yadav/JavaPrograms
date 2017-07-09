package in.test.programs;

public class Programs {
	
	            /*** Palindrome  Function Start ***/
	public void callPalindromFunc(String value) {

		boolean isPalindrom = false;
		if (Integer.parseInt(value) == reverseNumber(value))
			isPalindrom = true;
		else
			isPalindrom = false;

		System.out.println(isPalindrom ? "Number is Palindrom" : "Number is not Palindrom");

	}

	/** Reverse Function **/
	public int reverseNumber(String number) {

		int r = 0,rm=0;
		int n = Integer.parseInt(number);
		while (n != 0) {
			rm=n%10;
			r = (r * 10) +rm;
			n = n / 10;
		}
		System.out.println("reverse:" + r);
		return r;

	}
	/*** Palindrom Function End ***/


	
	/***Factorial Function Start ****/
	public void FactorialFunc(String value) {

		int facV = 1;

		for (int i = Integer.parseInt(value); i >= 1; i--) {
			facV = facV * i;
		}

		System.out.println(facV);

	}

	public int recursiveFac(int value) {
		
		int factV = 1,v=0;
		while (value != 0) {
			v=recursive(value);
			factV =factV *v;
			value=v;
	
		}
		return factV;
	}
	
	
	public int recursive(int value){
		
		return value-1;
	}

	/*** Factorial Function End ***/
	
}
