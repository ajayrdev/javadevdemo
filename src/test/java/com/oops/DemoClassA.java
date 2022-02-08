package com.oops;

public class DemoClassA extends DemoClassB {
	
	boolean isMarried  =  true;

	public static void main(String[] args) {
		
//		DemoClassB demoClassB  =  new DemoClassB();
//		demoClassB.displayNameAndDesignation();
//		demoClassB.displayAddress();
//		demoClassB.displaySalary();
//		demoClassB.displayGender();
//		
//		DemoClassB demoClassBParam  =  new DemoClassB("I am parameterized contructor from DemoClassB");
//		demoClassBParam.displayNameAndDesignation();
//		demoClassBParam.displayAddress();
//		demoClassBParam.displaySalary();
//		demoClassBParam.displayGender();
		
		DemoClassA demoClassA =  new DemoClassA();
		demoClassA.displayNameAndDesignation();
		demoClassA.displayAddress();
		demoClassA.displaySalary();
		demoClassA.displayGender();
		
		demoClassA.displayMaritalStatus();
		
				

	}
	
	
	public void displayMaritalStatus() {
		System.out.println("Marital status from child class "+this.isMarried);
		System.out.println("Marital status from parent class "+super.isMarried);
		System.out.println(isMarried);
	}

	
	public void displaySalary() {
		
		System.out.println( "25000");
	}

	public void displayAddress() {
		System.out.println( "KNR");
		
	}

	public void displayNameAndDesignation() {
		System.out.println("Test engineer");
		
	}

}
