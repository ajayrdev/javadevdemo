package com.oops.interfaces;

public class DemoClass1 implements DemoInterface1

//Concrete class. means A class defines method body for all its respective methods
{
	/*If you declare a class which implements the interface 
	 * Then it is the class which has to implement all the missing methods body or method logic
	 * And we have to use implements keyword but not the extends keyword.
	 * extends is only used for class to class inheritance*/

	public static void main(String[] args) {
	
		
		DemoClass1 demoClass1  =  new DemoClass1();
		demoClass1.displayMessage();
		demoClass1.displayMessage("DemoClass1");
		int area  = demoClass1.findTheArea(100, 50);
		System.out.println("Area is: "+area);
		
	}

	@Override
	public void displayMessage() {
		System.out.println("I am dislayMessage() from DemoClass1");
		
	}

	@Override
	public void displayMessage(String myMessage) {
		System.out.println("I am parameterized dislayMessage() from "+  myMessage);
		
	}

	@Override
	public int findTheArea(int length, int width) {
		return 2  * length * width;
	}

}
