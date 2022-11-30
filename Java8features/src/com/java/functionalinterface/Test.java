package com.java.functionalinterface;

public class Test {

	public static void main(String[] args) {
		/*FunctionalInterfaceDemo f1 = new ImplClass();//Auto Boxing
		f1.square(55);*/
		//Anonymous Inner Class
		/*FunctionalInterfaceDemo f1 = new FunctionalInterfaceDemo() {

			@Override
			public void square(int x) {
				System.out.println("The Square is : "+(x*x));
				
			}};
			f1.square(89);*/
			FunctionalInterfaceDemo f2 = x->	System.out.println("The Square is : "+(x*x));
			f2.square(125);
	}

}
