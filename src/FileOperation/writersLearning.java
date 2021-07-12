package FileOperation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class writersLearning {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy_MM_dd_hh_mm");
		String currentDateTime = sd.format(date);
		
		File f = new File("D:\\FileWriting.txt");
		try {
			//f.createNewFile();
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int i = 0 ; i < 20 ; i++) {
				fw.write(i + ") bijender ");
				bw.newLine();
				bw.flush();
			}
			bw.close();
			fw.close();
		}
		catch(Exception e) {
			System.out.println("hi");
			System.out.println(e.toString());
		}

	}

}
