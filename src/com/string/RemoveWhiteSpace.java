package com.string;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String name="hello chandan kumar";
		String replace = name.replaceAll("\\s+","");
		System.out.println(replace);
	}

}
