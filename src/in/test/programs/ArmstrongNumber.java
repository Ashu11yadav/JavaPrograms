package in.test.programs;

public class ArmstrongNumber {

	/** Write a java program to check Armstrong number.**/
	
	/** If the number is nth Digit fix **/
	public static void armstrongNumber(String number) {
		
		int newNumber=1;		
		String[] numberArray= number.split("");
		
	  for (int i = 0; i < numberArray.length; i++) {
		  newNumber+=Integer.parseInt(numberArray[0])^3;
	}
		
	  if(number.endsWith(String.valueOf(newNumber)))
			  System.out.println("Voolaaa !! Number is Armstrong :) ");
	  else
		  System.out.println("OOpss !! Number is not Armstrong :(  ");
		
	}
	
}
