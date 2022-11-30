package com.java.interfacedemo;

public class Test {
	public static void show(String fileName, int lineNo) {
		System.out.println("Reading from file : "+fileName+" from line No :"+lineNo);
		
	}

	public static void main(String[] args) {
		Reader.read("emp.csv");
		System.out.println("The PORT is:"+ Reader.PORT);
		Reader reader1 = new FileReader();
		reader1.read();
		reader1.read("emp.csv", 2);
		Reader reader2 = new Reader() {
			@Override
			public void read(String fileName, int lineNo) {
				System.out.println("Reading from file : "+fileName+" from line No :"+lineNo);
				
			}
		};
		reader2.read("file-1.xsl", 10);
		Reader reader3 = (fileName,lineNo)-> System.out.println("Reading from file : "+fileName+" from line No :"+lineNo);;
		reader3.read("file-2.xls",2);
		
		Reader reader4 = Test::show;
		reader4.read("file-4.xls",5);
	}

}
