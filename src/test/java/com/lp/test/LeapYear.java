package com.lp.test;

public class LeapYear {

	public static boolean isLeep(final int year) {

		return isDivisible(year, 4) && !isDivisible(year, 100) || (isDivisible(year, 400));

	}

	public static boolean isDivisible(final int year, final int denominator) {

		return year % denominator == 0;
	}

}
