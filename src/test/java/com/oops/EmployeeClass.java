package com.oops;

public class EmployeeClass extends EmployerClass {

	public static void main(String[] args) {
		EmployerClass employer = new EmployerClass();
		
		employer.displayEmployeeName();
		employer.displayEmployeeDesignation();
		employer.displayEmployeeDepartment();
		employer.displayEmployeeSalary();
		employer.displayEmployeeProject();
		
		
		EmployeeClass employee = new EmployeeClass();
		employee.displayEmployeeName();
		employee.displayEmployeeDesignation();
		employee.displayEmployeeDepartment();
		employee.displayEmployeeSalary();
		employee.displayEmployeeProject();
		employee.employeeMethod();

	}
	
	public void employeeMethod() {
		System.out.println("I am from employee method");
	}

}
