package com.oops;

public class ControlStructures {

	public static void main(String[] args) {
		
		/*
		 * if..else
		 * for loop
		 * while loop
		 * do while
		 * switchcase (this is alternative to if..else if..else)
		 * */
		
		int studentMarks  =  75;
		while(studentMarks > 70 && studentMarks < 100 ) {
			System.out.println(studentMarks);
			studentMarks++;
		}
		//System.out.println(studentMarks);
		
		studentMarks  =  80;
		
		do {
			System.out.println(studentMarks);
			studentMarks++;
		} while(studentMarks > 70 && studentMarks < 100);
		System.out.println(studentMarks);

	}

}
