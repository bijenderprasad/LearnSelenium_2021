package SearchingAndSorting;

import java.util.Arrays;

public class binarySearch {

	public static void main(String[] args) {

		int[] sorted = { 1, 3, 5, 7, 9, 11, 15, 17 };
		int key = 15;
		int op = binarySearchUsingMethod(sorted,key);
		if(op==-1) {
			System.out.println("Key is not available in array");
		}
		else
		System.out.println("Ki is available:" + op);
		int first = 0;
		int last = sorted.length;
		int mid = (first + last) / 2;
		System.out.println(first + " " + last + " " + mid);
		
		

		for (int i = 0; i < mid+1; i++) {
			if (sorted[mid] == key) {
				System.out.println("Key is available on place: " + mid);
				break;
			}

			else if (sorted[mid] > key) {

				last = mid - 1;
				mid = (first + last) / 2;

				if (sorted[mid] == key) {
					System.out.println("Key is available on place: " + mid);
					break;
				}
			}

			else if (sorted[mid] < key) {
				first = mid + 1;
				mid = (first + last) / 2;

				if (sorted[mid] == key) {
					System.out.println("Key is available on place: " + mid);
					break;
				}
			}
			
			else
				System.out.println("Element is not in array");
		}

	}

	public static int binarySearchUsingMethod(int[] a, int key) {
		int mid;
		int first = 0; int last = a.length;
		while(first<=last) {
			mid = (first + last) / 2;
			if(a[mid]==key) {
				return mid;
			
				
			}
			
			else if (a[mid]>key) {
				last = mid - 1;
			}
			
			else 
				first = mid + 1; 
		}
		return -1;
	}
	
	
}
