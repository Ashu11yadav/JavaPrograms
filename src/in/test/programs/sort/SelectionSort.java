package in.test.programs.sort;

public class SelectionSort {

	public SelectionSort() {
		// TODO Auto-generated constructor stub
	}
	
	public static void selectionSort_1(int[] number) {
		
		int l=number.length;
		 int position=0;
		for(int i=0;i<=l-1;i++) {

			position= i;
			
			for(int j=i+1;j<=l-1;j++) {
				if(number[j]<number[position]) 
					position=j;		
			}
			
			int temp=number[i];
			number[i]=number[position];
			number[position]=temp;
			
			
		}
		
		System.out.println("Selection Sort Elements: ");
		for (int numb : number) {
			System.out.println(numb);
		}
		
		
	}

}
