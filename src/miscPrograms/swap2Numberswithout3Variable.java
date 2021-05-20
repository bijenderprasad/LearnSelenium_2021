package miscPrograms;

public class swap2Numberswithout3Variable {

	public static void main(String[] args) {
	
		int fn = 10;
		int sn = 78;
		swap2Numberswithout3Variablemethod(fn,sn);
	}
	
	public static void swap2Numberswithout3Variablemethod(int fn, int sn) {
		System.out.println("before switching 1st number is: " + fn);
		System.out.println("before switching 2nd number is: " + sn);
		fn = fn + sn ;
		sn = fn - sn;
		fn = fn - sn;
		
		System.out.println("before switching 1st number is: " + fn);
		System.out.println("before switching 2nd number is: " + sn);
		
	}

}
