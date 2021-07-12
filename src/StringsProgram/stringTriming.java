package StringsProgram;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class stringTriming {

	public static void main(String[] args) {
	String trimthis = "12/07/2014 2:00 PM";
	SimpleDateFormat dd = new SimpleDateFormat("yyyy");
	Date d = new Date();

	System.out.println("Test String = " + trimthis);
	
	String sp[] = trimthis.split(" ")[0].split("/");
	System.out.println(sp[2]);
	String current = dd.format(d);
	//int diff =Integer.parseInt(sp[2].toString()) - Integer.parseInt(current);
	//- Calendar.getInstance().get(Calendar.YEAR);
	
	
	String sp1 = trimthis.split(" ")[1] + " "+trimthis.split(" ")[2] ;
	System.out.println(sp1);
	
	
	}
	
	

}
