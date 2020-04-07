package com.dsalgorithms.logics;

public class StringToInteger {

	public int convertStringToInt(String input) {
		if (input == null || input.equals(""))
			return 0;

		int number = 0;
		String inputVal = input.trim();
		final int length = inputVal.length();
		final char charAtZeroIndex = inputVal.charAt(0);
		boolean isNegative = false;
		if (charAtZeroIndex == '-') {
			isNegative = true;
			inputVal = inputVal.substring(1);
		} else if (charAtZeroIndex == '+') {
			inputVal = inputVal.substring(1);
		}
		for (int i = 0; i < length; i++) {
			final char charVal = inputVal.charAt(i);
			if (charVal >= '0' && charVal <= '9') {
				number = number * 10 + (charVal - '0');
			} else
				break;
		}

		number = isNegative ? number *= -1 : number;

		System.out.println(number);
		return number;
	}

}
