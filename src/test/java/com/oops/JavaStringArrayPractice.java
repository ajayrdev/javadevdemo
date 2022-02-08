package com.oops;

public class JavaStringArrayPractice {

	public static String myStringName = "Iam living in Hyderabad";
	public static String myUpdatedStringName = "I am in Karimnagar";
	
	public static void main(String[] args) {
		
		System.out.println(myStringName);
		
		
		System.out.print(myStringName.charAt(0));
		System.out.print(myStringName.charAt(1));
		System.out.print(myStringName.charAt(2));
		
	
		System.out.println();
		System.out.println(myStringName.charAt(0));
		System.out.println(myStringName.charAt(1));
		System.out.println(myStringName.charAt(2));
		
		
		/*Converting String to Char
		 * Printing String Name in Order 
		 * */
		
		char myStringArray[] = myStringName.toCharArray();
		
		
		for (int i = 0; i< myStringArray.length; i++) {
			System.out.print(myStringArray[i]);
		}
		
		/*
		 * Printing Given String Name in *Reverse Order*
		 * */
		
		System.out.println();
		for (int i = myStringArray.length-1; i >= 0; i--) {
			System.out.print(myStringArray[i]);
		}
		
		//********************************************************/
		
				//Converting given string to Lower case
				
		System.out.println();		
		System.out.println(myUpdatedStringName.toLowerCase());
		System.out.println(myUpdatedStringName.toUpperCase());
		
		//*Replace Single Character 'a' with '@' 
		
		System.out.println(myStringName);
		System.out.println(myStringName.replace('a', '@'));
		
		//*TO Replace Part of the String
		
		System.out.println("To Replace Hyderabad to Khammam from given String");
		System.out.println(myStringName);
		System.out.println(myStringName.replace("Hyderabad", "Khammam"));
	
		//********************************************************//
		
		//*Create String Array with City Names *Hyderabad, Mumbai, Delhi*
		
		System.out.println("Create a String Array with the City Names of Hyderabad, Mumbai, Delhi");
		String UpdatedString[] = new String[3];
		
		UpdatedString[0] = "Hyderabad";
		UpdatedString[1] = "Mumbai";
		UpdatedString[2] = "Delhi";
		
		for (int i =0; i < UpdatedString.length; i++) {
			
			System.out.print(UpdatedString[i]+" ");
		}
		
		//*Display City Names in Reverse order
		
		System.out.println();
		for (int i = UpdatedString.length-1; i>=0; i-- ) {
			
			System.out.print(UpdatedString[i]+" ");
		}
	}
	

}
