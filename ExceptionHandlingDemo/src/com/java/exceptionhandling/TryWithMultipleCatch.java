package com.java.exceptionhandling;

public class TryWithMultipleCatch {

	public static void main(String[] args) {
		try {
			String name = null;
			//System.out.println(name.length());
			//int result = 10/0;
			int arr[] = {10,20};
			System.out.println(arr[3]);
		}
		catch(ArithmeticException ex1) {
			System.out.println("Arrithmatic Exception occurs "+ex1.getMessage());
		}catch(NullPointerException ex2) {
			System.out.println("NullPointer Exception occurs "+ex2.getMessage());
		}catch(ArrayIndexOutOfBoundsException ex3) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs "+ex3.getMessage());
		}
		catch(Exception ex) {
			System.out.println("It will handle all other exception");
		}

	}

}
