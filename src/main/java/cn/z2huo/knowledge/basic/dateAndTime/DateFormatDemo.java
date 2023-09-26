package cn.z2huo.knowledge.basic.dateAndTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
	
	public static void demo() {
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
		System.out.println(calendar.getTime());

		Date date = new Date();
//		System.out.println(date.toString());
		DateFormat dateFormat = DateFormat.getTimeInstance();
//		System.out.println(dateFormat.getTimeZone());
//		DateFormat dateFormat2 = DateFormat.getTimeInstance();
//		DateFormat dateFormat3 = DateFormat.getDateTimeInstance();
//		System.out.println(dateFormat.format(date)+" "+dateFormat2.format(date));
//		System.out.println(dateFormat3.format(date));
//		System.out.println(dateFormat.getCalendar().getTime());
		
		System.out.println(dateFormat.getCalendar().getTime());
	}
	
	public static void demo2() {
		Date date = new Date();
		System.out.println(date.toString()+"\n");
		
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.CHINA);
		DateFormat dateFormat2 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.US);
		
		DateFormat dateFormat3 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.CHINA);
		DateFormat dateFormat4 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.US);
		
		DateFormat dateFormat5 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.CHINA);
		DateFormat dateFormat6 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.US);
		
		DateFormat dateFormat7 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.CHINA);
		DateFormat dateFormat8 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.US);
		
		DateFormat dateFormat9 = DateFormat.getDateInstance();
		System.out.println(dateFormat9.format(date));
		
		System.out.println(dateFormat.format(date));
		System.out.println(dateFormat2.format(date));
		System.out.println();
		System.out.println(dateFormat3.format(date));
		System.out.println(dateFormat4.format(date));
		System.out.println();
		System.out.println(dateFormat5.format(date));
		System.out.println(dateFormat6.format(date));
		System.out.println();
		System.out.println(dateFormat7.format(date));
		System.out.println(dateFormat8.format(date));
	}
	
	public static void demo3() {
		String dateString = "10/10/19";
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		try {
			Date date = dateFormat.parse(dateString);
			System.out.println(date);
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			System.out.println(calendar.get(Calendar.YEAR));
			System.out.println(calendar.get(Calendar.MONDAY));
			System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		demo2();
	}
}
