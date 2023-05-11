package com.string;

public class CountPunctuation {
	public static void main(String[] args) {
		String name = "He said, 'The mailman loves you.' I heard it with my own ears.";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == '!' || name.charAt(i) == ',' || name.charAt(i) == '\'' || name.charAt(i) == '\"' || name.charAt(i) == '?'
					|| name.charAt(i) == ':'||name.charAt(i)=='.') {
				count++;

			}

		}
		System.out.println(count);
	}

}
