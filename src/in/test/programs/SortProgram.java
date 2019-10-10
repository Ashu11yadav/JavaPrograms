package in.test.programs;

public class SortProgram {

	/* Sort Types */
	/**
	 * 1. Bubble Sort 2.Selection Sort 3. Insertion Sort
	 * 
	 ***/

	/**
	 * Write a java program to sort an array elements using Selection Sort. > We
	 * can create a java program to sort array elements using selection sort. In
	 * selection sort algorithm, we search for the lowest element and arrange it
	 * to the proper location. We swap the current element with the next lowest
	 * number.
	 * 
	 * Or
	 * 
	 * Given a list, take the current element and exchange it with the smallest
	 * element on the right hand side of the current element
	 * 
	 * Author: Tanuj Sareen
	 **/
	public static void selectionSortFunc(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int s = 0; s < arr.length; s++) {
			System.out.println("Sorted Element: " + arr[s]);
		}

	}
	
	public String getSpecialReverse(String str){

		String strings="";
		for(int i=str.length();i>=0;i--){
			if(i==0 ){
				strings+=str.charAt(i);
			}else
		if(!strings.contains(""+str.charAt(i-1)) )
			strings+=str.charAt(i-1);
		}
		
		return strings;
	}


	/**
	 * 
	 * Write a java program to sort an array elements using bubble sort > We can
	 * create a java program to sort array elements using bubble sort. Bubble
	 * sort algorithm is known as the simplest sorting algorithm. In bubble sort
	 * algorithm, array is traversed from first element to last element. Here,
	 * current element is compared with the next element. If current element is
	 * greater than the next element, it is swapped.
	 * 
	 * algorithm Input: 18 9 33 4 84 32 Output: 4 9 18 32 33 84
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Author: Tanuj Sareen
	 **/
	public static void bubbleSortNewFunct(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int s = 0; s < arr.length; s++) {
			System.out.println("Sorted Element: " + arr[s]);
		}
	}

	/**
	 * Write a java program to sort an array elements using Insertion sort. > We
	 * can create a java program to sort array elements using insertion sort.
	 * Insertion is good for small elements only because it requires more time
	 * for sorting large number of elements.
	 * 
	 * Or
	 * 
	 * Given a list, take the current element and insert it at the appropriate
	 * position of the list, adjusting the list every time you insert. It is
	 * similar to arranging the cards in a Card game.
	 * 
	 * {6,5,1,8,7,2,4}
	 **/
	public static void insertionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

	/**
	 * Ashu Bubble sort
	 * 
	 **/
	public static void bubbleSortNewFunc(int[] value) {
		for (int j = 0; j < value.length - 1; j++) {
			for (int i = 0; i < value.length; i++) {
				if (i != value.length - 1) {
					if (value[i] > value[i + 1]) {
						int k = 0;
						k = value[i];
						value[i] = value[i + 1];
						value[i + 1] = k;
					}
				}
			}
		}

		for (int i = 0; i < value.length; i++)
			System.out.println(value[i]);
	}
	
	
	
	
	

}
