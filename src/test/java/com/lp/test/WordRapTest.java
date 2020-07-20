package com.lp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordRapTest {

	private static int LINE_LENGTH = 5;

	@Test
	public void isWordWrap() {
		String length = WordRap.wrap("the monday", LINE_LENGTH);
		assertEquals("the m\nonday", length);

	}

	@Test
	public void sortLineShouldNotWrap() {
		String lengh = WordRap.wrap("the", LINE_LENGTH);
		assertEquals("the", lengh);
	}

}
