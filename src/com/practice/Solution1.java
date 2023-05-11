package com.practice;

import java.util.Scanner;
import java.util.Stack;

public class Solution1 {
	public static boolean checkValidity(String line) {
		Stack stack = new Stack();
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
				continue;
			}
			if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty())
					return false;
				char peek = (char) stack.peek();
				if (c == ')' && peek == '(')
					stack.pop();
				else if (c == ']' && peek == '[')
					stack.pop();

				else if (c == '}' && peek == '{')
					stack.pop();
				else
					return false;
			} else
				continue;

		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String line = "";
		while (scanner.hasNext()) {
			line = scanner.next();
			boolean checkValidity = checkValidity(line);
			System.out.println(checkValidity);

		}
	}

}
