package com.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Carlendar {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date myDate = dateFormat.parse("2010-09-13 22:36:01");
		
		Calendar calendar = Calendar.getInstance();
		
		//…Ë÷√
		calendar.setTime(myDate);
		Date a = calendar.getTime();
		String date = dateFormat.format(calendar.getTime());
		System.out.println(date);
	}

}
