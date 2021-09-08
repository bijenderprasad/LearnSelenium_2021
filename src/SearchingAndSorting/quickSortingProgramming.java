package SearchingAndSorting;

public class quickSortingProgramming {

	public static void main(String[] args) {
	int[] arr =  {3,1,5,8,4,7,9};
	quickSort(arr, 0, arr.length-1);
	
	for (int x : arr) {
		System.out.println(x);
	}

	}
	
	public static void quickSort(int arr[], int left, int right) {
		int mid = merging(arr, left, right);
		System.out.println(mid);
		
				if (left < mid-1) {
					quickSort(arr, left, mid-1);
				}
		
				if (mid < right) {
					quickSort(arr, mid, right);
				}
	}
	
	public static int merging(int arr[], int left, int right) {
		//int pivot = arr[left];
		int pivot = arr[(left+right) / 2]; 
		System.out.println(pivot);
		while (left <= right) {
			while (arr[left] < pivot) left++;
			while (arr[right] > pivot) right--;
			
			if (left <= right) {
				int tmp = arr[left];
				arr[left] = arr[right];
				arr[right] = tmp;
				left++;
				right--;
			}
			
		}
		
		return left;
		
	}

}
