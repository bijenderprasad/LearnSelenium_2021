package SearchingAndSorting;

public class mergeSortProgramming {

	public static void main(String[] args) {
	
		int[] arr = {10,3,5,1,6,9,2,7,4};
		sort(arr , 0 , arr.length-1);
		for (int x : arr) {
			System.out.println(x);
		}
	}
	
	
	public static void  sort(int [] arr,int left,int right) {
		if (left < right) {
			int mid = (left+right)/2;
			sort(arr, left , mid);
			sort(arr, mid+1 , right);
			merging(arr, left, mid, right);
		}	
	}
	
	public static void merging(int arr[], int left, int mid, int right) {
		
		
		int ls = mid - left + 1;
		int rs = right - mid ;
		
		int[] left_arr = new int [ls];
		int[] right_arr = new int [rs];
		
		for (int  i = 0 ; i < ls ; i++) {
			left_arr[i] = arr[left + i];
		}
		
		for (int  j = 0 ; j < rs ; j++) {
			right_arr[j] = arr[mid + 1 + j];
		}
		
		int i = 0 ; int j = 0;
		int k = left;
		
		while (i < ls && j < rs) {
			if (left_arr[i] < right_arr[j]) {
				arr[k] = left_arr[i];
				i++;
			}
			else {
				arr[k] = right_arr[j];
				j++;
			}
			k++;
		}
		
		while (i < ls) {
			arr[k] = left_arr[i];
			i++;
			k++;
		}
		
		while (j < rs) {
			arr[k] = right_arr[j];
			j++;
			k++;
		}
		
	}

}
