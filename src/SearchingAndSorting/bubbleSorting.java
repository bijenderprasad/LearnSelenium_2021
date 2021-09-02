package SearchingAndSorting;

public class bubbleSorting {

	public static void main(String[] args) {
		int count = 0;
	
	int[] arr = {5,4,3,5,6,0,0,0,3,4,6,3,2,1};
	
	for (int  i = 0 ; i < arr.length; i++) {
		count++;
		for (int  j = 0 ; j < arr.length-1; j++) {
			if (arr[j+1] < arr[j]) {
				
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
				
			}
		}
	}
	
	
	for (int x : arr) {
		System.out.println(x);
	}
	
	System.out.println("Count = " + count);

	}

}
