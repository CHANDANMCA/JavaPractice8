package com.string;

public class TotalNumberCharacter {
	public static void main(String[] args) {
		String nameString = "chandankumarswain";
		int count = 0;
		for (int i = 0; i < nameString.length(); i++) {
			if (nameString.charAt(i) != ' ') {
				count++;
			}

		}
		System.out.println(count);
	}

}
