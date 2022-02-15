package com.automation.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

import org.testng.annotations.Test;

public class ReadWritePropertiesFile {
  @Test
  public void readData() throws Exception {
	  String baseDirectory = System.getProperty("user.dir");
		
		String fileRelativePath  = "\\src\\test\\resources\\testdata.properties";
		
		FileInputStream fis  =  new FileInputStream(baseDirectory +fileRelativePath);
		
		Properties pop =  new Properties();
		pop.load(fis);
		
		System.out.println("Browser: "+ pop.getProperty("browser"));
		pop.setProperty("browser", "Firefox");
		System.out.println("Browser: "+ pop.getProperty("browser"));
		
Set mySet = pop.keySet();
System.out.println(mySet);

	  
  }
}
