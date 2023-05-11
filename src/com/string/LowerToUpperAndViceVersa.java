package com.string;

public class LowerToUpperAndViceVersa {
	public static void main(String[] args) {
		String name = "Hello Chandan Kumar ";
		StringBuffer newStrBul = new StringBuffer(name);
		for (int i = 0; i < name.length(); i++) {
			if (Character.isLowerCase(name.charAt(i))) {
				newStrBul.setCharAt(i, Character.toUpperCase(name.charAt(i)));
			} else if (Character.isUpperCase(name.charAt(i))) {
				newStrBul.setCharAt(i, Character.toLowerCase(name.charAt(i)));
			}
		}
		System.out.println(newStrBul);
	}

}
