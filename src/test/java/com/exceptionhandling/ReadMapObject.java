package com.exceptionhandling;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class ReadMapObject {
	@Test
	public void firstTestCase() {

		try {
			Map<String, String> mapObject = new HashMap<String, String>();

			mapObject.put("employeeId", "101");
			mapObject.put("employeeName", "Ajay");
			mapObject.put("employeeDesignation", "Tester");
			mapObject.put("employeeSal", "25000");
//			mapObject.put("employeeDepartment", "IT");

			System.out.println(mapObject);
			System.out.println(mapObject.keySet());
			
			Object objEmpName = mapObject.get("employeeName");
			System.out.println("objEmpName hasCode:  "+objEmpName.hashCode());
			
			Object obj = mapObject.get("employeeDepartment");
			
			
			obj.hashCode();
		} catch (NullPointerException e) {
			throw new NullPointerException("Please check employeeDepartment data is available in your Map object");
		}
		
		
		
		

	}
}
