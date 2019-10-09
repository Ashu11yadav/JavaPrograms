package in.test.programs;

public class Factorial {

	
	/***Factorial Function Start ****/
	public static void FactorialFunc(String value) {

		int facV = 1;

		for (int i = Integer.parseInt(value); i >= 1; i--) {
			facV = facV * i;
		}

		System.out.println(facV);

	}

	public static int recursiveFac(int value) {
		
		int factV = 1,v=0;
		while (value != 0) {
			v=recursive(value);
			factV =factV *v;
			value=v;
	
		}
		return factV;
	}
	
	
	public static int recursive(int value){
		
		return value-1;
	}

	/*** Factorial Function End ***/
	
	
	
	
	public static void Factorial_2(String number) {
		
		int num=  Integer.parseInt(number);
		int resultant=1;
		
		for(int i=num;i>=1;i--) {
			resultant*=i;
		}
		
		System.out.println("Factorial of :"+number+": "+resultant);
		
		
		
	}
}
