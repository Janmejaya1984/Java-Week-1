package com.java.basic;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println("Date Is:"+d1);
		
		Customer john = new Customer();
		john.setCustomerId(101);
		john.setName("John Smith");
		john.setMarried(true);
		john.display();
		Customer foo = new Customer();
		foo.setCustomerId(102);
		foo.setName("Foo Smith");
		foo.setMarried(false);
		foo.display();
		Customer bar = new Customer();
		bar.setCustomerId(103);
		bar.setName("Bar Smith");
		bar.setMarried(true);
		bar.display();
		
		Customer zenne = new Customer(104,"Zenne Robert",false);
		zenne.display();
		for(GenderEnum gender:GenderEnum.values()) {
			System.out.println(gender + ":"+ gender.ordinal());
		}

	}

}
