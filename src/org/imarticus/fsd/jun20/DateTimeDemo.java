package org.imarticus.fsd.jun20;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//Date and Time API

public class DateTimeDemo {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		DateFormat df;
		df = DateFormat.getDateInstance();
		System.out.println(df.format(date));
		df = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.US);
		System.out.println(df.format(date));
		df = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.UK);
		System.out.println(df.format(date));
		df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		System.out.println(df.format(date));
		df = DateFormat.getDateInstance(DateFormat.FULL, Locale.UK);
		System.out.println(df.format(date));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf1.format(date));
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdf2.format(date));
	}
}
