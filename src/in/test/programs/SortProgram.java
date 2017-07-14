package in.test.programs;

public class SortProgram {
	
	/*Sort Types */
	/**
	 1. Bubble Sort
	 2.Selection Sort
	 3. Insertion Sort
	 * 
	 ***/
	
	/**Write a java program to sort an array elements using bubble sort algorithm.
     Input: 18 9 33 4 84 32
     Output: 4 9 18 32 33 84 **/ 
	public static void bubbleSortFunc(int[] arr){
		
		 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]){
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for (int s = 0; s < arr.length; s++) {
			System.out.println("Sorted Element: " + arr[s]);	
		}
		
		
		
	}

}
