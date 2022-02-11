package com.exceptionhandling;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class ExceptionHandlingPractice {
	Set studentDetails;

	@Test
	public void myFirstTest() {

		try {
			studentDetails = new HashSet();

			studentDetails.add("Chanti");
			studentDetails.add("Devannapet,HNK");
			studentDetails.add("PGDCA");
			studentDetails.add("Software Designer");

			System.out.println(studentDetails);

			int studentAverageMarks = getMarks();
			studentDetails.add(studentAverageMarks);
			System.out.println(studentDetails);

		} catch (ArithmeticException e) {
			System.out.println("Please Check Given Details");
			System.out.println(studentDetails);
		}

	}

	private int getMarks() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Subjets");
		int subjects = scanner.nextInt();
		System.out.println("Enter Total Marks");
		int totalMarks = scanner.nextInt();
		return totalMarks / subjects;
	}
}
