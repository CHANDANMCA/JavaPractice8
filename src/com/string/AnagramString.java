package com.string;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String name = "cat";
		String name2 = "atc";

		String lowerCase2 = name.toLowerCase();
		String lowerCase = name2.toLowerCase();
		if (lowerCase2.length() != lowerCase.length()) {
			System.out.println("both string are not anagram");

		} else {
			char[] charArray = lowerCase2.toCharArray();
			char[] charArray2 = lowerCase.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
			if (Arrays.equals(charArray,charArray2) == true) {
				System.out.println("anagram String");
			} else {
				System.out.println("not anagram string");
			}
		}
	}
}
