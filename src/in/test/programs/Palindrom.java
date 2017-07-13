package in.test.programs;

public class Palindrom {
	
    /*** Palindrome  Function Start ***/
public static void callPalindromFunc(String value) {

boolean isPalindrom = false;
if (Integer.parseInt(value) == reverseNumber(value))
	isPalindrom = true;
else
	isPalindrom = false;

System.out.println(isPalindrom ? "Number is Palindrom" : "Number is not Palindrom");

}

/** Reverse Function **/
public static int reverseNumber(String number) {

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

}
