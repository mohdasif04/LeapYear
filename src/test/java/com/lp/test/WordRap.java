package com.lp.test;

public class WordRap {

	public static String wrap(final String inputLine, final int lineLength) {

		final StringBuffer sb = new StringBuffer();
		final int lengths = inputLine.length();

		sb.append(inputLine, 0, Math.min(lengths, lineLength));

		if (inputLine.length() > lineLength) {

			sb.append("\n");
			sb.append(inputLine, lineLength, inputLine.length());

		}

		return sb.toString();
	}

}
