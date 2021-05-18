package StringsProgram;

public class stringCount {

	public static void main(String[] args) {
		String name = "bijender";
		findOutTheStringLength(name);
		System.out.println(getLengthOfString(name));
	}

	public static void findOutTheStringLength(String name) {
		int stringlength = 0;
		char[] count = name.toCharArray();
		for (int x : count) {
			stringlength++;
		}
		System.out.println(stringlength);
	}

	public static int getLengthOfString(String name) {
		int i = 0;
		try {
			for (i=0;; i++) {
				name.charAt(i);
			}

		} catch (Exception e) {

		}
		return i;

	}

}