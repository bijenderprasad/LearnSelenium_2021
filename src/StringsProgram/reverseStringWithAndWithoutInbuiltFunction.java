package StringsProgram;

class reverseStringWithAndWithoutInbuiltFunction {

	static String name = "bijender";
	
	public static void main(String[] args) {
		//reverseString(name);
		System.out.println(revString(name));
	}
	
	
	
	
	
	public static void reverseString(String name) {
		String reverse = "";
		int len = name.length();
		for (int i = len-1 ; i >=0 ; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println("Reverse String = "+ reverse);
	}
	
	
	
	
	
	
	
	
	public static int facto(int num) {
		if (num == 0)
			return 1;
			else
		return num * facto(num-1);
	}
	
	//Reverse a string without loop and length function.
	public static String revString(String name) {
		
		if (name.isEmpty()){
			 
			 return name;
			}
			
			return revString(name.substring(1)) + name.charAt(0);
	}
	
	
}
