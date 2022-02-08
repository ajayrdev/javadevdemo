package com.oops;

import java.util.Scanner;

public class DataTypesDemo {
	
	static boolean employeeMaritalStatus;

	public static void main(String[] args) {
		
		// 1 bit  -  8bits  = 1 byte, 1000bytes =  1KB, 
		//1000KB  =  1MB, 1000MB  = 1GB, 1000GB  =  1TB
		
		//Different Data Types
		int employeeID; //  
		float employeeSalary;
		double emloyeeTax;
		char employeeSex;
		
		String employeeDesc;
		
		System.out.println("Enter data as mentioned below");
		Scanner readData  = new Scanner(System.in);
		
		System.out.println("Please enter employee ID value");
		employeeID =  readData.nextInt(); 
		System.out.println("Please enter Employee Salry value");
		employeeSalary = readData.nextFloat();
		System.out.println("Please enter employee tax value");
		emloyeeTax =  readData.nextDouble();
	
		
		System.out.println("Please enter employee sex");
		employeeSex = readData.next().charAt(0);
		
		
		
		//employeeMaritalStatus =  false;
		
		
		
		System.out.println("You have entered below data. Please cross check");
		System.out.println("employeeID: "+employeeID);
		System.out.println("employeeSalary "+employeeSalary);
		System.out.println("emloyeeTax: "+emloyeeTax);
		System.out.println("employeeSex: "+employeeSex);
		System.out.println("employeeMaritalStatus: "+employeeMaritalStatus);
		System.out.println("employeeDesc: Senior Employee");

	}

}
