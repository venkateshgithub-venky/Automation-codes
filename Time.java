package com.java.programs;

import java.util.Calendar;

public class Time {
	/**
	 * @author Venkatesh Batthula
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getCalendarType());
		System.out.println(cal.getTimeZone());
		cal.set(2022, 02, 26);
		System.out.println(cal.getTime());
		System.out.println(cal.get(cal.YEAR));
		System.out.println((cal.get(cal.MONTH)));
		System.out.println(cal.get(cal.DATE));
		
	}

}
