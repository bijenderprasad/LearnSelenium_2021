package StringsProgram;

class test {

	public static void main(String[] args) {
		String name = "dcbabaaaaa  a";

		sorting(name.toLowerCase().replaceAll("\\s", ""));
	}

	public static void countFrequency(String name) {
		int max = 0 ;
		char[] arr = name.toCharArray();
		int[] count = new int[256];

		for (int i = 0; i < name.length(); i++) {
			int index = ((char) name.charAt(i));
			count[index]++;
		}
		
		for (int i = 0; i < count.length; i++) {
			
			if (count[i] > max) {
				max = count[i];
			}
		}
		System.out.println("Max count is "+max);

		for (int i = 0; i < count.length; i++) {
				if (count[i] != 0) {
				System.out.println(((char) i) + " is repated: " + count[i] + " times");
			}
		}
	}

	public static void sorting(String name) {
		char[] arr = name.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				char temp;
				if ((int) (arr[j]) > (int) (arr[j + 1])) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		System.out.println("Given Name in sorted order: ");
		for (char x : arr) {
			System.out.print(x + " ");
		}
		System.out.println("");
		countFrequency(name);
	}

}