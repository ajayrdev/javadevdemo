package com.oops;

public class JavaArraysDemo {

	public static void main(String[] args) {
//		int empId = 100;
//		System.out.println("Employee ID "+empId);
//		empId =  200;
//		System.out.println("Employee ID "+empId);

		// Arrays store same type of data or homogeneous data
		// Arrays store more than one value into single variable
		// Arrays can be accessed using the index. which starts from 0 to Array.length-1
		// Using for loop we can loop through array elements in both forward and
		// backward direction

		int myArray[] = new int[5]; // declaration of an array.. Data type and size of array [0] [1] [2] [3] [4] [5]

		myArray[0] = 100;
		myArray[1] = 200;
		myArray[2] = 300;
		myArray[3] = 400;
		myArray[4] = 600;

//		System.out.print(myArray[0]+" ");
//		System.out.print(myArray[1]+" ");
//		System.out.print(myArray[2]+" ");
//		System.out.print(myArray[3]+" ");
//		System.out.print(myArray[4]+" ");

		for (int i = 0; i < myArray.length; i++) { // initialization ; condition ; incre or decre
			// 1st iteration i = 0 ==> 100
			// 2nd iteration i = 1 ==>
			System.out.print(myArray[i] + " ");
		}

		System.out.println();
		for (int i = myArray.length - 1; i >= 0; i--) {
			// 1st iteration i = 0 ==> 100
			// 2nd iteration i = 1 ==>
			System.out.print(myArray[i] + " ");
		}

	}

}
