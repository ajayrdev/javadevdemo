package com.automation.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.testng.annotations.Test;

public class PracReadWritePropertiesFile {
  @Test
  public void readWriteProperties() throws IOException {
	  
	  String baseDirectory = System.getProperty("user.dir");
	  
	  String fileRelativePath = "//src//test//resources//empdetails.properties";
	  
	  FileInputStream fis = new FileInputStream (baseDirectory+fileRelativePath);
	  Properties pop = new Properties();
	  pop.load(fis);
	  
//	  System.out.println("EmployeeName:"+pop.getProperty("EmpName"));
//	  System.out.println("EmployeeSalary:"+pop.getProperty("EmpSalary"));
	  System.out.println("Empployee Designation : "+pop.getProperty("EmpDesignation"));
	  
	  pop.setProperty("EmpDesignation", "Manager");
	  System.out.println("Empployee Designation : "+pop.getProperty("EmpDesignation"));
	  
	  System.out.println("Empployee Salary : "+pop.getProperty("EmpSalary"));
	  
	  
	  String EmpSal = pop.getProperty("EmpSalary");
	  System.out.println(Integer.max(100, 200));
	  
	  int empSalNumber = Integer.parseInt(EmpSal);
	  if(empSalNumber < 10000) {
//		  EmpSal = String.valueOf((empSalNumber) + 20000); // "abc"+ 20000 -> abc20000
		  EmpSal = String.valueOf((empSalNumber)+5000);
		  pop.setProperty("EmpSalary", EmpSal);
		  
	  }
	  
//	  Set myset = pop.keySet();
//	  System.out.println(myset);
	  
	  System.out.println("Empployee Salary : "+pop.getProperty("EmpSalary"));
	  //pop.clear();
  }
}
