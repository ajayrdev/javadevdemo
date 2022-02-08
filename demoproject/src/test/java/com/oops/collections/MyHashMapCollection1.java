package com.oops.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyHashMapCollection1 {

	public static void main(String args[]) {

//		 Map<> myMapObj1 = new HashMap<>();

		Map<String, String> myMapObj = new HashMap<String, String>();

		/**/

		myMapObj.put("rollNum", "101");// This will store the data in the form of key value pairs. Here Map<K, V>
		myMapObj.put("stdName", "Ajay");
		myMapObj.put("SurName", "Reddy");
		System.out.println(myMapObj);
		

		printSomeSpace();

		myMapObj.put("empSalary", "30000"); //
		myMapObj.put("empName", "Kumar");
		System.out.println(myMapObj);

		System.out.println(myMapObj.equals(myMapObj));

		System.out.println(myMapObj.containsKey("edepartment"));// This will return true of the key exists in the
																// hashmap obj if not returns false.

		System.out.println(myMapObj.get("empId")); // this will return the value of the key passed as an argument
		System.out.println(myMapObj.get("invalid_Key")); // null means there is no such key in the hashmap object

		System.out.println(myMapObj.containsValue("101"));
		
		printSomeSpace();
		
		//System.out.println(myMapObj.keySet());
		
		myMapObj.forEach((key, value) -> {
			System.out.println(key+":"+value);});
		
		Map<String, String> myNewObj = new HashMap<String, String>();

		/**/

		myNewObj.put("stdExam", "English");// This will store the data in the form of key value pairs. Here Map<K, V>
		myNewObj.put("stdFee", "1000");
		myNewObj.put("stdRank", "1");
		System.out.println(myNewObj);
		
		printSomeSpace();
		
		myMapObj.putAll(myNewObj);
		myMapObj.forEach((key, value) -> {
			System.out.println(key+":"+value);});
		
		
	}

	private static void printSomeSpace() {
		System.out.println();
		System.out.println("*********************");
		System.out.println();
	}

}
