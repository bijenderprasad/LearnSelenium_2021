package miscPrograms;

public class primeNumberBetweenTwoNumber {

	public static void main(String[] args) {
		int start = 1;
		int stop = 100;
		isPrimeNumber(99);
		findPrimeNumberBetweenTwoNumber(start, stop);
	}

	public static void isPrimeNumber(int num) {
		int half = num / 2;
		for (int i = 2; i <= half; i++) {
			if (num % i == 0) {
				System.out.println("Number is not a prime number");
				break;
			}
		}

		System.out.println("Number is a prime number");
	}

	public static void findPrimeNumberBetweenTwoNumber(int start, int stop) {
		int count = 0;

		for (int i = start; i <= stop; i++) {
			int flag = 1;
			for (int j = 2; j <= start / 2; j++) {
				if (start % j == 0) {
					// System.out.println(start+ " is not a prime number");
					flag = 0;
					break;
				}

			}
			if (flag == 1 && start != 1) {
				System.out.println(start + " is prime number");
				count++;
			}
			start++;
		}
		System.out.println("Total prime within the specified range is-: " + count);

	}

}
