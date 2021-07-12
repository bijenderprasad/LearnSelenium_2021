package StringsProgram;

public class verifyPasswordProgram {

	public static void main(String[] args) {
		// WAP to verify Password of min length 8 and max length 12, minimum one
		// uppercase
		// and lowercase character, min one special character.
		// A = 65 and Z = 90 // a = 97 and z = 122
		int cha = 'q';
		boolean u = false;
		boolean l = false;
		boolean s = false;
		String password = "Password4";
		int passwordlength = password.length();
		char[] special = { '<', '&', '@', '_', '!', '#', '$', '&', '-' };

		if (passwordlength >= 8 && passwordlength < 13) {
			char[] pass = password.toCharArray();
			for (int i = 0; i < pass.length; i++) {
				int value = pass[i];
				if (value >= 65 && value < 91) {
					u = true;
				}
				if (value >= 97 && value < 123) {
					l = true;
				}
				for (int j = 0; j < special.length; j++) {
					if (pass[i] == special[j]) {
						s = true;
					}
				}

			}

		}

		else
			System.out.println("Incorrect Password format: "
					+ "Hint: Password length should be between 8-12 and mush have one uppercase, one lowercase and one special character");

		if (u == true && l == true && s == true) {
			System.out.println("Correct password format");
		} else
			System.out.println("InCorrect password format");
	}

}
