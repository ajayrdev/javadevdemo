package com.oops;

import java.util.Scanner;

public class Student extends School {
	
boolean ispassed= true;
	public static void main(String[] args) {
		
// 		School school = new School();
//		
//		school.DisplayStudentSchool();
//		school.DisplayStudentNameAndClass();
//		school.DisplayStudentMarks();
//		school.Displayfee();
//		school.DisplayGender();
		
//		School schoolParam = new School("Using Parameterized constructor from School");
//		
//		schoolParam.DisplayStudentSchool();
//		schoolParam.DisplayStudentNameAndClass();
//		schoolParam.DisplayStudentMarks();
//		schoolParam.Displayfee();
//		schoolParam.DisplayGender();
		
		
		Student student = new Student();
		
//		student.DisplayStudentSchool();
//		student.DisplayStudentNameAndClass();
//		student.DisplayStudentMarks();
//		student.Displayfee();
//		student.DisplayGender();
		
		System.out.println("Please enter the student marks below:");
		
		Scanner readData  =  new Scanner(System.in);
		
		
		int studentMarks  = readData.nextInt();
		student.displayResult(studentMarks);
		
		
		}
		
//	public void DisplayResult() {
//		System.out.println("Result of the Student is passed " +this.ispassed);
//		System.out.println("Result of the SchoolClass is passed " +super.ispassed);
//		
//		System.out.println(ispassed);
//
//	}

}
