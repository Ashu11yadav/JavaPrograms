package in.test.javaprogram;

import java.util.Scanner;

import in.test.javaprogram.linkedListProg.LinkedListCollections;
import in.test.javaprogram.linkedListProg.ListNode;
import in.test.javaprogram.stringvalid.StringValidation;
import in.test.programs.ArmstrongNumber;
import in.test.programs.Factorial;
import in.test.programs.MaxSubArray;
import in.test.programs.Palindrom;
import in.test.programs.RemoveDuplicates;
import in.test.programs.sort.SelectionSort;

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
		builder.append("8. String Validation \n");
		builder.append("9. Linked List Program Collections \n");
		builder.append("10. Remove Duplicate elements from Array & Print Count \n");
		builder.append("11. Maximum Subarray \n");

		System.out.println(builder.toString());

		Scanner scanner = new Scanner(System.in);
		int selection = scanner.nextInt();

		switch (selection) {
		case 1:
			/** 371 is an Armstrong number since : 3**3 + 7**3 + 1**3 = 371 **/
			ArmstrongNumber.armStrongNumber_2("371");
			break;
		case 2:
			/** Factorial of 5 : 5*4*3*2*1 = 120 **/
			Factorial.Factorial_2("5");
			break;
		case 3:
			/** Palindrome of 1991 is 1991 (Reverse) **/
			Palindrom.callPalindromFunc_2("1991");
			break;
		case 4:
			/** Sort Program **/
			int[] number = { 8, 6, 3, 1, 2, 5 };

			SelectionSort.selectionSort_1(number);
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println(StringValidation.isValid("()"));
			break;
		case 9: {

			LinkedListCollections.mergeTwoLists(new ListNode(1), new ListNode(1));
		}
			break;
		case 10: {
			int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 5 };
			RemoveDuplicates.removeDuplicates(nums);
		}
			break;

		case 11: {

			int[] nums = {-2,-1,-3};
			MaxSubArray.maxSubArray(nums);
		}

		}

		scanner.close();

	}

}