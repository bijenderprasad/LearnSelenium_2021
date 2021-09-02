package CollectionsProgram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fetchingXpathsFromTxtFile {

	public static void main(String[] args) throws IOException {
		String actualLine = "";
		String token = "txtname3";
		FileReader fr = new FileReader("C:\\Users\\nitin\\eclipse-workspace-nitin2\\LearnSelenium2.0\\src\\CollectionsProgram\\testing.txt");
		BufferedReader br = new BufferedReader(fr);
		//String xpath = br.readLine().toString();
		//System.out.println(xpath);
		String xpath = br.readLine();
		while(xpath !=null) {
			
			if (xpath.split(":",3)[0].equalsIgnoreCase(token)) {
				actualLine = xpath.split(":",3)[2];
				break;
			}
			xpath = br.readLine();
		}
		System.out.println(actualLine);
	}
	
	

}
