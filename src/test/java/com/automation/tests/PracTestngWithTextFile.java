package com.automation.tests;

import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class PracTestngWithTextFile {
	@Test
	public void myPractice1() {

		try {
			FileReader filereader = new FileReader(
					"C:\\Users\\DELL\\myRepos\\javadevdemo\\src\\test\\resources\\practice.txt");
			int i;
			while ((i = filereader.read()) != -1) {
				
				System.out.print((char)i);
				
//				if ((char)i =='a') {
//					System.out.println("It is a character:"+(char)i);
//				}
//				else if((char)i =='e') {
//					System.out.println("It is a character:"+(char)i);
//				}
//				else if((char)i=='m') {
//					System.out.println("It is a Character:"+(char)i);
//				}
//				else if((char)i=='n') {
//					System.out.println("It is a Character:"+(char)i);
//				}
			}
			filereader.close();
		} catch (IOException e) {
			System.out.println("File missing: Please give the correct file path");

		} 
	}

}
