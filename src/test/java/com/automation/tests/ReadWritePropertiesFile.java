package com.automation.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.testng.annotations.Test;

public class ReadWritePropertiesFile {
	FileInputStream fis;
	Properties pop;
	@Test
	public void readData() {
		try {
			String baseDirectory = System.getProperty("user.dir");

			String fileRelativePath = "\\src\\test\\resources\\ABC\\testdata.properties";

			 fis = new FileInputStream(baseDirectory + fileRelativePath);

			Properties pop = new Properties();
			pop.load(fis);

			System.out.println("Browser: " + pop.getProperty("browser"));
			pop.setProperty("browser", "Firefox");
			System.out.println("Browser: " + pop.getProperty("browser"));
			/*
			 * String sal = pop.getProperty("salry"); if(condi){sal = sal + 1000}
			 * pop.setProoepr("Salary")
			 */

			Set mySet = pop.keySet();
			System.out.println(mySet);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pop.clear();
			System.out.println("I will run always!");
		}

	}
}
