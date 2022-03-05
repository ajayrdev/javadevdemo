package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class ExceptionWhileReadingTextFile {
	@Test
	public void firstTestCase() throws FileNotFoundException {
		try {
			String baseDirectory = System.getProperty("user.dir");
			String fileRelativePath = "\\src\\test\\resources\\Abcd\\practice.txt";// adding ABCD

			FileReader fr = new FileReader(baseDirectory + fileRelativePath);
			BufferedReader br = new BufferedReader(fr);

			String myStringLine;
			StringBuffer sb = new StringBuffer();
			while ((myStringLine = br.readLine()) != null) {
				sb.append(myStringLine);
				sb.append("\n");
			}
			br.close();
			System.out.println(sb.toString());

		} catch (FileNotFoundException e) {

			throw new FileNotFoundException("Please check the file path given");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
