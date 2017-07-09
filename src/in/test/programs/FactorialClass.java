package in.test.programs;

public class FactorialClass {

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

}
