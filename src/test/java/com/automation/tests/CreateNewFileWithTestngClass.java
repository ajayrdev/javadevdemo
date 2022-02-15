package com.automation.tests;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class CreateNewFileWithTestngClass {
	@Test
	public void createNewFile() {

		try {
			FileWriter filewriter = new FileWriter("C:\\Users\\DELL\\myRepos\\PracticeFile.txt");
			filewriter.write("I am here to learn Selenium with Java ");
			filewriter.write("Manual Testing. ");
			filewriter.write("File created with filewriter");
			System.out.println("File Created Successfully");
			filewriter.close();
		} catch (IOException e) {

			System.out.println("File not created");
		}
	}
}
