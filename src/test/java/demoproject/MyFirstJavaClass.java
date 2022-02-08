package demoproject;

import org.testng.Assert;

public class MyFirstJavaClass {

	public static void main(String[] args) {
		System.out.println("Welcome Ajay!");
		Assert.assertEquals("Kumar", "Kumar", "Both the strings are not equal");
		System.out.println("Both the strings are equal");
		dislayMessage();
		dislayMessage("I am here to learn Automation");
		
		MyFirstJavaClass myObj = new MyFirstJavaClass();
		myObj.myDynamicMethod();
		
		dislayMessage();
		dislayMessage();
		dislayMessage();
		
		System.out.println("MySalry "+returnMySalry());
		
		
	}
	
	public static void dislayMessage() {
		System.out.println("I am here to learn Java");
	}
	
	public static void dislayMessage(String myMessage) {
		System.out.println(myMessage);
	}
	
	public void myDynamicMethod() {
		String message =  "I am a dynamic method and you can use me only when you create an object of your class";
		System.out.println(message);
	}
	
	public static int returnMySalry() {
		return 10000;
	}

}
