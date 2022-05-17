package interviewPrograms;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class GetCurrentDate {
	public static void main(String[] args) {
		SimpleDateFormat f=new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
		Date d=new Date();
		String format = f.format(d);
		System.out.println(format);
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String format2 = dtf.format(now);
		System.out.println(format2);
		
	}

}
