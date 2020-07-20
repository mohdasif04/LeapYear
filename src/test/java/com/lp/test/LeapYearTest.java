package com.lp.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTest {

	@Test
	public void isLeapYearDivisibleByFour() {
		assertTrue(LeapYear.isLeep(2016));
	}

	@Test
	public void normalYearAreNotDivisibleByFour() {

		assertFalse(LeapYear.isLeep(3));
	}

	@Test
	public void isLeapYearDivisibleByHundred() {

		assertFalse(LeapYear.isLeep(1900));

	}

	@Test
	public void leapYearAreDivisibleByFourHundres() {

		assertTrue(LeapYear.isLeep(400));
	}
}
