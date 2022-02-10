package com.exceptionhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionHandlingStudentMarks {
	static List myStudentDetails;

	public static void main(String[] args) {

		try {
			myStudentDetails = new ArrayList();

			myStudentDetails.add("Anand");
			myStudentDetails.add("10th Class");
			myStudentDetails.add("Zphs High School");
			myStudentDetails.add("Hyderabad");

			System.out.println(myStudentDetails);

			int studentAverageMarks = getMarks();
			myStudentDetails.add(studentAverageMarks);
			System.out.println(myStudentDetails);
		} catch (ArithmeticException e) {

			System.out.println(myStudentDetails);
		}
	}

	private static int getMarks() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Subjects");
		int subjects = scanner.nextInt();
		System.out.println("Please Enter Total Marks");
		int totalMarks = scanner.nextInt();

		return totalMarks / subjects;
	}

}
