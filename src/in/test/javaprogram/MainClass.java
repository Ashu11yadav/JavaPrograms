package in.test.javaprogram;

import in.test.javaprogram.array.ArrayQues;
import in.test.programs.polymorphism.Polymorphism;

public class MainClass {

	/** Main Class **/
	public static void main(String[] args) {

		/* NumberPrintProgram.numberPrintFun3(10); */
		/*
		 * SortProgram program= new SortProgram(); program.getSpecialReverse("abbbaa");
		 */

		/* NumberPrintProgram.numberPrintFun3(10); */

		/* ArrayListExample.callArrayList_Iterator(); */

		/* ProgramSelection.inputSelection(); */
		
		/*
		 * Polymorphism polymorphism= new Polymorphism(); polymorphism.callQuest103();
		 */
		
		int[] nums = {1,3,5,7};
		
		int value= ArrayQues.searchInsert(nums, 5);
		System.out.println(""+value);

	}

}
