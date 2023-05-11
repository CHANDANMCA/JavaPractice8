package com.practice;

import java.util.Scanner;

public class StaticInitializer {

	static int B,H;
	static boolean flag=false;
	static {
		Scanner scanner =new Scanner(System.in);
		B=scanner.nextInt();
		H=scanner.nextInt();
		if(B>0 && H>0) {
			flag=true;
			System.out.println(flag);
		}else {
			System.out.println("Breadth and height must be positive");
		}
	}

	public static void main(String[] args) {


	}

}
