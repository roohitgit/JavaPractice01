package practice_codes;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTime {

	public static void main(String[] args) {
		int day, month, year, second, minute, hour;
		
		GregorianCalendar date = new GregorianCalendar();
		
		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year = date.get(Calendar.YEAR);
		minute = date.get(Calendar.MINUTE);
		second = date.get(Calendar.SECOND);
		hour = date.get(Calendar.HOUR_OF_DAY);
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
		System.out.println(minute);
		System.out.println(second);
		System.out.println(hour);

	}

}
