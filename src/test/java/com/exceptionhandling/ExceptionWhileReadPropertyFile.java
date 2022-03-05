package com.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ExceptionWhileReadPropertyFile {
	@Test
	public void firstTestCace() throws FileNotFoundException {
		try {
			String baseDirectory = System.getProperty("user.dir");

			String relativeFilePath = "//src//test//resources//empdetails.properties";

			FileInputStream fis = new FileInputStream(baseDirectory + relativeFilePath);
			Properties pop = new Properties();
			pop.load(fis);
			System.out.println("EmployeeName:" + pop.getProperty("EmpName"));

               pop.setProperty("EmployeeId", "101");
			System.out.println("EmployeeId:" + pop.getProperty("EmpId"));

		} catch (FileNotFoundException e) {

			e.printStackTrace();
			throw new FileNotFoundException("Please check the file path given");

		} catch (IOException e) { // Exception

//			e.printStackTrace();
			throw new Error(e);
		}

	}
}
