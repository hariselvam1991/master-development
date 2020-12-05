package com.javabank;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(add(5,5));
		System.out.println(subtract(5,5));
	}
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static int subtract(int a, int b) {
		return a-b;
	}

}
