package StringsProgram;

public class countOneInString {

	public static void main(String[] args) {
		String inp = "22222111111000000";
		int count = 0 ; 
		for (int  i = 0 ; i < inp.length()-1; i++) {
			if (inp.charAt(i)=='1') {
				count++;
			}
		}
		//System.out.println(count);
		
		isNumberOddOrEven(1374);

	}
	
	
	public static void isNumberOddOrEven(int num) {
	Boolean flag = true;
	
	for (int i = 1 ; i <= num ; i++) {
		flag = !flag;
	}
	
	if (flag) {
		System.out.println("Even");
	}
	else
		System.out.println("odd");
		
	}

}
