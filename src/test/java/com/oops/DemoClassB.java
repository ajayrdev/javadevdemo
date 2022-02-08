package com.oops;

public class DemoClassB {
	
	boolean isMarried  =  false;
	
	DemoClassB(){
		System.out.println("I am default constructor from DemoClassB");
	}
	
	DemoClassB(String myMessage){
		System.out.println(myMessage);
	}
	
	public void displayNameAndDesignation() {
		System.out.println("Kumar QA Trainer");
	}
	
	public void displaySalary() {
		System.out.println("10000.20");
	}
	
	public void displayAddress() {
		System.out.println("HyderNager, Hyd. 500072");
	}
	
	public void displayGender() {
		System.out.println("M");
	}

}
