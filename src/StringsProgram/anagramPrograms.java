package StringsProgram;

import java.util.Arrays;

public class anagramPrograms {

	public static void main(String[] args) {
	String one = "Mother In Law";
	String two = "Hitler Woman";
	//isAnagramUsingJavaInbuiltFunctions(one,two);
	isAnagramWithoutUsingJavaInbuiltFunctions(one,two);

	}
	
	public static void isAnagramUsingJavaInbuiltFunctions(String one, String two) {
		//here we are using array , then sort and compare
		
		String o = one.replaceAll("\\s", "").toLowerCase();
		String t = two.replaceAll("\\s", "").toLowerCase();
		System.out.println(o);
		System.out.println(t);

		if (o.length() != t.length()) {
			System.out.println("String is not anagram");
		}

		else {
			char[] o1 = o.toCharArray();
			char[] t1 = t.toCharArray();
			Arrays.sort(o1);
			Arrays.sort(t1);
			if (Arrays.equals(o1, t1)) {
				System.out.println("Strings are anagram");
			} else
				System.out.println("Strigns are not anagram");
		}
	}



	public static void isAnagramWithoutUsingJavaInbuiltFunctions(String one, String two) {
		//this function will use 2 loop, will compare 1st string with 2nd and if found will delete 
		//char one by one. at the end if 2nd string become smpty then it is anagram
		
		String o = one.replaceAll("\\s", "").toLowerCase();
		String t = two.replaceAll("\\s", "").toLowerCase();
		System.out.println(o);
		System.out.println(t);
		if (o.length() != t.length()) {
			System.out.println("String is not anagram");
		}
		else {
			for (int i = 0 ; i < o.length(); i++) {
				for(int j = 0 ; j < t.length(); j++) {
					if(o.charAt(i)==t.charAt(j)) {
						t = t.substring(0, j)+ t.substring(j+1,t.length());
						break;
					}
				}
			}
			
			if(t.length()==0) {
				System.out.println("String is Anagram");
			}
			else
				System.out.println("String is not an Anagram");
		}
		
	}






}
