package com.java.exceptionhandling;

import java.util.Scanner;

public class Calculator {

	public static void divide(int x,int y) {
		System.out.println("The Result is :"+(x/y));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int x=0,y=0;
		try {
		x = Integer.parseInt(sc.next());
		System.out.println("Enter the 2nd number");
		y = Integer.parseInt(sc.next());
		Calculator.divide(x, y);
		}catch(Exception ex) {
			System.out.println("Error occurs");
			System.out.println("Due to : "+ ex);
			if(x==0) {
				System.out.println("Enter an integer value for X other than 0");
				x = Integer.parseInt(sc.next());
			}
			if(y==0) {
				System.out.println("Enter an integer value for Y other than 0");
				y = Integer.parseInt(sc.next());
			}
			Calculator.divide(x, y);
		}
		
	}

}
