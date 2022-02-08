package com.oops.collections;

import java.util.HashMap;
import java.util.Map;

public class PracticeHashMapCollection {

	public static void main(String[] args) {
		Map<String, String> myPracticeMapObj = new HashMap<String, String>();

		myPracticeMapObj.put("Student Name", "Ajay");
		myPracticeMapObj.put("Class", "9th Class");
		myPracticeMapObj.put("School Name ", "Darwin High School");
		myPracticeMapObj.put("Student Fee", "15000");
		myPracticeMapObj.put("Rank", "A Grade");

		System.out.println(myPracticeMapObj);

		myPracticeMapObj.put("Class", "10th Class");

		System.out.println(myPracticeMapObj);

		System.out.println(" ****** ");
		System.out.println(myPracticeMapObj.containsKey("Rank"));
		// **
		System.out.println(myPracticeMapObj.containsValue("AJAY")); // **Upper case// it returns False

		myPracticeMapObj.forEach((key, value) -> {
			System.out.println(key + ":" + value);
		});

		Map<String, String> myPracticeMapObj1 = new HashMap<String, String>();

		myPracticeMapObj1.put("Marks", "500");
		myPracticeMapObj1.put("Examfee", "500");
		myPracticeMapObj1.put("Game", "Cricket");

		System.out.println(myPracticeMapObj1);

		myPracticeMapObj.putAll(myPracticeMapObj1);

		System.out.println(myPracticeMapObj);
		myPracticeMapObj.forEach((key, value) -> {
			System.out.println(key + ":" + value);
		});
 
		System.out.println();

		myPracticeMapObj1.replace("Marks", "600");

		System.out.println(myPracticeMapObj1);

		System.out.println("Key Count :" + myPracticeMapObj1.size());

		System.out.println(myPracticeMapObj1.isEmpty());

		System.out.println(myPracticeMapObj1.get("Marks")); 

	}

}
