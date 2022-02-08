package com.oops.interfaces;

import java.util.Scanner;

public class PracticeStudentClass implements PracticeSchoolInterface {
	
	int monthCount;
	PracticeStudentClass (int monCount){
		this.monthCount = monCount;
	}

	public static void main(String[] args) {
		PracticeStudentClass practicestudentclass = new PracticeStudentClass(12);
		
		practicestudentclass.displayStudentSchoolName("DARWIN HIGH SCHOOL");
		practicestudentclass.displayStudentId();
		practicestudentclass.displayStudentName();
		practicestudentclass.dispalyStudentClass();
//		int studentFee = practicestudentclass.displayStudentFee(12, 100);
//		System.out.println("Student Fee per Year :"+ studentFee);

		Scanner scanner = new Scanner(System.in);
		boolean isMonthUpDated = true;
		if(isMonthUpDated) {
			
			System.out.println("Plese Enter updated Fee Months:");
			practicestudentclass.monthCount= scanner.nextInt();
			
			
		}
	
		System.out.println("Please enter Student fee");
		int StudentFee = scanner.nextInt();
		int studentTotelMonths = practicestudentclass.displayStudentFee(practicestudentclass.monthCount, StudentFee);
		System.out.println("Student Total Fee " +studentTotelMonths);
		
	}

	@Override
	public void displayStudentSchoolName(String myMessage) {
		System.out.println("School Name:"+ myMessage);
		
	}

	@Override
	public void displayStudentId() {
		
		System.out.println("Student id : 1100");
		
		
	}

	@Override
	public void displayStudentName() {
		System.out.println("student Name: AJAY");
		
	}

	@Override
	public void dispalyStudentClass() {
		System.out.println("I am Studying Fifth standared");
		
	}

	@Override
	public int displayStudentFee(int CalenderYear, int StudentFee) {
		
		return CalenderYear * StudentFee ;
	}

}
