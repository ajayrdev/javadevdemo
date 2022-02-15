package com.automation.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import org.testng.annotations.Test;

public class ReadFileLineByLine {
  @Test
  public void readFile()  throws Exception{
		
		String baseDirectory = System.getProperty("user.dir");
		
		FileWriter filewriter1 = new FileWriter(baseDirectory + "\\src\\test\\resources\\practice.txt");
		BufferedWriter bufferedwriter = new BufferedWriter(filewriter1);

		bufferedwriter.write("I am going to Create a new file using BufferedWriter ");
		bufferedwriter.write("\n");
		bufferedwriter.write("Learning Selenium with java and also Manual testing");
		bufferedwriter.write("\n");
		bufferedwriter.write("********************Results****************");
		bufferedwriter.write("\n");

		bufferedwriter.close();
		
		FileReader fir  = new FileReader(baseDirectory + "\\src\\test\\resources\\practice.txt");
		BufferedReader bufferReader = new BufferedReader(fir);
		
		String myStringLine ; 
		StringBuffer sb  = new StringBuffer();
		/* bufferReader.readLine() - it will read data in streams line by line
		 * at the end of the file, it will return null
		 * */
		while((myStringLine = bufferReader.readLine())  !=  null) { //null  != null
			sb.append(myStringLine);
			sb.append("\n");
		}
		
		fir.close();
		System.out.println(sb.toString());
		
		
	
  }
}
