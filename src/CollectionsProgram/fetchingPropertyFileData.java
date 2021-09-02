package CollectionsProgram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class fetchingPropertyFileData {

	public static void main(String[] args) throws IOException {
		
		Map m = new HashMap();
		File ff = new File("C:\\Users\\nitin\\eclipse-workspace-nitin2\\LearnSelenium2.0\\src\\CollectionsProgram\\config.properties");
		FileWriter fw = new FileWriter(ff,true);
		
		FileReader f = new FileReader(ff);
		Properties p = new Properties();
		p.load(f);
		System.out.println(p.getProperty("ftp"));
		System.out.println(p.get("ftp"));
		m.putAll(p);
		System.out.println(m);
		p.setProperty("ftp", "10.0.88.99");
		p.store(new FileWriter(ff), "Updated by Bijender");
		

	}

}
