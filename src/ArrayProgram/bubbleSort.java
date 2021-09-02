package ArrayProgram;

public class bubbleSort {

	public static void main(String[] args) {
		int arr [] = {4,3,2,5,3,1,8,1,1,2,3};
		int count = 0;
		System.out.println("Before bubble sort:");
		for (int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println("");
		System.out.println("==============================");
		System.out.println("After bubble sort:");
		
		for (int i = 0 ; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length;j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
					count++;
				}
			}
		}
		
		for (int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println("");
		System.out.println("Number of iteration:" + count);
		
		
	}

}
