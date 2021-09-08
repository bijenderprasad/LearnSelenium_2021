package StringsProgram;

public class testtest {

	public static void main(String[] args) {
	
		
		String name = "bijender";
		
		char[] arr  = name.toCharArray();
		
		for (int i = 0 ; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
			char temp; 
			if ((int)(arr[j])>(int)(arr[j+1])) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				
			}
			}
		}
		for (char x : arr) {
			System.out.println(x);
		}

	}

}
