package com.oops;

public class JavaStringsDemo {
	
	public static String myString = "Hyderabad is a beautiful city";
	public static String myAnotherString = "This is second string";
	public static String myStringDuplicate = "Hyderabad is a Beautiful City";
	
	public static void main(String args[]) {
		System.out.println(myString);
		
		System.out.println(myString.charAt(0)); // It prints the char at the given index of a string
		System.out.println(myString.charAt(1));
		
		
		System.out.println(myString.equals(myAnotherString)); // true if both the strings are equals if not, it will return false
		System.out.println(myString.equals(myString));
		
		//Printing string in reverse order
		char myStringArray[] = myString.toCharArray(); // Converting string to char Array
		//[H] [y] [d] [e].......[y]
		
		for(int i=0; i < myStringArray.length; i++) {
		System.out.print(myStringArray[i]);
		}
		
		System.out.println();
		
		for(int i= myStringArray.length-1; i >=0 ; i--) {
			System.out.print(myStringArray[i]);
			}
		System.out.println();
		
		
		//convert to lowercase() or uppercase()
		System.out.println(myString.toLowerCase()); // to convert all the string chars to small letters or lower case letters
		System.out.println(myString.toUpperCase()); // to convert to upercase letters
		
		System.out.println(myString.equals(myStringDuplicate)); // It will consider the case sensitiveness
		System.out.println(myString.equalsIgnoreCase(myStringDuplicate)); // It ignores the case sensitivesness while comaring the strings
		
		System.out.println(myString);
		System.out.println(myString.replace('a', 'x')); // to replace a single character ina word
		System.out.println(myString.replace("city", "place")); // to replace a string or gorup chars in a given string
		
		//*Trimming operatins
		String sampleString = "       I am an automation engineer ";
		System.out.println(sampleString);
		System.out.println(sampleString.trim()); // removes all leading and trailing spaces
		
		
	
		
	}

}
