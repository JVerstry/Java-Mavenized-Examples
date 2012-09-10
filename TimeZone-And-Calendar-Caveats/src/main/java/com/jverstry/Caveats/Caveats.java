
package com.jverstry.Caveats;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Caveats {
	
	public static void main(String[] args) {
		
		initializingCalendars();
		printingCalendarDate();
		fromTimeZoneToTimeZone();
		
	}
	
	public static void initializingCalendars() {
		
		TimeZone tz = TimeZone.getTimeZone("GMT+2");
		
		SimpleDateFormat sdf
			= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS z");
		sdf.setTimeZone(tz);	
		
		GregorianCalendar gcal1 = new GregorianCalendar(tz);
		gcal1.setTimeInMillis(System.currentTimeMillis());

		System.out.println(sdf.format(gcal1.getTime()));
		
		Date retr = gcal1.getTime();
		
		GregorianCalendar gcal2 = new GregorianCalendar(tz);
		gcal2.setTime(retr);
		
		System.out.println(sdf.format(gcal2.getTime()));
		
	}

	public static void printingCalendarDate() {
		
		TimeZone tz = TimeZone.getTimeZone("GMT+5");
		
		GregorianCalendar gcal1 = new GregorianCalendar(tz);
		gcal1.setTimeInMillis(System.currentTimeMillis());

		SimpleDateFormat sdf
			= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS z");

		// Setting the calendar's time zone
		sdf.setTimeZone(gcal1.getTimeZone());
		
		System.out.println(sdf.format(gcal1.getTime()));
		
	}
	
	public static void fromTimeZoneToTimeZone() {
		
		GregorianCalendar gcal1 = new GregorianCalendar(
				TimeZone.getTimeZone("GMT+5"));
		gcal1.setTimeInMillis(System.currentTimeMillis());

		GregorianCalendar gcal2 = new GregorianCalendar(
				TimeZone.getTimeZone("GMT-6"));
		
		gcal2.setTime(gcal1.getTime());
		
		SimpleDateFormat sdf
			= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS z");

		sdf.setTimeZone(gcal1.getTimeZone());
		System.out.println(sdf.format(gcal1.getTime()));
		
		sdf.setTimeZone(gcal2.getTimeZone());
		System.out.println(sdf.format(gcal2.getTime()));
		
		System.out.println(gcal1.getTime().getTime());
		System.out.println(gcal2.getTime().getTime());
		
	}
	
}
