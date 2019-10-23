package in.test.javaprogram;

import java.util.Scanner;

import in.test.javaprogram.linkedListProg.LinkedListCollections;
import in.test.javaprogram.linkedListProg.ListNode;
import in.test.javaprogram.stringFind.StringFind1;
import in.test.javaprogram.stringTag.StringQues;
import in.test.javaprogram.stringvalid.StringValidation;
import in.test.programs.ArmstrongNumber;
import in.test.programs.Factorial;
import in.test.programs.LongestCommonPrefix;
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
		builder.append("12. Longest Common Prefix \n");
		builder.append("13. String Find \n");
		builder.append("14. String Ques. \n");

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
			int[] nums = { -2, -1, -3 };
			MaxSubArray.maxSubArray(nums);
		}
			break;

		case 12: {
			String[] strs = { "flower", "flow", "flight" };
			LongestCommonPrefix.longestCommonPrefix_2(strs);
		}
			break;

		case 13: {
			String haystack = "";
			String needle = "a";
			System.out.println("count:" + StringFind1.strStr(haystack, needle));
		}
			break;

		case 14: {
			/*
			 * String lengthOfLastWord="Hello World"; System.out.println("lengthOfLastWord:"
			 * + StringQues.lengthOfLastWord(lengthOfLastWord));
			 */

			/*
			 * System.out.println("addBinary:" + StringQues.addBinary_accepted(
			 * "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
			 * "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
			 * ));
			 */
			
			/*
			 * String isPalindrome="A man, a plan, a canal: Panama";
			 * StringQues.isPalindrome(isPalindrome);
			 */
			String reverseVowels="Hello";
			StringQues.reverseVowels(reverseVowels);
			
		}
			break;

		}

		scanner.close();

	}

}
