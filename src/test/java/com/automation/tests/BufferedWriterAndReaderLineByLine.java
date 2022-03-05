package com.automation.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class BufferedWriterAndReaderLineByLine {
	@Test
	public void bufferedWriterAndReader()   {

		try {
			String baseDirectory = System.getProperty("user.dir");

//	  System.out.println(baseDirectory);
//	  C:\Users\DELL\myRepos\javadevdemo

			String fileRelativePath = "\\src\\test\\resources\\readwritebwbr.txt";

			FileWriter fw = new FileWriter(baseDirectory + fileRelativePath);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("I am Writing a Story using Buffered writer");
			bw.write("\n");
			bw.write("I am Reading a Story using Buffered reader");
			bw.write("\n");
			bw.write("will see how it is working");
			bw.write("\n");
			bw.write("******************Finished******************");

			System.out.println("File is created");
			bw.close();

			FileReader fr = new FileReader(baseDirectory + "\\src\\testabc\\resources\\readwritebwbr.txt");
			BufferedReader br = new BufferedReader(fr);

			String myStringValue;
			StringBuffer sb = new StringBuffer();
			while ((myStringValue = br.readLine()) != null) {

				sb.append(myStringValue);
				sb.append("\n");
			}
			fr.close();
			System.out.println(sb.toString());
			
		} catch (FileNotFoundException e) {
			System.out.println("Exception: "+e);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
