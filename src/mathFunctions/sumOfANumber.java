package mathFunctions;

public class sumOfANumber {

	public static void main(String[] args) {
	int num = 12345;
	System.out.println(num);
	
	int sum = 0; 
	while (num >0) {
		
		sum = sum + num%10;
		num = num/10;
	}
	
	System.out.println(sum);
	}

}
