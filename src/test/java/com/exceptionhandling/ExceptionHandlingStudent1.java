package com.exceptionhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionHandlingStudent1 {
	static List myListCollection1;

	public static void main(String[] args) {
		try {
			myListCollection1 =new ArrayList();
			
			myListCollection1.add("Anand");
			myListCollection1.add("Microstategy Developer");
			myListCollection1.add("VissolVassuTech");
//		myListCollection1.add("600000");
			
			System.out.println(myListCollection1);
			
			int monthlyFee = getFee();
			myListCollection1.add(monthlyFee);
			System.out.println(myListCollection1);
			
			
		} catch (ArithmeticException e) {
			System.out.println(myListCollection1);
		}
		
	}

	private static int getFee() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please Enter Months");
		int months = scanner.nextInt();
		System.out.println("Please Enter Anual Fee");
		int AnnualFee = scanner.nextInt();
		return AnnualFee/months;
		

	}

}
