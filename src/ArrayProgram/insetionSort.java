package ArrayProgram;

public class insetionSort {

	public static void main(String[] args) {
		int arr [] = {6,2,8,5};
		System.out.println("Before insertion sort");
		displayArray(arr);
		doInsertionSort(arr);
		 System.out.println();   
		System.out.println("After insertion sort");
		displayArray(arr);

	}

	
	
	public static void displayArray(int[] arr) {
		for (int x : arr) {
			System.out.print(x+" ");
		}
	}
	
	public static void doInsertionSort(int[] arr) {
		int len = arr.length;
		for (int j = 1 ; j < len ; j++) {
			int key = arr[j];
			 int i = j-1;  
			 while (i>-1 && arr[i]>key) {
				 arr[i+1]=arr[i];
				 i--;  
	            }  
	            arr[i+1] = key;  
	     
			 }
			
			
		}
		
		
	
}
