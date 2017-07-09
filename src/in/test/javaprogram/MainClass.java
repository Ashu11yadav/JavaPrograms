package in.test.javaprogram;

import in.test.programs.FactorialClass;
import in.test.programs.PalindromClass;

public class MainClass {
	
	public static void main(String[]  args) {
		
		/*PalindromClass init= new PalindromClass();
		init.callPalindromFunc("121");*/
		
		FactorialClass initFact= new FactorialClass();
		System.out.println(initFact.recursiveFac(5));
	}

}
