package StringsProgram;

import java.io.File;

public class fileAndFolderName {

	public static void main(String[] args) {
	String path = "D:\\AI";
	
	String name = System.getProperty("user.dir");
	System.out.println(name);
		File directoryPath = new File(path);
		String [] contents = directoryPath.list();
		for (String x : contents) {
			//System.out.println(x);
			path = path+"\\"+x;
			directoryPath = new File(path);
			String[] deep =  directoryPath.list();
			for (String y : deep) {
			//	System.out.println(y);
			}
			path = "D:\\AI";
		}

	}

}
