package com.string;

public class PalindromeStringAndInt {
	public static void main(String[] args) {
		/*
		 * String name="chandna"; String revString = ""; for (int i =name.length()-1;
		 * i>=0; i--) { revString+=name.charAt(i);
		 *
		 * } System.out.println(revString); if (name.equals(revString)) {
		 * System.out.println("the value is palindrom");
		 *
		 * }else { System.out.println("not palindrom"); }
		 */

		checkPalindrome(1234);

	}

	public static int checkPalindrome(int original) {
		int reverseNum = 0;
		int tempOriginal = original;

		while (tempOriginal > 0) {

			int lastDigit = tempOriginal % 10;
			reverseNum = reverseNum * 10 + lastDigit;
			tempOriginal = tempOriginal / 10;
		}

		if (original == reverseNum) {
			return 1;
		} else {
			return 0;
		}

	}
}
