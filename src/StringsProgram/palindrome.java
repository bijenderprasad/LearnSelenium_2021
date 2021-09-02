package StringsProgram;

public class palindrome {

	public static void main(String[] args) {
		String name = "Nitin";
		int num = 1234321;
		
		isStringPalindrome(name.replaceAll("\\s", "").toLowerCase());
		isIntegerPalindrome(num);
	}

	public static void isStringPalindrome(String name) {
		int len = name.length();
		Boolean flag = false;
		int back = len - 1;
		for (int i = 0; i < len / 2 - 1; i++) {
			if (name.charAt(i) == name.charAt(back)) {
				back--;
				flag = true;
			} else
				flag = false;
		}

		if (flag) {
			System.out.println("String is palindrome");
		} else
			System.out.println("String is not palindrome");
	}
	
	
	public static void isIntegerPalindrome(int num) {
		int sum = 0; int a = num; int lastdigi;
		while (a>0) {
			lastdigi = a%10;
			sum = (sum*10) + lastdigi;
			a = a/10;
		}
		if (num==sum) {
			System.out.println("integer is palindrome");
		}
		else
			System.out.println("integer is not palindrome");
	}

}
