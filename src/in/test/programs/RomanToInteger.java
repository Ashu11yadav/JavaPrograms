package in.test.programs;

import java.util.HashMap;

public class RomanToInteger {

	public RomanToInteger() {
		// TODO Auto-generated constructor stub
	}

	/** 1 t= 3000 **/
	public int romanToInt(String s) {
		
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		 map.put( 1,'I' );
	        map.put( 5,'V' );
	        map.put(10,'X');
	        map.put( 50,'L');
	        map.put( 100,'C');
	        map.put( 500,'D');
	        map.put( 1000,'M');

		int ln = s.length();

		for (int i = 0; i < ln; i++) {

			
		}

		return 0;

	}

}
