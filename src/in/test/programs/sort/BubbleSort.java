package in.test.programs.sort;

import java.util.Arrays;

public class BubbleSort {
	
	

	public static void bubbleSort_1(int[] number) {
		
		int temp =0;
		
		for(int i=0; i<number.length-1;i++) {
			for(int j=0;j<number.length-i-1;j++) {
				if(number[j]>number[j+1]) {
					 temp=number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
				}
			}
			
			System.out.println("Row:"+i+", "+Arrays.toString(number));
		}
		
		
		System.out.println("Sorted Bubble Element> ");
		for (int numb : number) {
			System.out.println(numb);
		}
		
	}
	
	/**Optimized Version**/
	public static void bubbleSort_2(int[] number) {
		
		boolean swap = false;
		
		for(int i=0;i<number.length-1;i++) {
			swap=false;
			for(int j=0;j<number.length-i-1;j++) {
				if(number[j]>number[j+1]) {
					int temp= number[j+1];
					number[j+1]=number[j];
					number[j]=temp;
					swap=true;
				}
				
				
			}
			
			System.out.println("Row:"+i+", "+Arrays.toString(number));
			
			if(swap==false)
				break;
		}
		
		System.out.println("Sorted Bubble Element> ");
		for (int numb : number) {
			System.out.println(numb);
		}
		
	}

}
