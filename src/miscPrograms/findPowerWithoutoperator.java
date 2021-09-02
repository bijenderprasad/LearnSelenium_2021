package miscPrograms;

public class findPowerWithoutoperator {

	public static void main(String[] args) {
	
		//calculate 5^6. 
		
		int num = 5;
		int sum  = num ; 
		int pow = 3;
		int key = num;
		
		for (int i = 1 ; i < pow ;i++) {
			for (int j = 1 ; j < num ;j++) {
				sum += key;
			}
			key = sum;
		}
System.out.println(sum);
	}

}
