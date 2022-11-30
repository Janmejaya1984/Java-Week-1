package com.java.functionoverloading;

import java.io.File;

public class ReadData {
	
	public void read(String dbUrl,String uname,String pwd) {
		System.out.println("Read data from database");
	}
	public void read(String fileName) {
		System.out.println("Read data from File");
	}
	
	public void read(File file) {
		System.out.println("Read data from File Object");
	}

	public void read(File file,int startIndex) {
		System.out.println("Read data from File Object");
	}
	public void read(int startIndex,File file) {
		System.out.println("Read data from File Object");
	}
	public static void main(String[] args) {
		ReadData reader  = new ReadData();
		reader.read("employee.json");
		reader.read("server","username","password");
	}

}
