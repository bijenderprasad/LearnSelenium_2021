package miscPrograms;

public class armstrong {

	public static void main(String[] args) {
		// 123 , length = 3 , 1^3 + 2^3 + 3^3 = 123
		int inputArmstrongNumber = 153;
		int tempNumber, digit, digitCubeSum = 0;

		tempNumber = inputArmstrongNumber;
		while (tempNumber != 0) {
			digit = tempNumber % 10;
			digitCubeSum = digitCubeSum + digit * digit * digit;
			tempNumber /= 10;
			}

		if (digitCubeSum == inputArmstrongNumber)
			System.out.println(inputArmstrongNumber + " is an Armstrong Number");
		else
			System.out.println(inputArmstrongNumber + " is not an Armstrong Number");
	}

}
