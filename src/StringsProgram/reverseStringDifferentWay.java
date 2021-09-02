package StringsProgram;

import java.util.Arrays;

public class reverseStringDifferentWay {

	public static void main(String[] args) {
		String input = "My name is Bijender";
		
		String[] op = input.split("\\s");
		//display(op);
		//System.out.println();
	//	reverseArray(op);
		//reverseUsingWithoutAttayVariable(input);
		test(input);
	}

	
	public static void display(String[] name) {
		for (String x:name) {
			System.out.print(x + " ");
		}
	}
	
	
	public static void reverseArray(String [] name) {
		String reverse = "";
		for (int i = name.length-1; i >= 0 ; i--) {
			reverse = reverse + name[i] + " "; 
		}
		System.out.println(reverse);
	}
	
	public static void reverseUsingWithoutAttayVariable(String name) {
		int len = name.length();
		String revserse = "";
		for (int  i = len-1 ; i>=0 ; i--) {
			revserse = revserse + name.charAt(i);
		}
		System.out.println(revserse);
	}

	public static void test(String name) {
		int len = name.length();
		String temp = "";
		for (int i = len - 1; i >= 0; i--) {
			if (name.charAt(i) == ' ') {
				System.out.print(temp + " ");
				temp = "";

			}

			if (i == 0) {
				temp = name.charAt(i) + temp;
				System.out.print(temp);
			}

			else {
				if (name.charAt(i) != ' ')
					temp = name.charAt(i) + temp;
			}
		}
	}
}
