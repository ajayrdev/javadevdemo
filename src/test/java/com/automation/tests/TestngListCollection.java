package com.automation.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

public class TestngListCollection {
	static List myListCollection1;

	@Test
	public void myListCollection() {

		try {
			myListCollection1 = new ArrayList();

			myListCollection1.add("Anand");
			myListCollection1.add("1001");
			myListCollection1.add("ZPHS School");
			myListCollection1.add("Nalgonda");
			myListCollection1.add("10th class");

			int studentPercentage = getPercentage();
			myListCollection1.add(studentPercentage / 100);
			System.out.println(myListCollection1);
		} catch (ArithmeticException e) {

			System.out.println(myListCollection1);
		}

	}

	private int getPercentage() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter Total subjects");
		int totalSubjects = scanner.nextInt();
		System.out.println("Please Enter Student Scored marks");
		int studentMarks = scanner.nextInt();
		return studentMarks / totalSubjects * 100;
	}
}
