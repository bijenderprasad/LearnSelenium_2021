package miscPrograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFunction {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sd = new SimpleDateFormat("ddMMyyyy");
		System.out.println(sd.format(d));

	}

}
