package com.oops.interfaces;

import java.util.Scanner;

public class StudentClass1 implements SchoolInterface {
	int  subjectsCount;
	
	StudentClass1(int subsCount){
		this.subjectsCount = subsCount;
	}

	public static void main(String[] args) {
		
		StudentClass1 studentinterface = new StudentClass1(6);
		
		studentinterface.studentNameAndSchoolName();
		studentinterface.studentDesignation();
		
		Scanner scanner  =  new Scanner(System.in);
		boolean isSubjectsUpdated =  false;
		
		if(isSubjectsUpdated) {
			System.out.println("Please enter the updated subjects count");
			studentinterface.subjectsCount = scanner.nextInt();
		}
		
		
		System.out.println("Please enter the Total Marks");
		int totalMarks = scanner.nextInt();
		
		int studentTotalMarks = studentinterface.studentMarks(studentinterface.subjectsCount, totalMarks);
		System.out.println("Student Total Score: " +studentTotalMarks);

	}

	@Override
	public void studentNameAndSchoolName() {
		System.out.println("Ajay DARWIN HIGH SCHOOL");
		
	}

	@Override
	public void studentDesignation() {
		System.out.println("studying Fifth Standared A-Section");
		
	}

	@Override
	public int studentMarks(int Subjects, int TotalMarks) {
		
		return Subjects * TotalMarks ;
	}

}
