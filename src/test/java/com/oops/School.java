package com.oops;

public class School {

	boolean ispassed = false;

	School() {
		System.out.println("Using Default Constructor from School");

	}

	School(String MyMessage) {

		System.out.println(MyMessage);
	}

	public void DisplayStudentSchool() {
		System.out.println("I am a student from Darwin High School");

	}

	public void DisplayStudentNameAndClass() {
		System.out.println("Ajay Fifth Standared");

	}

	public void DisplayStudentMarks() {
		System.out.println("450");

	}

	public void Displayfee() {
		System.out.println("25000");

	}

	public void DisplayGender() {
		System.out.println("Male");

	}

	public void displayResult(int marks) {
		/*
		 * IF.. else is a control structure in java. Based on the business logic or
		 * condition either if or else block will be executed If the condition is true,
		 * then if block is executed (It will not execute else block) If the condition
		 * is false, then else block is executed (It will not execute if block) We can
		 * write if block, without else block but vice versa is not possible
		 * If you have multiple conditions to handle, then use else if... as shown below
		 */
		if (marks > 75) { // then the condition becomes true
			System.out.println("Student passed the exam in distinction");
		} 
		else if (marks < 75 && marks >=60) { //&& - AND || - OR
			System.out.println("Student passed the exam in first class");
		} 
		else if (marks < 60 && marks >=35) {
			System.out.println("Student passed the exam in second class");
		}
		else {
			System.out.println("Student failed in the exam with " + marks + " marks");
		}

	}
}
