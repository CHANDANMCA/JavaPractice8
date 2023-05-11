package com.practice;

import java.util.Stack;

public interface StackJava {
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		pushStack(stack,12);
		pushStack(stack, 22);
		pushStack(stack, 33);
		pushStack(stack, 55);
popStack(stack);
		//System.out.println(stack);
		/*
		 * Iterator iterator=stack.iterator();
		 *
		 * while(iterator.hasNext()) { Object next = iterator.next();
		 * System.out.println(next); }
		 */
		//stack.forEach(System.out::println);

	}
	public static void  pushStack(Stack stk,int num) {
		stk.push(new Integer(num));
		System.out.println("push ->"+num);
		System.out.println(stk);
	}
	static void popStack(Stack stack ) {
		Integer pop = (Integer) stack.pop();
		System.out.println(pop);

		System.out.println(stack);
	}

}
