package miscPrograms;

public class fibonacci {

	public static void main(String[] args) {
		int first = 0;
		int sec = 1;
		int sum = 0;
		int len = 10;

	/*	for (int i = 0; i < len; i++) {
			System.out.print(first + " ");
			int temp;
			temp = sec;
			sec = sum;
			sum = sum + temp;
			first = sum;

		}*/

		for(int i = 0; i < len; i++){
			System.out.print(fibonacciRecursion(i) +" ");
		}
	}
	

		public static int fibonacciRecursion(int n){
			if(n == 0){
				return 0;
			}
			if(n == 1 || n == 2){
					return 1;
				}
			return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}

}
