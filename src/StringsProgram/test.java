package StringsProgram;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
		System.out.println(sdf.format(date));
		System.out.println(java.time.LocalDate.now());  
		
	}

}
