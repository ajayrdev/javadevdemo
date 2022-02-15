package com.automation.tests;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.testng.annotations.Test;

public class MyTestngClass {
  @Test
  
  public void myTestCase1() {
	  
	  
	  // Exception types
	  
	  // Static exception or early binding  - FileNotFoundException
	  // Dynamic exception  - late binding  -  ArithmeticException
	  try {
		
		  FileReader fileReader = new FileReader("C:\\Users\\DELL\\myRepos\\javadevdemo\\src\\test\\resources\\testdata.txt");
		int i ;
		
		//Hi we are learning Java File IO today -  H  - 0, i  -  1, w  - 3, -1 means you reached end of the document
		
		while((i = fileReader.read()) != -1) {
			//System.out.print((char)i);
			switch((char)i) {
			case 'a':
				System.out.println("it is character: "+(char)i);
				break;
			case 'b':
				System.out.println("it is character: "+(char)i); 
				break;
			case 'c':
				System.out.println("it is character: "+(char)i);
				break;
			}
		}
	} catch (Exception e) {
		System.out.println("Caught an exception: "+e);
	}
	  
//	  System.out.println("Hello world");
  }

}
