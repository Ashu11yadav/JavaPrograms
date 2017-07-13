package in.test.javaprogram;

import in.test.programs.Programs;

public class MainClass {
	
	/**Main Class **/
	public static void main(String[]  args) {
		
		Programs initFact= new Programs();
		System.out.println(initFact.recursiveFac(5));
	}

}
