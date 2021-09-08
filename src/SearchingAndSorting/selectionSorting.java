package SearchingAndSorting;

public class selectionSorting {

	public static void main(String[] args) {
		int[] arr =  {9,14,3,2,43,11,58,22};    
		int n = arr.length;  
		
		
		
		display (arr);
		for (int i = 1 ; i < n; i++) {
			
			int temp = arr[i];
			int  j= i-1;
			while(  (j >= 0) && (arr[j] > temp) ) {
				arr[j+1] = arr[j];
				j--;
				
			}
			arr[j+1] = temp;
			display(arr);
			
		}
		
	}


		public static void display(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
		
		System.out.println("");
		}
	

}
