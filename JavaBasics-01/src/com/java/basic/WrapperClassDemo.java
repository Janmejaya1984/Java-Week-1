package com.java.basic;

import java.util.Scanner;

public class WrapperClassDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int number1 = Integer.parseInt(scanner.next());
		System.out.println("Enter the last number");
		int number2 = Integer.parseInt(scanner.next());
		
		System.out.println("The division is :"+(number1/number2));
		

	}

}
