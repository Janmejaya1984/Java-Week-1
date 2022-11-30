package com.java.interfacedemo;

public interface Reader {
 String PORT ="8080"; 	
  default void read() {
	  System.out.println("Default method of interface");
  }
  
  static void read(String fileName) {
	  System.out.println("Read from file Named: "+fileName);
  }
  
  void read(String fileName,int lineNo);
 
}
