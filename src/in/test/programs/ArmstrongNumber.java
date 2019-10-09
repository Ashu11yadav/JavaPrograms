package in.test.programs;



public class ArmstrongNumber {

	/** Write a java program to check Armstrong number.**/
	
	/** If the number is nth Digit fix **/
	public static void armstrongNumber_1(String number) {
		
		int newNumber=0;		
		String[] numberArray= number.split("");
		
	  for (int i = 0; i < numberArray.length; i++) {
		  int numb=Integer.parseInt(numberArray[i]);
	
		  newNumber+=(numb*numb *numb);
		  System.out.println(""+(numb*numb *numb));
	}
		
	  if(number.equalsIgnoreCase(String.valueOf(newNumber)))
			  System.out.println("Voolaaa !! Number is Armstrong :) ");
	  else
		  System.out.println("OOpss !! Number is not Armstrong :(  ");
		
	}
	
	
	public static void armStrongNumber_2(String number) {
		
		int resultant= 0;
		
		for(int i =0; i<number.length();i++) {
			int charAct= Integer.parseInt(number.charAt(i)+"");
			resultant+= charAct*charAct*charAct;
		}
		
		if(number.equals(String.valueOf(resultant))) {
			System.out.println(resultant+"is ArmsStrong Numnber");
		}else {
			System.out.println(resultant+"is Not an ArmStrong Number");
		}
	}
	
	
}
