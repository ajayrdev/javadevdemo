package com.oops;

public class SwitchCase {

	public static void main(String[] args) {
		
		// Write a switch case for number 1 to5.. 1 means *, 2 **, 3 ***, 4 ****, 5 *****
		//int myNum =  1;
		
		
		String myDay = "Monday";
		
		switch(myDay) {
		case "Monday":
			System.out.println("Monday is weekday");
			System.out.println("Monday is weekday");
			System.out.println("Monday is weekday");
			break;
		case "Friday":
			System.out.println("Weekend starts with Friday");
			break;
		case "Sunday":
			System.out.println("Sunday is holiday");
			break;
		default:
				System.out.println("Seems you entered invalid day or days");
		}

	}

}
