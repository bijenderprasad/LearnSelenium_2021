package StringsProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class charCountInString {

//create an array of 256 size and then convert char to ASCAII value and 
	//increase that index and last convert int to char
	
	public static void main(String[] args) {
	
	String input = "uvgckcstbvyuvtybjdhtvbyiubytg";
	int i, length, counter[] = new int[256];
	char[] one = input.toCharArray();
	//display(one);
	
	getCountUsingCollection(input);
	
	int[] count = new int[input.length()];
	length = input.length();
	for (i = 0; i < length; i++) {
		int num = (int) input.charAt(i);
		counter[num]++;
		}
	

	for (i = 0; i < 256; i++) {
	if (counter[i] != 0) {
	System.out.println((char) i + " --> " + counter[i]);
	}

	}
	}

	public static void display(char[] dis) {
		for (char x : dis) {
			System.out.print(x);
		}
	}
	
	
	public static void getCountUsingCollection(String str) {
		System.out.println("Count using collection");
		System.out.println();
		
		char[] ch = str.toCharArray();
		HashMap<Character,Integer> obj = new HashMap<Character,Integer>();
		
		for (char c : ch) {
			if(obj.containsKey(c)){
				obj.put(c,obj.get(c)+1);
			}
			else
				 obj.put(c, 1);
		}
		
		for (Map.Entry entry : obj.entrySet() ) {
			System.out.println("char:" + entry.getKey() + " and value: "+ entry.getValue());
		}
		System.out.println("*****************************************");
	}
}	
