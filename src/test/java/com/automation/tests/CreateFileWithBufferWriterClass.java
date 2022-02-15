package com.automation.tests;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileWithBufferWriterClass {

	public static void main(String[] args) throws IOException {
		
		//C:\Users\DELL\myRepos\javadevdemo\src\test\resources\practice.txt
		
		//System.out.println(System.getProperty("user.dir"));
		//System.out.println(System.getenv("path"));
		
		
		String baseDirectory = System.getProperty("user.dir");
		
		FileWriter filewriter1 = new FileWriter(baseDirectory + "\\src\\test\\resources\\practice.txt");
		BufferedWriter bufferedwriter = new BufferedWriter(filewriter1);

		bufferedwriter.write("I am going to Create a new file using BufferedWriter ");
		bufferedwriter.write("Learning Selenium with java and also Manual testing");
		bufferedwriter.write("********************Results****************");

		bufferedwriter.close();
		
		FileReader filereader = new FileReader(
				baseDirectory + "\\src\\test\\resources\\practice.txt");
		int i;
		while ((i = filereader.read()) != -1) {
			
			System.out.print((char)i);
		}
		filereader.close();
	}

}
