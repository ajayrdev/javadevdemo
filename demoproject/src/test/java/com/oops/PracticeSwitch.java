package com.oops;

public class PracticeSwitch {

	
	public static void main(String[] args) {
	
		
		int myNumber = '4';
		
		switch (myNumber) {
		case '1':
			System.out.println("*");
			break;
		case '2':
			System.out.println("* *");
			break;
		case '3':
			System.out.println("* * *");
			break;
			
		case '4':
			System.out.println("* * * *");
			break;
		case '5':
			System.out.println("* * * * *");
			
		}
		
		
		
		String UpdatedString[] = new String[5];
		
		UpdatedString[0] = "* * * * *";
		UpdatedString[1] = "* * * *";
		UpdatedString[2] = "* * *";
		UpdatedString[3] = "* *";
		UpdatedString[4] = "*";
		
		for (int i =0; i < UpdatedString.length; i++) {
			
			System.out.println(UpdatedString[i]+" ");
		}
		for (int i = UpdatedString.length-1; i>=0; i--) {
			System.out.println(UpdatedString[i]);
		
		}
		
		
	}

}
