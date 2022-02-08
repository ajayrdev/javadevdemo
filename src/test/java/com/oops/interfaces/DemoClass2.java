package com.oops.interfaces;

public class DemoClass2 implements DemoInterface1 {

	public static void main(String[] args) {
		DemoClass2 democlass2 = new DemoClass2();
		
		democlass2.displayMessage();
		democlass2.displayMessage("interface");
		int area = democlass2.findTheArea(20, 10);
		System.out.println("area calculated is: "+ area);
		
		

	}
	
	public void myMethod() {
		System.out.println("my interface method with body");
	}

	@Override
	public void displayMessage() {
		System.out.println("I am writting interface");
		
	}

	@Override
	public void displayMessage(String myMessage) {
		
		System.out.println(myMessage);
	}

	@Override
	public int findTheArea(int length, int width) {
		System.out.println(" I am writing a logic to print the area of the given length and width");
		return 4*length*width ;
	}

}
