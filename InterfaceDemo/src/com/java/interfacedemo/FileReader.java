package com.java.interfacedemo;

public class FileReader implements Reader {

	@Override
	public void read(String fileName, int lineNo) {
		System.out.println("Reading from file : "+fileName+" from line No :"+lineNo);
		
	}

}
