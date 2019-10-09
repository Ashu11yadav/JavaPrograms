package in.test.javaprogram;

import java.util.Scanner;

import in.test.programs.ArmstrongNumber;
import in.test.programs.Factorial;
import in.test.programs.Palindrom;

public class ProgramSelection {
	
	public static void inputSelection() {
	
	StringBuilder builder = new StringBuilder();
	builder.append("Welcome to Java (Programs :) ) \n");
	builder.append("Please select your Option for study:\n");
	builder.append("1. ArmstrongNumber \n");
	builder.append("2. Factorial \n");
	builder.append("3. Palindrom \n");
	builder.append("4. Sort Program \n");
	builder.append("5. Star Program \n");
	builder.append("6. Number Program \n");
	builder.append("7. Collection Framwork.. Burraaaa (New Feature) !! \n");	
	
	System.out.println(builder.toString());
	
	Scanner scanner= new Scanner(System.in);
	int selection=scanner.nextInt();
	
	switch(selection) {
	case 1:
		/*371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371*/
		ArmstrongNumber.armStrongNumber_2("371");
		break;
	case 2:
		/**Factorial **/
		Factorial.FactorialFunc("5");
		break;
	case 3:
		/**  **/
		Palindrom.callPalindromFunc("1991");
	case 4:
		/** **/
	case 5:
	case 6:
	case 7:
		break;
	
	}
	
	scanner.close();
		
	}

}
